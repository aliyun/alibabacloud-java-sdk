// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class TransferTodoResponseBody extends TeaModel {
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
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The processing results for each target.</p>
     */
    @NameInMap("targets")
    public java.util.List<TransferTodoResponseBodyTargets> targets;

    /**
     * <p>The ID of the to-do task.</p>
     * 
     * <strong>example:</strong>
     * <p>todo_abc123</p>
     */
    @NameInMap("todoId")
    public String todoId;

    public static TransferTodoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferTodoResponseBody self = new TransferTodoResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferTodoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TransferTodoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TransferTodoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TransferTodoResponseBody setTargets(java.util.List<TransferTodoResponseBodyTargets> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<TransferTodoResponseBodyTargets> getTargets() {
        return this.targets;
    }

    public TransferTodoResponseBody setTodoId(String todoId) {
        this.todoId = todoId;
        return this;
    }
    public String getTodoId() {
        return this.todoId;
    }

    public static class TransferTodoResponseBodyTargets extends TeaModel {
        /**
         * <p>The processing result. Valid values: CREATED, REVIVED, and ALREADY_PENDING.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATED</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <p>The ID of the target user.</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        @NameInMap("userId")
        public String userId;

        public static TransferTodoResponseBodyTargets build(java.util.Map<String, ?> map) throws Exception {
            TransferTodoResponseBodyTargets self = new TransferTodoResponseBodyTargets();
            return TeaModel.build(map, self);
        }

        public TransferTodoResponseBodyTargets setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public TransferTodoResponseBodyTargets setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
