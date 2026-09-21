// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizeReportListRequest extends TeaModel {
    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>Specifies whether the report is pinned to the top. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: No.</li>
     * <li><strong>true</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Pinned")
    public Boolean pinned;

    /**
     * <p>The report status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disabled.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReportStatus")
    public Integer reportStatus;

    /**
     * <p>The report type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Daily report.</li>
     * <li><strong>1</strong>: Weekly report.</li>
     * <li><strong>2</strong>: Monthly report.</li>
     * <li><strong>3</strong>: Custom period.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReportType")
    public Integer reportType;

    /**
     * <p>The security report version. Valid values:</p>
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
     * <p>The Alibaba Cloud account ID of the member accounts in the resource directory folder.</p>
     * <blockquote>
     * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The report name.</p>
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

    public DescribeCustomizeReportListRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeCustomizeReportListRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
