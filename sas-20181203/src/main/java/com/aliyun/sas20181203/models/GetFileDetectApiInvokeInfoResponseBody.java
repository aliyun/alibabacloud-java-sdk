// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectApiInvokeInfoResponseBody extends TeaModel {
    /**
     * <p>Returns the response body.</p>
     */
    @NameInMap("Data")
    public GetFileDetectApiInvokeInfoResponseBodyData data;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9f368b6e-d60a-43c5-bd6f-c7087f2d****</p>
     */
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
        /**
         * <p>The total number of authorizations.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("AuthCount")
        public Long authCount;

        /**
         * <p>The timestamp of the expiration date of the authorization number.</p>
         * 
         * <strong>example:</strong>
         * <p>1815753600000</p>
         */
        @NameInMap("Expire")
        public Long expire;

        /**
         * <p>The frequency of calls.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("FlowRate")
        public Integer flowRate;

        /**
         * <p>The number of remaining authorizations.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        @NameInMap("RemainAuthCount")
        public Long remainAuthCount;

        /**
         * <p>The Authorized Version. Valid values include:</p>
         * <ul>
         * <li><strong>1:</strong> trial version</li>
         * <li><strong>2:</strong> Enterprise Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SaleVersion")
        public Integer saleVersion;

        /**
         * <p>The time unit of the frequency limit. Value:</p>
         * <ul>
         * <li><strong>SECONDS</strong></li>
         * <li><strong>MINUTES</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SECONDS</p>
         */
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
