// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeChartListResponseBody extends TeaModel {
    /**
     * <p>The list of charts.</p>
     */
    @NameInMap("ChartList")
    public java.util.List<DescribeChartListResponseBodyChartList> chartList;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
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
         * <p>The business type name. Valid values:</p>
         * <ul>
         * <li>Overall operation metrics</li>
         * <li>Asset operation metrics</li>
         * <li>Security alert operation metrics</li>
         * <li>Vulnerability operation metrics</li>
         * <li>Baseline operation metrics</li>
         * <li>Cloud service operation metrics</li>
         * <li>Cloud honeypot operation metrics.</li>
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
         * <li>INDEX_HONEYPOT_RISK_OPERATION.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INDEX_SECURITY_OVERALL_OPERATION</p>
         */
        @NameInMap("BusinessType")
        public String businessType;

        /**
         * <p>The chart ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CID_CLOUD_ASSET_SUMMARY</p>
         */
        @NameInMap("ChartId")
        public String chartId;

        /**
         * <p>The chart name.</p>
         * 
         * <strong>example:</strong>
         * <p>Security Score</p>
         */
        @NameInMap("ChartName")
        public String chartName;

        /**
         * <p>The chart type. Valid values:</p>
         * <ul>
         * <li><strong>text</strong>: text</li>
         * <li><strong>table</strong>: table</li>
         * <li><strong>gauge</strong>: gauge chart</li>
         * <li><strong>pie</strong>: pie chart</li>
         * <li><strong>line</strong>: line chart</li>
         * <li><strong>bar</strong>: bar chart</li>
         * <li><strong>timeBar</strong>: timeline bar chart</li>
         * <li><strong>timeLine</strong>: timeline line chart.</li>
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
