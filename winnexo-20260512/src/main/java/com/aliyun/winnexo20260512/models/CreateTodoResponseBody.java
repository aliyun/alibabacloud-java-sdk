// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateTodoResponseBody extends TeaModel {
    /**
     * <p>The list of assignees.</p>
     */
    @NameInMap("assignees")
    public java.util.List<CreateTodoResponseBodyAssignees> assignees;

    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The creation time in ISO 8601 format with a time zone. This format differs from the UTC+8 format string used in the list and details.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-12T15:00:00+08:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The status of the to-do item.</p>
     * 
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The ID of the created to-do item.</p>
     * 
     * <strong>example:</strong>
     * <p>todo_abc123</p>
     */
    @NameInMap("todoId")
    public String todoId;

    public static CreateTodoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTodoResponseBody self = new CreateTodoResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTodoResponseBody setAssignees(java.util.List<CreateTodoResponseBodyAssignees> assignees) {
        this.assignees = assignees;
        return this;
    }
    public java.util.List<CreateTodoResponseBodyAssignees> getAssignees() {
        return this.assignees;
    }

    public CreateTodoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTodoResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public CreateTodoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTodoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTodoResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateTodoResponseBody setTodoId(String todoId) {
        this.todoId = todoId;
        return this;
    }
    public String getTodoId() {
        return this.todoId;
    }

    public static class CreateTodoResponseBodyAssignees extends TeaModel {
        /**
         * <p>The user ID of the assignee.</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("assigneeUserId")
        public String assigneeUserId;

        /**
         * <p>The processing status of the assignee.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("status")
        public String status;

        public static CreateTodoResponseBodyAssignees build(java.util.Map<String, ?> map) throws Exception {
            CreateTodoResponseBodyAssignees self = new CreateTodoResponseBodyAssignees();
            return TeaModel.build(map, self);
        }

        public CreateTodoResponseBodyAssignees setAssigneeUserId(String assigneeUserId) {
            this.assigneeUserId = assigneeUserId;
            return this;
        }
        public String getAssigneeUserId() {
            return this.assigneeUserId;
        }

        public CreateTodoResponseBodyAssignees setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
