<%@ page import="com.springdemo.library.Library" %>



<div class="fieldcontain ${hasErrors(bean: libraryInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="library.address.label" default="Address" />
		
	</label>
	<g:textField name="address" value="${libraryInstance?.address}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: libraryInstance, field: 'books', 'error')} ">
	<label for="books">
		<g:message code="library.books.label" default="Books" />
		
	</label>
	<g:select name="books" from="${com.springdemo.library.Book.list()}" multiple="multiple" optionKey="id" size="5" value="${libraryInstance?.books*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: libraryInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="library.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${libraryInstance?.name}"/>
</div>

