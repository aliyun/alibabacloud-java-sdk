// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribePeakTrendResponseBody extends TeaModel {
    @NameInMap("FlowChart")
    public java.util.List<DescribePeakTrendResponseBodyFlowChart> flowChart;

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
        @NameInMap("AclSum")
        public Long aclSum;

        @NameInMap("AntiScanSum")
        public Long antiScanSum;

        @NameInMap("CcSum")
        public Long ccSum;

        @NameInMap("Count")
        public Long count;

        @NameInMap("Index")
        public Long index;

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
