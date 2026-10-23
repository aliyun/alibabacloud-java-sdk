// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SubmitTodoResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The completion time in ISO 8601 UTC format. Note that this format differs from other time fields formatted in UTC+8.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-12T02:00:00+00:00</p>
     */
    @NameInMap("completedAt")
    public String completedAt;

    /**
     * <p>The user ID of the user who completed the item.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("completedByUserId")
    public String completedByUserId;

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
     * <p>The status after submission. This value is always COMPLETED.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The ID of the to-do item.</p>
     * 
     * <strong>example:</strong>
     * <p>todo_abc123</p>
     */
    @NameInMap("todoId")
    public String todoId;

    public static SubmitTodoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTodoResponseBody self = new SubmitTodoResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTodoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitTodoResponseBody setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    public String getCompletedAt() {
        return this.completedAt;
    }

    public SubmitTodoResponseBody setCompletedByUserId(String completedByUserId) {
        this.completedByUserId = completedByUserId;
        return this;
    }
    public String getCompletedByUserId() {
        return this.completedByUserId;
    }

    public SubmitTodoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitTodoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitTodoResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SubmitTodoResponseBody setTodoId(String todoId) {
        this.todoId = todoId;
        return this;
    }
    public String getTodoId() {
        return this.todoId;
    }

}
