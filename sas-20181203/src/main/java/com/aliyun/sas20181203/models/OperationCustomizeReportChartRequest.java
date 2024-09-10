// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperationCustomizeReportChartRequest extends TeaModel {
    /**
     * <p>The ID of the chart that is included in the report. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeChartList~~">DescribeChartList</a> operation to query the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CID_VUL_SUMMARY,CID_VUL_TREND,CID_VUL_OPERATION_TREND,CID_BASELINE_CHECK_SUMMARY,CID_BASELINE_CHECK_TREND,CID_BASELINE_CHECK_OPERATION_TREND</p>
     */
    @NameInMap("ChartIds")
    public String chartIds;

    /**
     * <p>The ID of the report.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCustomizeReportList~~">DescribeCustomizeReportList</a> operation to query the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    public static OperationCustomizeReportChartRequest build(java.util.Map<String, ?> map) throws Exception {
        OperationCustomizeReportChartRequest self = new OperationCustomizeReportChartRequest();
        return TeaModel.build(map, self);
    }

    public OperationCustomizeReportChartRequest setChartIds(String chartIds) {
        this.chartIds = chartIds;
        return this;
    }
    public String getChartIds() {
        return this.chartIds;
    }

    public OperationCustomizeReportChartRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

}
