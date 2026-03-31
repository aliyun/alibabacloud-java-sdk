// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeSensitiveOutboundDistributionResponseBody extends TeaModel {
    /**
     * <p>The traffic distribution of personal information records involved in cross-border data transfer.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeSensitiveOutboundDistributionResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSensitiveOutboundDistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSensitiveOutboundDistributionResponseBody self = new DescribeSensitiveOutboundDistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSensitiveOutboundDistributionResponseBody setData(java.util.List<DescribeSensitiveOutboundDistributionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeSensitiveOutboundDistributionResponseBodyData> getData() {
        return this.data;
    }

    public DescribeSensitiveOutboundDistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSensitiveOutboundDistributionResponseBodyData extends TeaModel {
        /**
         * <p>The country to which the data is transferred.</p>
         * 
         * <strong>example:</strong>
         * <p>US</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <p>The number of personal information records involved in cross-border data transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>213</p>
         */
        @NameInMap("InfoOutboundCount")
        public Long infoOutboundCount;

        /**
         * <p>The number of sensitive information records involved in cross-border data transfer.</p>
         * 
         * <strong>example:</strong>
         * <p>144</p>
         */
        @NameInMap("SensitiveOutboundCount")
        public Long sensitiveOutboundCount;

        public static DescribeSensitiveOutboundDistributionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSensitiveOutboundDistributionResponseBodyData self = new DescribeSensitiveOutboundDistributionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSensitiveOutboundDistributionResponseBodyData setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public DescribeSensitiveOutboundDistributionResponseBodyData setInfoOutboundCount(Long infoOutboundCount) {
            this.infoOutboundCount = infoOutboundCount;
            return this;
        }
        public Long getInfoOutboundCount() {
            return this.infoOutboundCount;
        }

        public DescribeSensitiveOutboundDistributionResponseBodyData setSensitiveOutboundCount(Long sensitiveOutboundCount) {
            this.sensitiveOutboundCount = sensitiveOutboundCount;
            return this;
        }
        public Long getSensitiveOutboundCount() {
            return this.sensitiveOutboundCount;
        }

    }

}
