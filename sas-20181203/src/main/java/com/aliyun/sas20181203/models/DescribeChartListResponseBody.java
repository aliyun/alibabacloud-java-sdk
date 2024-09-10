// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeChartListResponseBody extends TeaModel {
    /**
     * <p>The charts.</p>
     */
    @NameInMap("ChartList")
    public java.util.List<DescribeChartListResponseBodyChartList> chartList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35B434CC-1615-5937-A04E-A9BC2868DB45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeChartListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChartListResponseBody self = new DescribeChartListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChartListResponseBody setChartList(java.util.List<DescribeChartListResponseBodyChartList> chartList) {
        this.chartList = chartList;
        return this;
    }
    public java.util.List<DescribeChartListResponseBodyChartList> getChartList() {
        return this.chartList;
    }

    public DescribeChartListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeChartListResponseBodyChartList extends TeaModel {
        /**
         * <p>The name of the business type. Valid values:</p>
         * <ul>
         * <li>Overall Operations Metrics</li>
         * <li>Asset Operations Metrics</li>
         * <li>Security Alert Operations Metrics</li>
         * <li>Vulnerability Operations Metrics</li>
         * <li>Baseline Operations Metrics</li>
         * <li>Cloud Product Operations Metrics</li>
         * <li>Honeypot Operations Metrics</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Overall Operation Metrics</p>
         */
        @NameInMap("BusinessName")
        public String businessName;

        /**
         * <p>The business type. Valid values:</p>
         * <ul>
         * <li>INDEX_SECURITY_OVERALL_OPERATION</li>
         * <li>INDEX_ASSET_OPERATION</li>
         * <li>INDEX_SUSPICIOUS_OPERATION</li>
         * <li>INDEX_VUL_OPERATION</li>
         * <li>INDEX_BASELINE_CHECK_OPERATION</li>
         * <li>INDEX_CLOUD_ASSET_OPERATION</li>
         * <li>INDEX_HONEYPOT_RISK_OPERATION</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INDEX_SECURITY_OVERALL_OPERATION</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <p>The ID of the chart.</p>
         * 
         * <strong>example:</strong>
         * <p>CID_CLOUD_ASSET_SUMMARY</p>
         */
        @NameInMap("ChartId")
        public String chartId;

        /**
         * <p>The name of the chart.</p>
         * 
         * <strong>example:</strong>
         * <p>Security Score</p>
         */
        @NameInMap("ChartName")
        public String chartName;

        /**
         * <p>The type of the chart. Valid values:</p>
         * <ul>
         * <li><strong>text</strong></li>
         * <li><strong>table</strong></li>
         * <li><strong>gauge</strong></li>
         * <li><strong>pie</strong></li>
         * <li><strong>line</strong></li>
         * <li><strong>bar</strong></li>
         * <li><strong>timeBar</strong></li>
         * <li><strong>timeLine</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("ChartType")
        public String chartType;

        public static DescribeChartListResponseBodyChartList build(java.util.Map<String, ?> map) throws Exception {
            DescribeChartListResponseBodyChartList self = new DescribeChartListResponseBodyChartList();
            return TeaModel.build(map, self);
        }

        public DescribeChartListResponseBodyChartList setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public DescribeChartListResponseBodyChartList setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public DescribeChartListResponseBodyChartList setChartId(String chartId) {
            this.chartId = chartId;
            return this;
        }
        public String getChartId() {
            return this.chartId;
        }

        public DescribeChartListResponseBodyChartList setChartName(String chartName) {
            this.chartName = chartName;
            return this;
        }
        public String getChartName() {
            return this.chartName;
        }

        public DescribeChartListResponseBodyChartList setChartType(String chartType) {
            this.chartType = chartType;
            return this;
        }
        public String getChartType() {
            return this.chartType;
        }

    }

}
