// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCustomizeReportConfigDetailResponseBody extends TeaModel {
    /**
     * <p>The report chart configuration IDs, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>BIZ_STAT_QUERY_KEY_ATTACK,CUSTOM_VUL_CVE_LIST,CUSTOM_VUL_SYS_LIST,CUSTOM_VUL_WEBCMS_LIST,CUSTOM_AUTO_BREAKING_PIE,CUSTOM_AK_LEAK_LIST,KEY_HP_TAMPERPROOF,KEY_HP_DEFENCE</p>
     */
    @NameInMap("ChartIds")
    public String chartIds;

    /**
     * <p>The group type. Valid values:</p>
     * <ul>
     * <li><strong>ALIYUN_RG</strong>: ALIYUN_RG.</li>
     * <li><strong>SAS_GROUP</strong>: SAS_GROUP.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SAS_GROUP</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>Indicates whether the report is a default report. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not a default report.</li>
     * <li><strong>1</strong>: A default report.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsDefault")
    public Integer isDefault;

    /**
     * <p>Specifies whether newly added accounts are included by default. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Included.</li>
     * <li><strong>false</strong>: Not included.<blockquote>
     * <p>Only version 2.0.0 supports this parameter.</p>
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
     * <p>The pinned time.</p>
     * 
     * <strong>example:</strong>
     * <p>1717430400000</p>
     */
    @NameInMap("PinnedTime")
    public Long pinnedTime;

    /**
     * <p>The recipient email addresses, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:PengZheng@eaton.com">PengZheng@eaton.com</a>,<a href="mailto:ZhongJi@Eaton.com">ZhongJi@Eaton.com</a></p>
     */
    @NameInMap("Recipients")
    public String recipients;

    /**
     * <p>The number of recent days covered by the report statistics.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ReportDays")
    public Integer reportDays;

    /**
     * <p>The end date for report delivery.</p>
     * 
     * <strong>example:</strong>
     * <p>1720022399999</p>
     */
    @NameInMap("ReportEndDate")
    public String reportEndDate;

    /**
     * <p>The report ID.</p>
     * 
     * <strong>example:</strong>
     * <p>663434</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    /**
     * <p>The language type. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The report delivery time range. Valid values:</p>
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
    public String reportSendType;

    /**
     * <p>The start date for report delivery.</p>
     * 
     * <strong>example:</strong>
     * <p>1717430400000</p>
     */
    @NameInMap("ReportStartDate")
    public String reportStartDate;

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
    public String reportStatus;

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
     * <p>3</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>379a9b8f-107b-4630-9e95-2299a1ea****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The delivery end time, in the format of HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>10:00:00</p>
     */
    @NameInMap("SendEndTime")
    public String sendEndTime;

    /**
     * <p>The specific execution dates within the delivery period.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("SendPeriodDays")
    public Integer sendPeriodDays;

    /**
     * <p>The delivery period type. Valid values:</p>
     * <ul>
     * <li><strong>DAY</strong>: day.</li>
     * <li><strong>WEEK</strong>: week.</li>
     * <li><strong>MONTH</strong>: month.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MONTH</p>
     */
    @NameInMap("SendPeriodType")
    public String sendPeriodType;

    /**
     * <p>The delivery start time, in the format of HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>09:00:00</p>
     */
    @NameInMap("SendStartTime")
    public String sendStartTime;

    /**
     * <p>The delivery time, in the format of HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>09:00:00</p>
     */
    @NameInMap("SendTime")
    public String sendTime;

    /**
     * <p>The targets within the group.</p>
     * 
     * <strong>example:</strong>
     * <p>12125884,12140191</p>
     */
    @NameInMap("TargetGroups")
    public String targetGroups;

    /**
     * <p>The list of target UIDs, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>1457515594445744,1600011353839072,1766185894104675,1674080148055995,1627510829033157</p>
     */
    @NameInMap("TargetUids")
    public String targetUids;

    /**
     * <p>The title.</p>
     * 
     * <strong>example:</strong>
     * <p>marketing report</p>
     */
    @NameInMap("Title")
    public String title;

    public static DescribeCustomizeReportConfigDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizeReportConfigDetailResponseBody self = new DescribeCustomizeReportConfigDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizeReportConfigDetailResponseBody setChartIds(String chartIds) {
        this.chartIds = chartIds;
        return this;
    }
    public String getChartIds() {
        return this.chartIds;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Integer getIsDefault() {
        return this.isDefault;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setMemberAccountSyncFlag(Boolean memberAccountSyncFlag) {
        this.memberAccountSyncFlag = memberAccountSyncFlag;
        return this;
    }
    public Boolean getMemberAccountSyncFlag() {
        return this.memberAccountSyncFlag;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setPinnedTime(Long pinnedTime) {
        this.pinnedTime = pinnedTime;
        return this;
    }
    public Long getPinnedTime() {
        return this.pinnedTime;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setRecipients(String recipients) {
        this.recipients = recipients;
        return this;
    }
    public String getRecipients() {
        return this.recipients;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setReportDays(Integer reportDays) {
        this.reportDays = reportDays;
        return this;
    }
    public Integer getReportDays() {
        return this.reportDays;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setReportEndDate(String reportEndDate) {
        this.reportEndDate = reportEndDate;
        return this;
    }
    public String getReportEndDate() {
        return this.reportEndDate;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setReportLang(String reportLang) {
        this.reportLang = reportLang;
        return this;
    }
    public String getReportLang() {
        return this.reportLang;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setReportSendType(String reportSendType) {
        this.reportSendType = reportSendType;
        return this;
    }
    public String getReportSendType() {
        return this.reportSendType;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setReportStartDate(String reportStartDate) {
        this.reportStartDate = reportStartDate;
        return this;
    }
    public String getReportStartDate() {
        return this.reportStartDate;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }
    public String getReportStatus() {
        return this.reportStatus;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setSendEndTime(String sendEndTime) {
        this.sendEndTime = sendEndTime;
        return this;
    }
    public String getSendEndTime() {
        return this.sendEndTime;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setSendPeriodDays(Integer sendPeriodDays) {
        this.sendPeriodDays = sendPeriodDays;
        return this;
    }
    public Integer getSendPeriodDays() {
        return this.sendPeriodDays;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setSendPeriodType(String sendPeriodType) {
        this.sendPeriodType = sendPeriodType;
        return this;
    }
    public String getSendPeriodType() {
        return this.sendPeriodType;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setSendStartTime(String sendStartTime) {
        this.sendStartTime = sendStartTime;
        return this;
    }
    public String getSendStartTime() {
        return this.sendStartTime;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setSendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public String getSendTime() {
        return this.sendTime;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setTargetGroups(String targetGroups) {
        this.targetGroups = targetGroups;
        return this;
    }
    public String getTargetGroups() {
        return this.targetGroups;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setTargetUids(String targetUids) {
        this.targetUids = targetUids;
        return this;
    }
    public String getTargetUids() {
        return this.targetUids;
    }

    public DescribeCustomizeReportConfigDetailResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
