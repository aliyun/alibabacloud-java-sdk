// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class VerifyCheckResultResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public VerifyCheckResultResponseBodyData data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
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
         * <br>
         * <p>*   **Throttling**: frequency limit</p>
         * <p>*   **ActionTrialUnauthorized**: an error that is related to unauthorized operations</p>
         */
        @NameInMap("OperateCode")
        public String operateCode;

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

    }

}
