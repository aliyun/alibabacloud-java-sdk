// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribePeakTrendResponseBody extends TeaModel {
    /**
     * <p>The QPS statistics of WAF.</p>
     */
    @NameInMap("FlowChart")
    public java.util.List<DescribePeakTrendResponseBodyFlowChart> flowChart;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9D11AC3A-A10C-56E7-A342-E87EC892BAE2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePeakTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePeakTrendResponseBody self = new DescribePeakTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePeakTrendResponseBody setFlowChart(java.util.List<DescribePeakTrendResponseBodyFlowChart> flowChart) {
        this.flowChart = flowChart;
        return this;
    }
    public java.util.List<DescribePeakTrendResponseBodyFlowChart> getFlowChart() {
        return this.flowChart;
    }

    public DescribePeakTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePeakTrendResponseBodyFlowChart extends TeaModel {
        /**
         * <p>The number of requests protected by the ACL module. This includes requests that are monitored and blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AclSum")
        public Long aclSum;

        /**
         * <p>The number of requests protected by the scan protection module. This includes requests that are monitored and blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AntiScanSum")
        public Long antiScanSum;

        /**
         * <p>The number of requests protected by the CC protection module. This includes requests that are monitored and blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CcSum")
        public Long ccSum;

        /**
         * <p>The total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>2622</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The ordinal number for the time point, sorted in chronological order.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>The number of requests protected by the web attack protection module. This includes requests that are monitored and blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WafSum")
        public Long wafSum;

        public static DescribePeakTrendResponseBodyFlowChart build(java.util.Map<String, ?> map) throws Exception {
            DescribePeakTrendResponseBodyFlowChart self = new DescribePeakTrendResponseBodyFlowChart();
            return TeaModel.build(map, self);
        }

        public DescribePeakTrendResponseBodyFlowChart setAclSum(Long aclSum) {
            this.aclSum = aclSum;
            return this;
        }
        public Long getAclSum() {
            return this.aclSum;
        }

        public DescribePeakTrendResponseBodyFlowChart setAntiScanSum(Long antiScanSum) {
            this.antiScanSum = antiScanSum;
            return this;
        }
        public Long getAntiScanSum() {
            return this.antiScanSum;
        }

        public DescribePeakTrendResponseBodyFlowChart setCcSum(Long ccSum) {
            this.ccSum = ccSum;
            return this;
        }
        public Long getCcSum() {
            return this.ccSum;
        }

        public DescribePeakTrendResponseBodyFlowChart setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribePeakTrendResponseBodyFlowChart setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribePeakTrendResponseBodyFlowChart setWafSum(Long wafSum) {
            this.wafSum = wafSum;
            return this;
        }
        public Long getWafSum() {
            return this.wafSum;
        }

    }

}
