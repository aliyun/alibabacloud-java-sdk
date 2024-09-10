// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveCustomizeReportConfigRequest extends TeaModel {
    /**
     * <p>The grouping type. Valid values:</p>
     * <ul>
     * <li><strong>ALIYUN_RG</strong></li>
     * <li><strong>SAS_GROUP</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter is supported only in version 2.0.0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SAS_GROUP</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The time when the report is pinned. Unit: milliseconds.</p>
     * <blockquote>
     * <p> This parameter is supported only in version 2.0.0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1717430400000</p>
     */
    @NameInMap("PinnedTime")
    public Long pinnedTime;

    /**
     * <p>The email address of the recipient. Separate multiple email addresses with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@163.com">xxx@163.com</a></p>
     */
    @NameInMap("Recipients")
    public String recipients;

    /**
     * <p>The most recent days for report statistics.</p>
     * <blockquote>
     * <p> This parameter is supported only in version 2.0.0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ReportDays")
    public Integer reportDays;

    /**
     * <p>The end date on which the report is sent. The value is in the yyyy-MM-dd format.</p>
     * <blockquote>
     * <p> This parameter is required if the ReportType parameter is set to 3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2024-01-15</p>
     */
    @NameInMap("ReportEndDate")
    public String reportEndDate;

    /**
     * <p>The ID of the report.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCustomizeReportList~~">DescribeCustomizeReportList</a> operation to query the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    /**
     * <p>The language of the report. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("ReportLang")
    public String reportLang;

    /**
     * <p>The time range in which the report is sent. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: 00:00 to 06:00.</li>
     * <li><strong>2</strong>: 06:00 to 12:00.</li>
     * <li><strong>3</strong>: 12:00 to 18:00.</li>
     * <li><strong>4</strong>: 18:00 to 24:00.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ReportSendType")
    public Integer reportSendType;

    /**
     * <p>The start date on which the report is sent. The value is in the yyyy-MM-dd format.</p>
     * <blockquote>
     * <p> This parameter is required if the ReportType parameter is set to 3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01</p>
     */
    @NameInMap("ReportStartDate")
    public String reportStartDate;

    /**
     * <p>The status of the report. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled.</li>
     * <li><strong>1</strong>: enabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReportStatus")
    public Integer reportStatus;

    /**
     * <p>The type of the report. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: daily report.</li>
     * <li><strong>1</strong>: weekly report.</li>
     * <li><strong>2</strong>: monthly report.</li>
     * <li><strong>3</strong>: report whose statistics are collected within a custom time range.</li>
     * <li><strong>4</strong>: report of the most recent time range.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ReportType")
    public Integer reportType;

    /**
     * <p>The version of the report. Valid values:</p>
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
     * <p>The end time at which the report is sent. The value is in the HH:mm:ss format.</p>
     * <blockquote>
     * <p> This parameter is required if the ReportType parameter is set to 0, 1, 2, or 4.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10:00:00</p>
     */
    @NameInMap("SendEndTime")
    public String sendEndTime;

    /**
     * <p>The exact day within the sending period.</p>
     * <blockquote>
     * <p> This parameter is supported only in version 2.0.0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("SendPeriodDays")
    public Integer sendPeriodDays;

    /**
     * <p>The interval at which the report is sent. Valid values:</p>
     * <ul>
     * <li><strong>DAY</strong></li>
     * <li><strong>WEEK</strong></li>
     * <li><strong>MONTH</strong></li>
     * </ul>
     * <blockquote>
     * <p> This parameter is supported only in version 2.0.0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MONTH</p>
     */
    @NameInMap("SendPeriodType")
    public String sendPeriodType;

    /**
     * <p>The start time at which the report is sent. The value is in the HH:mm:ss format.</p>
     * <blockquote>
     * <p> This parameter is required if the ReportType parameter is set to 0, 1, 2, or 4.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>09:00:00</p>
     */
    @NameInMap("SendStartTime")
    public String sendStartTime;

    /**
     * <p>The groups.</p>
     * <blockquote>
     * <p> This parameter is supported only in version 2.0.0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12,123</p>
     */
    @NameInMap("TargetGroups")
    public String targetGroups;

    /**
     * <p>The ID of the Alibaba Cloud account. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p> This parameter is supported only in version 2.0.0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12,123</p>
     */
    @NameInMap("TargetUids")
    public String targetUids;

    /**
     * <p>The title of the report.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Daily Report</p>
     */
    @NameInMap("Title")
    public String title;

    public static SaveCustomizeReportConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveCustomizeReportConfigRequest self = new SaveCustomizeReportConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveCustomizeReportConfigRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public SaveCustomizeReportConfigRequest setPinnedTime(Long pinnedTime) {
        this.pinnedTime = pinnedTime;
        return this;
    }
    public Long getPinnedTime() {
        return this.pinnedTime;
    }

    public SaveCustomizeReportConfigRequest setRecipients(String recipients) {
        this.recipients = recipients;
        return this;
    }
    public String getRecipients() {
        return this.recipients;
    }

    public SaveCustomizeReportConfigRequest setReportDays(Integer reportDays) {
        this.reportDays = reportDays;
        return this;
    }
    public Integer getReportDays() {
        return this.reportDays;
    }

    public SaveCustomizeReportConfigRequest setReportEndDate(String reportEndDate) {
        this.reportEndDate = reportEndDate;
        return this;
    }
    public String getReportEndDate() {
        return this.reportEndDate;
    }

    public SaveCustomizeReportConfigRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public SaveCustomizeReportConfigRequest setReportLang(String reportLang) {
        this.reportLang = reportLang;
        return this;
    }
    public String getReportLang() {
        return this.reportLang;
    }

    public SaveCustomizeReportConfigRequest setReportSendType(Integer reportSendType) {
        this.reportSendType = reportSendType;
        return this;
    }
    public Integer getReportSendType() {
        return this.reportSendType;
    }

    public SaveCustomizeReportConfigRequest setReportStartDate(String reportStartDate) {
        this.reportStartDate = reportStartDate;
        return this;
    }
    public String getReportStartDate() {
        return this.reportStartDate;
    }

    public SaveCustomizeReportConfigRequest setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }
    public Integer getReportStatus() {
        return this.reportStatus;
    }

    public SaveCustomizeReportConfigRequest setReportType(Integer reportType) {
        this.reportType = reportType;
        return this;
    }
    public Integer getReportType() {
        return this.reportType;
    }

    public SaveCustomizeReportConfigRequest setReportVersion(String reportVersion) {
        this.reportVersion = reportVersion;
        return this;
    }
    public String getReportVersion() {
        return this.reportVersion;
    }

    public SaveCustomizeReportConfigRequest setSendEndTime(String sendEndTime) {
        this.sendEndTime = sendEndTime;
        return this;
    }
    public String getSendEndTime() {
        return this.sendEndTime;
    }

    public SaveCustomizeReportConfigRequest setSendPeriodDays(Integer sendPeriodDays) {
        this.sendPeriodDays = sendPeriodDays;
        return this;
    }
    public Integer getSendPeriodDays() {
        return this.sendPeriodDays;
    }

    public SaveCustomizeReportConfigRequest setSendPeriodType(String sendPeriodType) {
        this.sendPeriodType = sendPeriodType;
        return this;
    }
    public String getSendPeriodType() {
        return this.sendPeriodType;
    }

    public SaveCustomizeReportConfigRequest setSendStartTime(String sendStartTime) {
        this.sendStartTime = sendStartTime;
        return this;
    }
    public String getSendStartTime() {
        return this.sendStartTime;
    }

    public SaveCustomizeReportConfigRequest setTargetGroups(String targetGroups) {
        this.targetGroups = targetGroups;
        return this;
    }
    public String getTargetGroups() {
        return this.targetGroups;
    }

    public SaveCustomizeReportConfigRequest setTargetUids(String targetUids) {
        this.targetUids = targetUids;
        return this;
    }
    public String getTargetUids() {
        return this.targetUids;
    }

    public SaveCustomizeReportConfigRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
