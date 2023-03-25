// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class VerifyCheckInstanceResultResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public VerifyCheckInstanceResultResponseBodyData data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyCheckInstanceResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyCheckInstanceResultResponseBody self = new VerifyCheckInstanceResultResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyCheckInstanceResultResponseBody setData(VerifyCheckInstanceResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyCheckInstanceResultResponseBodyData getData() {
        return this.data;
    }

    public VerifyCheckInstanceResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class VerifyCheckInstanceResultResponseBodyData extends TeaModel {
        /**
         * <p>An array consisting of instances that failed the check.</p>
         */
        @NameInMap("FailInstances")
        public java.util.List<String> failInstances;

        /**
         * <p>The operation code of the task that checks the configurations of cloud services. Valid values:</p>
         * <br>
         * <p>*   **Throttling**</p>
         * <p>*   **ActionTrialUnauthorized**</p>
         */
        @NameInMap("OperateCode")
        public String operateCode;

        public static VerifyCheckInstanceResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyCheckInstanceResultResponseBodyData self = new VerifyCheckInstanceResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyCheckInstanceResultResponseBodyData setFailInstances(java.util.List<String> failInstances) {
            this.failInstances = failInstances;
            return this;
        }
        public java.util.List<String> getFailInstances() {
            return this.failInstances;
        }

        public VerifyCheckInstanceResultResponseBodyData setOperateCode(String operateCode) {
            this.operateCode = operateCode;
            return this;
        }
        public String getOperateCode() {
            return this.operateCode;
        }

    }

}
