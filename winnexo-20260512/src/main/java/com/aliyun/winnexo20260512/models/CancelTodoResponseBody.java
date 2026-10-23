// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CancelTodoResponseBody extends TeaModel {
    /**
     * <p>The number of canceled to-do items.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cancelledCount")
    public Long cancelledCount;

    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The status after cancellation.</p>
     * 
     * <strong>example:</strong>
     * <p>CANCELLED</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The ID of the canceled to-do item. This parameter is empty if the to-do item is located by workItemId.</p>
     * 
     * <strong>example:</strong>
     * <p>todo_abc123</p>
     */
    @NameInMap("todoId")
    public String todoId;

    public static CancelTodoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelTodoResponseBody self = new CancelTodoResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelTodoResponseBody setCancelledCount(Long cancelledCount) {
        this.cancelledCount = cancelledCount;
        return this;
    }
    public Long getCancelledCount() {
        return this.cancelledCount;
    }

    public CancelTodoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CancelTodoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CancelTodoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelTodoResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CancelTodoResponseBody setTodoId(String todoId) {
        this.todoId = todoId;
        return this;
    }
    public String getTodoId() {
        return this.todoId;
    }

}
