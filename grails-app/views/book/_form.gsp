<%@ page import="com.springdemo.library.Book" %>



<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'authors', 'error')} ">
	<label for="authors">
		<g:message code="book.authors.label" default="Authors" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${bookInstance?.authors?}" var="a">
    <li><g:link controller="author" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="author" action="create" params="['book.id': bookInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'author.label', default: 'Author')])}</g:link>
</li>
</ul>

</div>

<div class="fieldcontain ${hasErrors(bean: bookInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="book.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${bookInstance?.name}"/>
</div>

