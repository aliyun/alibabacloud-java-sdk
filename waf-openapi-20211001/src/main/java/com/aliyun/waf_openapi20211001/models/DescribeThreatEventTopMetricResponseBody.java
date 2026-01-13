// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeThreatEventTopMetricResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12EF3845-CCEB-4B84-AE60-2B49B*****EE5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TopMetrics")
    public java.util.List<DescribeThreatEventTopMetricResponseBodyTopMetrics> topMetrics;

    public static DescribeThreatEventTopMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeThreatEventTopMetricResponseBody self = new DescribeThreatEventTopMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeThreatEventTopMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeThreatEventTopMetricResponseBody setTopMetrics(java.util.List<DescribeThreatEventTopMetricResponseBodyTopMetrics> topMetrics) {
        this.topMetrics = topMetrics;
        return this;
    }
    public java.util.List<DescribeThreatEventTopMetricResponseBodyTopMetrics> getTopMetrics() {
        return this.topMetrics;
    }

    public static class DescribeThreatEventTopMetricResponseBodyTopMetrics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Cnt")
        public Long cnt;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>115.28.209.212</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeThreatEventTopMetricResponseBodyTopMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribeThreatEventTopMetricResponseBodyTopMetrics self = new DescribeThreatEventTopMetricResponseBodyTopMetrics();
            return TeaModel.build(map, self);
        }

        public DescribeThreatEventTopMetricResponseBodyTopMetrics setCnt(Long cnt) {
            this.cnt = cnt;
            return this;
        }
        public Long getCnt() {
            return this.cnt;
        }

        public DescribeThreatEventTopMetricResponseBodyTopMetrics setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public DescribeThreatEventTopMetricResponseBodyTopMetrics setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeThreatEventTopMetricResponseBodyTopMetrics setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
