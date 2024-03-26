// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeFlowChartResponseBody extends TeaModel {
    /**
     * <p>The traffic statistics.</p>
     */
    @NameInMap("FlowChart")
    public java.util.List<DescribeFlowChartResponseBodyFlowChart> flowChart;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The number of requests that are blocked by custom access control list (ACL) rules.</p>
         */
        @NameInMap("AclCustomBlockSum")
        public Long aclCustomBlockSum;

        /**
         * <p>The number of requests that are monitored by custom ACL rules.</p>
         */
        @NameInMap("AclCustomReportsSum")
        public Long aclCustomReportsSum;

        /**
         * <p>The number of requests that are blocked by scan protection rules.</p>
         */
        @NameInMap("AntiScanBlockSum")
        public Long antiScanBlockSum;

        /**
         * <p>The number of requests that are blocked by bot management rules.</p>
         */
        @NameInMap("AntibotBlockSum")
        public Long antibotBlockSum;

        /**
         * <p>The number of requests that are monitored by bot management rules.</p>
         */
        @NameInMap("AntibotReportSum")
        public String antibotReportSum;

        /**
         * <p>The number of requests that are monitored by scan protection rules.</p>
         */
        @NameInMap("AntiscanReportsSum")
        public Long antiscanReportsSum;

        /**
         * <p>The number of requests that are blocked by the IP address blacklist.</p>
         */
        @NameInMap("BlacklistBlockSum")
        public String blacklistBlockSum;

        /**
         * <p>The number of requests that are monitored by the IP address blacklist.</p>
         */
        @NameInMap("BlacklistReportsSum")
        public Long blacklistReportsSum;

        /**
         * <p>The number of requests that are blocked by custom HTTP flood protection rules.</p>
         */
        @NameInMap("CcCustomBlockSum")
        public Long ccCustomBlockSum;

        /**
         * <p>The number of requests that are monitored by custom HTTP flood protection rules.</p>
         */
        @NameInMap("CcCustomReportsSum")
        public Long ccCustomReportsSum;

        /**
         * <p>The number of requests that are blocked by HTTP flood protection rules created by the system.</p>
         */
        @NameInMap("CcSystemBlocksSum")
        public Long ccSystemBlocksSum;

        /**
         * <p>The number of requests that are monitored by HTTP flood protection rules created by the system.</p>
         */
        @NameInMap("CcSystemReportsSum")
        public Long ccSystemReportsSum;

        /**
         * <p>The total number of requests.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The total number of requests that are redirected to the WAF instance.</p>
         */
        @NameInMap("InBytes")
        public Long inBytes;

        /**
         * <p>The serial number of the time interval. The serial numbers are arranged in chronological order.</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>The peak traffic.</p>
         */
        @NameInMap("MaxPv")
        public Long maxPv;

        /**
         * <p>The total number of requests that are forwarded by the WAF instance.</p>
         */
        @NameInMap("OutBytes")
        public Long outBytes;

        /**
         * <p>The number of requests that are blocked by rate limiting rules.</p>
         */
        @NameInMap("RatelimitBlockSum")
        public Long ratelimitBlockSum;

        /**
         * <p>The number of requests that are monitored by rate limiting rules.</p>
         */
        @NameInMap("RatelimitReportSum")
        public Long ratelimitReportSum;

        /**
         * <p>The number of requests that are blocked by region blacklist rules.</p>
         */
        @NameInMap("RegionBlockBlocksSum")
        public Long regionBlockBlocksSum;

        /**
         * <p>The number of requests that are monitored by region blacklist rules.</p>
         */
        @NameInMap("RegionBlockReportsSum")
        public Long regionBlockReportsSum;

        /**
         * <p>The total number of bot requests.</p>
         */
        @NameInMap("RobotCount")
        public Long robotCount;

        /**
         * <p>The number of requests that are blocked by basic protection rules.</p>
         */
        @NameInMap("WafBlockSum")
        public Long wafBlockSum;

        /**
         * <p>The number of requests that are monitored by basic protection rules.</p>
         */
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

        public DescribeFlowChartResponseBodyFlowChart setRatelimitBlockSum(Long ratelimitBlockSum) {
            this.ratelimitBlockSum = ratelimitBlockSum;
            return this;
        }
        public Long getRatelimitBlockSum() {
            return this.ratelimitBlockSum;
        }

        public DescribeFlowChartResponseBodyFlowChart setRatelimitReportSum(Long ratelimitReportSum) {
            this.ratelimitReportSum = ratelimitReportSum;
            return this;
        }
        public Long getRatelimitReportSum() {
            return this.ratelimitReportSum;
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

        public DescribeFlowChartResponseBodyFlowChart setRobotCount(Long robotCount) {
            this.robotCount = robotCount;
            return this;
        }
        public Long getRobotCount() {
            return this.robotCount;
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
