// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetTodoResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>todoId 查询时的单条结果（其余查询为空）；字段集同 getTodoDetail 平铺结构</p>
     * 
     * <strong>example:</strong>
     * <p>示例待办键值对</p>
     */
    @NameInMap("todo")
    public java.util.Map<String, ?> todo;

    /**
     * <p>workItemId/messageId 查询时的多条结果（todoId 查询为空）</p>
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
         * <p>处理时间（北京时间）；未处理为空</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-16T10:30:00+08:00</p>
         */
        @NameInMap("actedAt")
        public String actedAt;

        /**
         * <p>处理人来源：ORIGINAL/TRANSFERRED</p>
         * 
         * <strong>example:</strong>
         * <p>ORIGINAL</p>
         */
        @NameInMap("assigneeSource")
        public String assigneeSource;

        /**
         * <p>处理人用户ID</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("assigneeUserId")
        public String assigneeUserId;

        /**
         * <p>已读时间（北京时间）；未读为空</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:01:00</p>
         */
        @NameInMap("readAt")
        public String readAt;

        /**
         * <p>处理人行状态</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>转出人用户ID；仅转办产生</p>
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
         * <p>全部处理人</p>
         */
        @NameInMap("assignees")
        public java.util.List<GetTodoResponseBodyTodosAssignees> assignees;

        /**
         * <p>完成时间（北京时间）</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:00:00</p>
         */
        @NameInMap("completedAt")
        public String completedAt;

        /**
         * <p>完成人用户ID</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("completedByUserId")
        public String completedByUserId;

        /**
         * <p>创建时间（北京时间）</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:00:00</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>最后修改时间（北京时间）</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-12 10:00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>assistant 消息ID；无会话来源为空</p>
         * 
         * <strong>example:</strong>
         * <p>msg-1</p>
         */
        @NameInMap("messageId")
        public String messageId;

        /**
         * <p>优先级</p>
         * 
         * <strong>example:</strong>
         * <p>MEDIUM</p>
         */
        @NameInMap("priority")
        public String priority;

        /**
         * <p>问题清单（JSONB 原样）</p>
         * 
         * <strong>example:</strong>
         * <p>q1=示例问题</p>
         */
        @NameInMap("questions")
        public java.util.Map<String, ?> questions;

        /**
         * <p>作答内容（JSONB 原样）</p>
         * 
         * <strong>example:</strong>
         * <p>result=同意</p>
         */
        @NameInMap("resultPayload")
        public java.util.Map<String, ?> resultPayload;

        /**
         * <p>来源上下文（原样透传）</p>
         * 
         * <strong>example:</strong>
         * <p>source=openapi</p>
         */
        @NameInMap("sourceContext")
        public java.util.Map<String, ?> sourceContext;

        /**
         * <p>待办主状态</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>待办摘要</p>
         * 
         * <strong>example:</strong>
         * <p>待办事项摘要</p>
         */
        @NameInMap("summary")
        public String summary;

        /**
         * <p>待办标题</p>
         * 
         * <strong>example:</strong>
         * <p>治理审批</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>待办ID</p>
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
