<%@ page import="com.springdemo.library.Author" %>



<div class="fieldcontain ${hasErrors(bean: authorInstance, field: 'book', 'error')} required">
	<label for="book">
		<g:message code="author.book.label" default="Book" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="book" name="book.id" from="${com.springdemo.library.Book.list()}" optionKey="id" required="" value="${authorInstance?.book?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: authorInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="author.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${authorInstance?.name}"/>
</div>

