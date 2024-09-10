// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeChartListRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
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
     * <p>The code of the report. Valid value:</p>
     * <ul>
     * <li><strong>customize_report</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customize_report</p>
     */
    @NameInMap("ProjectCode")
    public String projectCode;

    /**
     * <p>The ID of the report.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCustomizeReportList~~">DescribeCustomizeReportList</a> operation to query the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>720549</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    public static DescribeChartListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChartListRequest self = new DescribeChartListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChartListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeChartListRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public DescribeChartListRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

}
