// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFlowChartResponseBody extends TeaModel {
    @NameInMap("FlowChart")
    public java.util.List<DescribeFlowChartResponseBodyFlowChart> flowChart;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFlowChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowChartResponseBody self = new DescribeFlowChartResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowChartResponseBody setFlowChart(java.util.List<DescribeFlowChartResponseBodyFlowChart> flowChart) {
        this.flowChart = flowChart;
        return this;
    }
    public java.util.List<DescribeFlowChartResponseBodyFlowChart> getFlowChart() {
        return this.flowChart;
    }

    public DescribeFlowChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFlowChartResponseBodyFlowChart extends TeaModel {
        @NameInMap("AclCustomBlockSum")
        public Long aclCustomBlockSum;

        @NameInMap("AclCustomReportsSum")
        public Long aclCustomReportsSum;

        @NameInMap("AntiScanBlockSum")
        public Long antiScanBlockSum;

        @NameInMap("AntibotBlockSum")
        public Long antibotBlockSum;

        @NameInMap("AntibotReportSum")
        public String antibotReportSum;

        @NameInMap("AntiscanReportsSum")
        public Long antiscanReportsSum;

        @NameInMap("BlacklistBlockSum")
        public String blacklistBlockSum;

        @NameInMap("BlacklistReportsSum")
        public Long blacklistReportsSum;

        @NameInMap("CcCustomBlockSum")
        public Long ccCustomBlockSum;

        @NameInMap("CcCustomReportsSum")
        public Long ccCustomReportsSum;

        @NameInMap("CcSystemBlocksSum")
        public Long ccSystemBlocksSum;

        @NameInMap("CcSystemReportsSum")
        public Long ccSystemReportsSum;

        @NameInMap("Count")
        public Long count;

        @NameInMap("InBytes")
        public Long inBytes;

        @NameInMap("Index")
        public Long index;

        @NameInMap("MaxPv")
        public Long maxPv;

        @NameInMap("OutBytes")
        public Long outBytes;

        @NameInMap("RegionBlockBlocksSum")
        public Long regionBlockBlocksSum;

        @NameInMap("RegionBlockReportsSum")
        public Long regionBlockReportsSum;

        @NameInMap("WafBlockSum")
        public Long wafBlockSum;

        @NameInMap("WafReportSum")
        public String wafReportSum;

        public static DescribeFlowChartResponseBodyFlowChart build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlowChartResponseBodyFlowChart self = new DescribeFlowChartResponseBodyFlowChart();
            return TeaModel.build(map, self);
        }

        public DescribeFlowChartResponseBodyFlowChart setAclCustomBlockSum(Long aclCustomBlockSum) {
            this.aclCustomBlockSum = aclCustomBlockSum;
            return this;
        }
        public Long getAclCustomBlockSum() {
            return this.aclCustomBlockSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setAclCustomReportsSum(Long aclCustomReportsSum) {
            this.aclCustomReportsSum = aclCustomReportsSum;
            return this;
        }
        public Long getAclCustomReportsSum() {
            return this.aclCustomReportsSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setAntiScanBlockSum(Long antiScanBlockSum) {
            this.antiScanBlockSum = antiScanBlockSum;
            return this;
        }
        public Long getAntiScanBlockSum() {
            return this.antiScanBlockSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setAntibotBlockSum(Long antibotBlockSum) {
            this.antibotBlockSum = antibotBlockSum;
            return this;
        }
        public Long getAntibotBlockSum() {
            return this.antibotBlockSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setAntibotReportSum(String antibotReportSum) {
            this.antibotReportSum = antibotReportSum;
            return this;
        }
        public String getAntibotReportSum() {
            return this.antibotReportSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setAntiscanReportsSum(Long antiscanReportsSum) {
            this.antiscanReportsSum = antiscanReportsSum;
            return this;
        }
        public Long getAntiscanReportsSum() {
            return this.antiscanReportsSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setBlacklistBlockSum(String blacklistBlockSum) {
            this.blacklistBlockSum = blacklistBlockSum;
            return this;
        }
        public String getBlacklistBlockSum() {
            return this.blacklistBlockSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setBlacklistReportsSum(Long blacklistReportsSum) {
            this.blacklistReportsSum = blacklistReportsSum;
            return this;
        }
        public Long getBlacklistReportsSum() {
            return this.blacklistReportsSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setCcCustomBlockSum(Long ccCustomBlockSum) {
            this.ccCustomBlockSum = ccCustomBlockSum;
            return this;
        }
        public Long getCcCustomBlockSum() {
            return this.ccCustomBlockSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setCcCustomReportsSum(Long ccCustomReportsSum) {
            this.ccCustomReportsSum = ccCustomReportsSum;
            return this;
        }
        public Long getCcCustomReportsSum() {
            return this.ccCustomReportsSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setCcSystemBlocksSum(Long ccSystemBlocksSum) {
            this.ccSystemBlocksSum = ccSystemBlocksSum;
            return this;
        }
        public Long getCcSystemBlocksSum() {
            return this.ccSystemBlocksSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setCcSystemReportsSum(Long ccSystemReportsSum) {
            this.ccSystemReportsSum = ccSystemReportsSum;
            return this;
        }
        public Long getCcSystemReportsSum() {
            return this.ccSystemReportsSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeFlowChartResponseBodyFlowChart setInBytes(Long inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public Long getInBytes() {
            return this.inBytes;
        }

        public DescribeFlowChartResponseBodyFlowChart setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeFlowChartResponseBodyFlowChart setMaxPv(Long maxPv) {
            this.maxPv = maxPv;
            return this;
        }
        public Long getMaxPv() {
            return this.maxPv;
        }

        public DescribeFlowChartResponseBodyFlowChart setOutBytes(Long outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public Long getOutBytes() {
            return this.outBytes;
        }

        public DescribeFlowChartResponseBodyFlowChart setRegionBlockBlocksSum(Long regionBlockBlocksSum) {
            this.regionBlockBlocksSum = regionBlockBlocksSum;
            return this;
        }
        public Long getRegionBlockBlocksSum() {
            return this.regionBlockBlocksSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setRegionBlockReportsSum(Long regionBlockReportsSum) {
            this.regionBlockReportsSum = regionBlockReportsSum;
            return this;
        }
        public Long getRegionBlockReportsSum() {
            return this.regionBlockReportsSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setWafBlockSum(Long wafBlockSum) {
            this.wafBlockSum = wafBlockSum;
            return this;
        }
        public Long getWafBlockSum() {
            return this.wafBlockSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setWafReportSum(String wafReportSum) {
            this.wafReportSum = wafReportSum;
            return this;
        }
        public String getWafReportSum() {
            return this.wafReportSum;
        }

    }

}
