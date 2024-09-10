// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizeReportListRequest extends TeaModel {
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
     * <p>Specifies whether to pin the report. Valid values:</p>
     * <ul>
     * <li><strong>false</strong></li>
     * <li><strong>true</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Pinned")
    public Boolean pinned;

    /**
     * <p>The state of the report. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled</li>
     * <li><strong>1</strong>: enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReportStatus")
    public Integer reportStatus;

    /**
     * <p>The type of the report. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: daily report</li>
     * <li><strong>1</strong>: weekly report</li>
     * <li><strong>2</strong>: monthly report</li>
     * <li><strong>3</strong>: report whose statistics are collected in a custom time range</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReportType")
    public Integer reportType;

    /**
     * <p>The report version. Valid values:</p>
     * <ul>
     * <li><strong>1.0.0</strong></li>
     * <li><strong>2.0.0</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2.0.0</p>
     */
    @NameInMap("ReportVersion")
    public String reportVersion;

    /**
     * <p>The name of the report.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Title")
    public String title;

    public static DescribeCustomizeReportListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeReportListRequest self = new DescribeCustomizeReportListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeReportListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCustomizeReportListRequest setPinned(Boolean pinned) {
        this.pinned = pinned;
        return this;
    }
    public Boolean getPinned() {
        return this.pinned;
    }

    public DescribeCustomizeReportListRequest setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }
    public Integer getReportStatus() {
        return this.reportStatus;
    }

    public DescribeCustomizeReportListRequest setReportType(Integer reportType) {
        this.reportType = reportType;
        return this;
    }
    public Integer getReportType() {
        return this.reportType;
    }

    public DescribeCustomizeReportListRequest setReportVersion(String reportVersion) {
        this.reportVersion = reportVersion;
        return this;
    }
    public String getReportVersion() {
        return this.reportVersion;
    }

    public DescribeCustomizeReportListRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
