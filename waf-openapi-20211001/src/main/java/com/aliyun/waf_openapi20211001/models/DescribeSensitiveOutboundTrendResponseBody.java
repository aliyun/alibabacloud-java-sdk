// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveOutboundTrendResponseBody extends TeaModel {
    /**
     * <p>The information records involved in cross-border data transfer.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeSensitiveOutboundTrendResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C1823E96-EF4B-5BD2-9E02-1D18****3ED8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSensitiveOutboundTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveOutboundTrendResponseBody self = new DescribeSensitiveOutboundTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveOutboundTrendResponseBody setData(java.util.List<DescribeSensitiveOutboundTrendResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSensitiveOutboundTrendResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSensitiveOutboundTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSensitiveOutboundTrendResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSensitiveOutboundTrendResponseBodyData extends TeaModel {
        /**
         * <p>The total number of personal information records.</p>
         * 
         * <strong>example:</strong>
         * <p>672</p>
         */
        @NameInMap("InfoCount")
        public Long infoCount;

        /**
         * <p>The total number of personal information records involved in cross-border data transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>541</p>
         */
        @NameInMap("InfoOutboundCount")
        public Long infoOutboundCount;

        /**
         * <p>The total number of sensitive information records involved in cross-border data transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>378</p>
         */
        @NameInMap("SensitiveOutboundCount")
        public Long sensitiveOutboundCount;

        /**
         * <p>The time of cross-border data transfer. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1672502400</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static DescribeSensitiveOutboundTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSensitiveOutboundTrendResponseBodyData self = new DescribeSensitiveOutboundTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSensitiveOutboundTrendResponseBodyData setInfoCount(Long infoCount) {
            this.infoCount = infoCount;
            return this;
        }
        public Long getInfoCount() {
            return this.infoCount;
        }

        public DescribeSensitiveOutboundTrendResponseBodyData setInfoOutboundCount(Long infoOutboundCount) {
            this.infoOutboundCount = infoOutboundCount;
            return this;
        }
        public Long getInfoOutboundCount() {
            return this.infoOutboundCount;
        }

        public DescribeSensitiveOutboundTrendResponseBodyData setSensitiveOutboundCount(Long sensitiveOutboundCount) {
            this.sensitiveOutboundCount = sensitiveOutboundCount;
            return this;
        }
        public Long getSensitiveOutboundCount() {
            return this.sensitiveOutboundCount;
        }

        public DescribeSensitiveOutboundTrendResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
