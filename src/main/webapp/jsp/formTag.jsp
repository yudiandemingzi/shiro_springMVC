<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<body>

    <form:form modelAttribute="userModel" method="post">     
        
          input 标签：  <form:input path="username"/><br/>
       password 标签：  <form:password path="password"/><br/>
       
        绑定boolean的checkbox标签：<br/>
        <form:checkbox path="testBoolean"/><br/>
        
        绑定Array的checkbox 标签：<br/>
        <form:checkbox path="testArray" value="唱歌"/>唱歌
        <form:checkbox path="testArray" value="跳舞"/>跳舞
        <form:checkbox path="testArray" value="画画"/>画画
        <form:checkbox path="testArray" value="武术"/>武术<br/>
        
        绑定Array的checkboxs标签：<br/>
        <form:checkboxes path="selectArray" items="${userModel.testArray}"/><br/>
        
        绑定Map的checkboxs 标签：<br/>
        <form:checkboxes path="selectIds" items="${userModel.testMap}"/><br/>
        
        绑定Integer的radio 标签：<br/>
        <form:radiobutton path="radioId" value="0"/>0
        <form:radiobutton path="radioId" value="1"/>1
        <form:radiobutton path="radioId" value="2"/>2<br/>
        绑定Map的radiobuttons 标签：<br/>
        <form:radiobuttons path="selectId" items="${userModel.testMap}"/><br/>
        绑定Map的select 标签：<br/>
        <form:select path="selectId" items="${userModel.testMap}"/><br/>
        不绑定items数据直接在form:option添加的select 标签：<br/>
        <form:select path="selectId">  
           <option>请选择人员</option>
           <form:option value="1">小</form:option>
           <form:option value="2">中</form:option>
           <form:option value="3">大</form:option>
        </form:select><br/>
        不绑定items数据直接在html的option添加的select 标签：<br/>
        <form:select path="selectId">  
           <option>请选择人员</option> 
           <option value="1">小</option>
           <option value="2">中</option>
           <option value="3">大</option>  
        </form:select><br/>
        用form:option绑定items的select 标签：<br/>
        <form:select path="selectId">  
            <option/>请选择人员
            <form:options items="${userModel.testMap}"/>  
        </form:select><br/>
        textarea 标签：
        <form:textarea path="remark"/><br/>

        <input type="submit" value="Submit" />
        
    </form:form>  
</body>
</html>