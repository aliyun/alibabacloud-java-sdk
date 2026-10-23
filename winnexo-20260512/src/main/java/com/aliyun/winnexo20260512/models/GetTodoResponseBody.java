// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetTodoResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The single result returned when you query by todoId. This field is empty for other query types. The field set is the same as the flattened structure of getTodoDetail.</p>
     * 
     * <strong>example:</strong>
     * <p>Sample to-do key-value pair</p>
     */
    @NameInMap("todo")
    public java.util.Map<String, ?> todo;

    /**
     * <p>The multiple results returned when you query by workItemId or messageId. This field is empty for todoId queries.</p>
     */
    @NameInMap("todos")
    public java.util.List<GetTodoResponseBodyTodos> todos;

    public static GetTodoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTodoResponseBody self = new GetTodoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTodoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTodoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTodoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTodoResponseBody setTodo(java.util.Map<String, ?> todo) {
        this.todo = todo;
        return this;
    }
    public java.util.Map<String, ?> getTodo() {
        return this.todo;
    }

    public GetTodoResponseBody setTodos(java.util.List<GetTodoResponseBodyTodos> todos) {
        this.todos = todos;
        return this;
    }
    public java.util.List<GetTodoResponseBodyTodos> getTodos() {
        return this.todos;
    }

    public static class GetTodoResponseBodyTodosAssignees extends TeaModel {
        /**
         * <p>The processing time in UTC+8. This field is empty if the item is unprocessed.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T10:30:00+08:00</p>
         */
        @NameInMap("actedAt")
        public String actedAt;

        /**
         * <p>The source of the assignee. Valid values: ORIGINAL and TRANSFERRED.</p>
         * 
         * <strong>example:</strong>
         * <p>ORIGINAL</p>
         */
        @NameInMap("assigneeSource")
        public String assigneeSource;

        /**
         * <p>The user ID of the assignee.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("assigneeUserId")
        public String assigneeUserId;

        /**
         * <p>The read time in UTC+8. This field is empty if the item is unread.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:01:00</p>
         */
        @NameInMap("readAt")
        public String readAt;

        /**
         * <p>The action status of the assignee.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The user ID of the person who transferred the task. This field is populated only when the task is transferred.</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("transferredFromUserId")
        public String transferredFromUserId;

        public static GetTodoResponseBodyTodosAssignees build(java.util.Map<String, ?> map) throws Exception {
            GetTodoResponseBodyTodosAssignees self = new GetTodoResponseBodyTodosAssignees();
            return TeaModel.build(map, self);
        }

        public GetTodoResponseBodyTodosAssignees setActedAt(String actedAt) {
            this.actedAt = actedAt;
            return this;
        }
        public String getActedAt() {
            return this.actedAt;
        }

        public GetTodoResponseBodyTodosAssignees setAssigneeSource(String assigneeSource) {
            this.assigneeSource = assigneeSource;
            return this;
        }
        public String getAssigneeSource() {
            return this.assigneeSource;
        }

        public GetTodoResponseBodyTodosAssignees setAssigneeUserId(String assigneeUserId) {
            this.assigneeUserId = assigneeUserId;
            return this;
        }
        public String getAssigneeUserId() {
            return this.assigneeUserId;
        }

        public GetTodoResponseBodyTodosAssignees setReadAt(String readAt) {
            this.readAt = readAt;
            return this;
        }
        public String getReadAt() {
            return this.readAt;
        }

        public GetTodoResponseBodyTodosAssignees setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTodoResponseBodyTodosAssignees setTransferredFromUserId(String transferredFromUserId) {
            this.transferredFromUserId = transferredFromUserId;
            return this;
        }
        public String getTransferredFromUserId() {
            return this.transferredFromUserId;
        }

    }

    public static class GetTodoResponseBodyTodos extends TeaModel {
        /**
         * <p>The assignees.</p>
         */
        @NameInMap("assignees")
        public java.util.List<GetTodoResponseBodyTodosAssignees> assignees;

        /**
         * <p>The completion time in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:00:00</p>
         */
        @NameInMap("completedAt")
        public String completedAt;

        /**
         * <p>The user ID of the person who completed the to-do item.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("completedByUserId")
        public String completedByUserId;

        /**
         * <p>The creation time in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time in UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the assistant message. This field is empty if there is no conversation source.</p>
         * 
         * <strong>example:</strong>
         * <p>msg-1</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>MEDIUM</p>
         */
        @NameInMap("priority")
        public String priority;

        /**
         * <p>The list of questions in the original JSONB format.</p>
         * 
         * <strong>example:</strong>
         * <p>q1=Sample question</p>
         */
        @NameInMap("questions")
        public java.util.Map<String, ?> questions;

        /**
         * <p>The response content in the original JSONB format.</p>
         * 
         * <strong>example:</strong>
         * <p>result=Approved</p>
         */
        @NameInMap("resultPayload")
        public java.util.Map<String, ?> resultPayload;

        /**
         * <p>The source context passed through in its original format.</p>
         * 
         * <strong>example:</strong>
         * <p>source=openapi</p>
         */
        @NameInMap("sourceContext")
        public java.util.Map<String, ?> sourceContext;

        /**
         * <p>The primary status of the to-do item.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The summary of the to-do item.</p>
         * 
         * <strong>example:</strong>
         * <p>To-do item summary</p>
         */
        @NameInMap("summary")
        public String summary;

        /**
         * <p>The title of the to-do item.</p>
         * 
         * <strong>example:</strong>
         * <p>Governance approval</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The ID of the to-do item.</p>
         * 
         * <strong>example:</strong>
         * <p>todo_abc123</p>
         */
        @NameInMap("todoId")
        public String todoId;

        public static GetTodoResponseBodyTodos build(java.util.Map<String, ?> map) throws Exception {
            GetTodoResponseBodyTodos self = new GetTodoResponseBodyTodos();
            return TeaModel.build(map, self);
        }

        public GetTodoResponseBodyTodos setAssignees(java.util.List<GetTodoResponseBodyTodosAssignees> assignees) {
            this.assignees = assignees;
            return this;
        }
        public java.util.List<GetTodoResponseBodyTodosAssignees> getAssignees() {
            return this.assignees;
        }

        public GetTodoResponseBodyTodos setCompletedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public String getCompletedAt() {
            return this.completedAt;
        }

        public GetTodoResponseBodyTodos setCompletedByUserId(String completedByUserId) {
            this.completedByUserId = completedByUserId;
            return this;
        }
        public String getCompletedByUserId() {
            return this.completedByUserId;
        }

        public GetTodoResponseBodyTodos setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTodoResponseBodyTodos setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetTodoResponseBodyTodos setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public GetTodoResponseBodyTodos setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public GetTodoResponseBodyTodos setQuestions(java.util.Map<String, ?> questions) {
            this.questions = questions;
            return this;
        }
        public java.util.Map<String, ?> getQuestions() {
            return this.questions;
        }

        public GetTodoResponseBodyTodos setResultPayload(java.util.Map<String, ?> resultPayload) {
            this.resultPayload = resultPayload;
            return this;
        }
        public java.util.Map<String, ?> getResultPayload() {
            return this.resultPayload;
        }

        public GetTodoResponseBodyTodos setSourceContext(java.util.Map<String, ?> sourceContext) {
            this.sourceContext = sourceContext;
            return this;
        }
        public java.util.Map<String, ?> getSourceContext() {
            return this.sourceContext;
        }

        public GetTodoResponseBodyTodos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTodoResponseBodyTodos setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetTodoResponseBodyTodos setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetTodoResponseBodyTodos setTodoId(String todoId) {
            this.todoId = todoId;
            return this;
        }
        public String getTodoId() {
            return this.todoId;
        }

    }

}
