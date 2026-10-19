// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SubmitTodoResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>完成时间（ISO8601 UTC；与其他北京时间格式化字段格式不同）</p>
     * 
     * <strong>example:</strong>
     * <p>2026-10-12T02:00:00+00:00</p>
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
     * <p>提交后状态（恒为 COMPLETED）</p>
     * 
     * <strong>example:</strong>
     * <p>COMPLETED</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>待办ID</p>
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
