// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class SubmitVideoDetectShotTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public SubmitVideoDetectShotTaskResponseBodyData data;

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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>117F5ABE-CF02-5502-9A3F-E56BC9081A64</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static SubmitVideoDetectShotTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoDetectShotTaskResponseBody self = new SubmitVideoDetectShotTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVideoDetectShotTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitVideoDetectShotTaskResponseBody setData(SubmitVideoDetectShotTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitVideoDetectShotTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitVideoDetectShotTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitVideoDetectShotTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitVideoDetectShotTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitVideoDetectShotTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitVideoDetectShotTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>22ec888712de45b39b97983f8d166831</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static SubmitVideoDetectShotTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoDetectShotTaskResponseBodyData self = new SubmitVideoDetectShotTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitVideoDetectShotTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
