// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveCustomizeReportConfigRequest extends TeaModel {
    /**
     * <p>The group type. Valid values:</p>
     * <ul>
     * <li><strong>ALIYUN_RG</strong>: Alibaba Cloud resource group.</li>
     * <li><strong>SAS_GROUP</strong>: Security Center group.<blockquote>
     * <p>This parameter is supported only in version 2.0.0.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SAS_GROUP</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>Specifies whether newly added accounts are included by default. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.<blockquote>
     * <p>This parameter is supported only in version 2.0.0.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MemberAccountSyncFlag")
    public Boolean memberAccountSyncFlag;

    /**
     * <p>The pinned time. Unit: milliseconds.</p>
     * <blockquote>
     * <p>This parameter is supported only in version 2.0.0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1717430400000</p>
     */
    @NameInMap("PinnedTime")
    public Long pinnedTime;

    /**
     * <p>The email addresses of contacts. Separate multiple email addresses with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxx@163.com">xxx@163.com</a></p>
     */
    @NameInMap("Recipients")
    public String recipients;

    /**
     * <p>The number of recent days for report statistics.</p>
     * <blockquote>
     * <p>This parameter is supported only in version 2.0.0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("ReportDays")
    public Integer reportDays;

    /**
     * <p>The end date for report statistics. Format: yyyy-MM-dd.</p>
     * <blockquote>
     * <p>This parameter is required when ReportType is set to 3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2024-01-15</p>
     */
    @NameInMap("ReportEndDate")
    public String reportEndDate;

    /**
     * <p>The report ID.</p>
     * <blockquote>
     * <p>Call <a href="~~DescribeCustomizeReportList~~">DescribeCustomizeReportList</a> to obtain this parameter.</p>
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
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("ReportLang")
    public String reportLang;

    /**
     * <p>The report sending type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: 0:00 to 6:00.</li>
     * <li><strong>2</strong>: 6:00 to 12:00.</li>
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
     * <p>The start date for report statistics. Format: yyyy-MM-dd.</p>
     * <blockquote>
     * <p>This parameter is required when ReportType is set to 3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01</p>
     */
    @NameInMap("ReportStartDate")
    public String reportStartDate;

    /**
     * <p>The report status. Valid values:</p>
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
     * <p>The report type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: daily report.</li>
     * <li><strong>1</strong>: weekly report.</li>
     * <li><strong>2</strong>: monthly report.</li>
     * <li><strong>3</strong>: custom period.</li>
     * <li><strong>4</strong>: latest period.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
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
     * <p>The Alibaba Cloud account ID of the member accounts in the resource folder.</p>
     * <blockquote>
     * <p>Invoke <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The send end time. Format: HH:mm:ss.</p>
     * <blockquote>
     * <p>This parameter is required when ReportType is set to 0, 1, 2, or 4.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10:00:00</p>
     */
    @NameInMap("SendEndTime")
    public String sendEndTime;

    /**
     * <p>The specific execution dates within the send period.</p>
     * <blockquote>
     * <p>This parameter is supported only in version 2.0.0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("SendPeriodDays")
    public Integer sendPeriodDays;

    /**
     * <p>The send period type. Valid values:</p>
     * <ul>
     * <li><strong>DAY</strong>: day.</li>
     * <li><strong>WEEK</strong>: week.</li>
     * <li><strong>MONTH</strong>: month.<blockquote>
     * <p>This parameter is supported only in version 2.0.0.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MONTH</p>
     */
    @NameInMap("SendPeriodType")
    public String sendPeriodType;

    /**
     * <p>The send start time. Format: HH:mm:ss.</p>
     * <blockquote>
     * <p>This parameter is required when ReportType is set to 0, 1, 2, or 4.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>09:00:00</p>
     */
    @NameInMap("SendStartTime")
    public String sendStartTime;

    /**
     * <p>The targets within the group.</p>
     * <blockquote>
     * <p>This parameter is supported only in version 2.0.0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12,123</p>
     */
    @NameInMap("TargetGroups")
    public String targetGroups;

    /**
     * <p>The list of target users. Separate multiple values with commas (,).</p>
     * <blockquote>
     * <p>This parameter is supported only in version 2.0.0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>12,123</p>
     */
    @NameInMap("TargetUids")
    public String targetUids;

    /**
     * <p>The report name.</p>
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

    public SaveCustomizeReportConfigRequest setMemberAccountSyncFlag(Boolean memberAccountSyncFlag) {
        this.memberAccountSyncFlag = memberAccountSyncFlag;
        return this;
    }
    public Boolean getMemberAccountSyncFlag() {
        return this.memberAccountSyncFlag;
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

    public SaveCustomizeReportConfigRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
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
