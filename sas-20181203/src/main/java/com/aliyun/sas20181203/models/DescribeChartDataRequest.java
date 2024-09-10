// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeChartDataRequest extends TeaModel {
    /**
     * <p>The ID of the chart.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeChartList~~">DescribeChartList</a> operation to query the ID. This parameter is required if the report version is 1.0.0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CID_ASSET_RISK_TREND</p>
     */
    @NameInMap("CharId")
    public String charId;

    /**
     * <p>The ID of the chart.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeChartList~~">DescribeChartList</a> operation to query the ID. This parameter is required if the report version is 2.0.0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CID_VUL_SUMMARY</p>
     */
    @NameInMap("ChartId")
    public String chartId;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the security report.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCustomizeReportList~~">DescribeCustomizeReportList</a> operation to query the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>721734</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1683862286000</p>
     */
    @NameInMap("TimeEnd")
    public Long timeEnd;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1683603086000</p>
     */
    @NameInMap("TimeStart")
    public Long timeStart;

    public static DescribeChartDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChartDataRequest self = new DescribeChartDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChartDataRequest setCharId(String charId) {
        this.charId = charId;
        return this;
    }
    public String getCharId() {
        return this.charId;
    }

    public DescribeChartDataRequest setChartId(String chartId) {
        this.chartId = chartId;
        return this;
    }
    public String getChartId() {
        return this.chartId;
    }

    public DescribeChartDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeChartDataRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public DescribeChartDataRequest setTimeEnd(Long timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }
    public Long getTimeEnd() {
        return this.timeEnd;
    }

    public DescribeChartDataRequest setTimeStart(Long timeStart) {
        this.timeStart = timeStart;
        return this;
    }
    public Long getTimeStart() {
        return this.timeStart;
    }

}
