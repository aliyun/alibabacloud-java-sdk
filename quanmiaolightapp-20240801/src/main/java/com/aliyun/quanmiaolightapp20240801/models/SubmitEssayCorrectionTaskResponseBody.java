// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitEssayCorrectionTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public SubmitEssayCorrectionTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SubmitEssayCorrectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitEssayCorrectionTaskResponseBody self = new SubmitEssayCorrectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitEssayCorrectionTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitEssayCorrectionTaskResponseBody setData(SubmitEssayCorrectionTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitEssayCorrectionTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitEssayCorrectionTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitEssayCorrectionTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitEssayCorrectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitEssayCorrectionTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitEssayCorrectionTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3feb69ed02d9b1a17d0f1a942675d300</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static SubmitEssayCorrectionTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitEssayCorrectionTaskResponseBodyData self = new SubmitEssayCorrectionTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitEssayCorrectionTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
