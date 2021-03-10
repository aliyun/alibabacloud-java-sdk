// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ConsumeMediaResourcePackageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ConsumeMediaResourcePackageResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public String success;

    public static ConsumeMediaResourcePackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConsumeMediaResourcePackageResponseBody self = new ConsumeMediaResourcePackageResponseBody();
        return TeaModel.build(map, self);
    }

    public ConsumeMediaResourcePackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConsumeMediaResourcePackageResponseBody setData(ConsumeMediaResourcePackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConsumeMediaResourcePackageResponseBodyData getData() {
        return this.data;
    }

    public ConsumeMediaResourcePackageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ConsumeMediaResourcePackageResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ConsumeMediaResourcePackageResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        public static ConsumeMediaResourcePackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConsumeMediaResourcePackageResponseBodyData self = new ConsumeMediaResourcePackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConsumeMediaResourcePackageResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
