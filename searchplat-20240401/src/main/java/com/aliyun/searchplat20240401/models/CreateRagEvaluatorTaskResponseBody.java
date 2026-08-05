// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240401.models;

import com.aliyun.tea.*;

public class CreateRagEvaluatorTaskResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>not found</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;xx not found&quot;</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0abb793917165176014887584e28d9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public CreateRagEvaluatorTaskResponseBodyResult result;

    public static CreateRagEvaluatorTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRagEvaluatorTaskResponseBody self = new CreateRagEvaluatorTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRagEvaluatorTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateRagEvaluatorTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateRagEvaluatorTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRagEvaluatorTaskResponseBody setResult(CreateRagEvaluatorTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateRagEvaluatorTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateRagEvaluatorTaskResponseBodyResult extends TeaModel {
        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1846389386674049024</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static CreateRagEvaluatorTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateRagEvaluatorTaskResponseBodyResult self = new CreateRagEvaluatorTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateRagEvaluatorTaskResponseBodyResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
