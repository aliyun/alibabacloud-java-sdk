// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectApiInvokeInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetFileDetectApiInvokeInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetFileDetectApiInvokeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFileDetectApiInvokeInfoResponseBody self = new GetFileDetectApiInvokeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFileDetectApiInvokeInfoResponseBody setData(GetFileDetectApiInvokeInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFileDetectApiInvokeInfoResponseBodyData getData() {
        return this.data;
    }

    public GetFileDetectApiInvokeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFileDetectApiInvokeInfoResponseBodyData extends TeaModel {
        @NameInMap("AuthCount")
        public Long authCount;

        @NameInMap("Expire")
        public Long expire;

        @NameInMap("FlowRate")
        public Integer flowRate;

        @NameInMap("RemainAuthCount")
        public Long remainAuthCount;

        @NameInMap("SaleVersion")
        public Integer saleVersion;

        @NameInMap("TimeUnit")
        public String timeUnit;

        public static GetFileDetectApiInvokeInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFileDetectApiInvokeInfoResponseBodyData self = new GetFileDetectApiInvokeInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFileDetectApiInvokeInfoResponseBodyData setAuthCount(Long authCount) {
            this.authCount = authCount;
            return this;
        }
        public Long getAuthCount() {
            return this.authCount;
        }

        public GetFileDetectApiInvokeInfoResponseBodyData setExpire(Long expire) {
            this.expire = expire;
            return this;
        }
        public Long getExpire() {
            return this.expire;
        }

        public GetFileDetectApiInvokeInfoResponseBodyData setFlowRate(Integer flowRate) {
            this.flowRate = flowRate;
            return this;
        }
        public Integer getFlowRate() {
            return this.flowRate;
        }

        public GetFileDetectApiInvokeInfoResponseBodyData setRemainAuthCount(Long remainAuthCount) {
            this.remainAuthCount = remainAuthCount;
            return this;
        }
        public Long getRemainAuthCount() {
            return this.remainAuthCount;
        }

        public GetFileDetectApiInvokeInfoResponseBodyData setSaleVersion(Integer saleVersion) {
            this.saleVersion = saleVersion;
            return this;
        }
        public Integer getSaleVersion() {
            return this.saleVersion;
        }

        public GetFileDetectApiInvokeInfoResponseBodyData setTimeUnit(String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }
        public String getTimeUnit() {
            return this.timeUnit;
        }

    }

}
