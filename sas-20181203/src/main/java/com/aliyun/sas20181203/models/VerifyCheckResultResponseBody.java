// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class VerifyCheckResultResponseBody extends TeaModel {
    @NameInMap("Data")
    public VerifyCheckResultResponseBodyData data;

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
