// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeThreatEventTopMetricResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12EF3845-CCEB-4B84-AE60-2B49B*****EE5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of statistics.</p>
     */
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
         * <p>The number of attacks.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Cnt")
        public Long cnt;

        /**
         * <p>The country to which the source IP address of the attack belongs.</p>
         * <blockquote>
         * <p>This field returns a meaningful value only when the statistical object (<strong>Metric</strong>) is set to source IP address (<strong>src</strong>).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <p>The region to which the source IP address of the attack belongs.</p>
         * <blockquote>
         * <p>This field returns a meaningful value only when the statistical object (<strong>Metric</strong>) is set to source IP address (<strong>src</strong>).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The attack value. The meaning of this field varies depending on the value of <strong>Metric</strong>.</p>
         * <ul>
         * <li>If <strong>Metric</strong> is set to <strong>time</strong>, this field indicates the attack time.</li>
         * <li>If <strong>Metric</strong> is set to <strong>src</strong>, this field indicates the source IP address of the attack.</li>
         * <li>If <strong>Metric</strong> is set to <strong>target</strong>, this field indicates the URL of the attack request.</li>
         * <li>If <strong>Metric</strong> is set to <strong>type</strong>, this field indicates the attack type. <strong>dirscan</strong> indicates directory scanning, <strong>webscan</strong> indicates web scanning, and other attack types are described in the <strong>detectType</strong> (detection type) parameter of the <strong>custom regular rule</strong> (<strong>regular_custom</strong>) in the <a href="https://help.aliyun.com/document_detail/461421.html"><strong>CreateDefenseRule</strong></a> operation.</li>
         * <li>If <strong>Metric</strong> is set to <strong>tools</strong>, this field indicates the attack tool.</li>
         * </ul>
         * 
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
