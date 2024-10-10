// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class GetMailTaskStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>38C0FEC8-1510-415C-A9F1-9AE9422BDB65</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetMailTaskStatusResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMailTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMailTaskStatusResponseBody self = new GetMailTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMailTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMailTaskStatusResponseBody setResult(java.util.List<GetMailTaskStatusResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetMailTaskStatusResponseBodyResult> getResult() {
        return this.result;
    }

    public GetMailTaskStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMailTaskStatusResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-10-09 17:34:11</p>
         */
        @NameInMap("execTime")
        public String execTime;

        /**
         * <strong>example:</strong>
         * <p>c38f73f4c5xxxxxc808c41b3f4d23b7852</p>
         */
        @NameInMap("mailId")
        public String mailId;

        /**
         * <strong>example:</strong>
         * <p>SENT</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1282xxx610816</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        public static GetMailTaskStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMailTaskStatusResponseBodyResult self = new GetMailTaskStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMailTaskStatusResponseBodyResult setExecTime(String execTime) {
            this.execTime = execTime;
            return this;
        }
        public String getExecTime() {
            return this.execTime;
        }

        public GetMailTaskStatusResponseBodyResult setMailId(String mailId) {
            this.mailId = mailId;
            return this;
        }
        public String getMailId() {
            return this.mailId;
        }

        public GetMailTaskStatusResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMailTaskStatusResponseBodyResult setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
