// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class VerifyCheckResultResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public VerifyCheckResultResponseBodyData data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>7C0A3FA0-AA32-5660-8989-85A5582F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyCheckResultResponseBody self = new VerifyCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyCheckResultResponseBody setData(VerifyCheckResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyCheckResultResponseBodyData getData() {
        return this.data;
    }

    public VerifyCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VerifyCheckResultResponseBodyData extends TeaModel {
        /**
         * <p>The operation code of the cloud service configuration task. Valid values:</p>
         * <ul>
         * <li><strong>Throttling</strong>: frequency limit</li>
         * <li><strong>ActionTrialUnauthorized</strong>: an error that is related to unauthorized operations</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Throttling</p>
         */
        @NameInMap("OperateCode")
        public String operateCode;

        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The throttling duration. Unit: seconds</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("ThrottlingTimeSecond")
        public Integer throttlingTimeSecond;

        public static VerifyCheckResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyCheckResultResponseBodyData self = new VerifyCheckResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyCheckResultResponseBodyData setOperateCode(String operateCode) {
            this.operateCode = operateCode;
            return this;
        }
        public String getOperateCode() {
            return this.operateCode;
        }

        public VerifyCheckResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public VerifyCheckResultResponseBodyData setThrottlingTimeSecond(Integer throttlingTimeSecond) {
            this.throttlingTimeSecond = throttlingTimeSecond;
            return this;
        }
        public Integer getThrottlingTimeSecond() {
            return this.throttlingTimeSecond;
        }

    }

}
