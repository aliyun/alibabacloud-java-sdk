// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DownloadResourceControlEventsRequest extends TeaModel {
    /**
     * <p>The action name code.</p>
     * 
     * <strong>example:</strong>
     * <p>shutdown</p>
     */
    @NameInMap("ActionCode")
    public String actionCode;

    /**
     * <p>The collection of control action name codes.</p>
     * <blockquote>
     * <p>Example: [\\\&quot;shutdown\\\&quot;]</p>
     * </blockquote>
     */
    @NameInMap("ActionCodes")
    public java.util.List<String> actionCodes;

    /**
     * <p>The language. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default).</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>The product.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("BusinessCode")
    public String businessCode;

    /**
     * <p>The collection of event name code prefixes.</p>
     * <blockquote>
     * <p>Example: [\\\&quot;BANFF\\\&quot;]</p>
     * </blockquote>
     */
    @NameInMap("CaseCodesPrefix")
    public java.util.List<String> caseCodesPrefix;

    /**
     * <p>The current page number.</p>
     * <blockquote>
     * <p>Must be greater than 0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>short.industry.taobao.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The event name code.</p>
     * 
     * <strong>example:</strong>
     * <p>BANFF_ECS_PE_ECS_MINING_SHUTDOWN</p>
     */
    @NameInMap("EventCode")
    public String eventCode;

    /**
     * <p>The collection of event name codes.</p>
     * <blockquote>
     * <p>Example: [\\\&quot;BANFF_ECS_PE_ECS_MINING_SHUTDOWN\\\&quot;]</p>
     * </blockquote>
     */
    @NameInMap("EventCodes")
    public java.util.List<String> eventCodes;

    /**
     * <p>The alert event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>09C-2PpwIzkpx2zG2fuFrAH55CpJaTK</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The collection of excluded control action name codes.</p>
     * <blockquote>
     * <p>Example: [\\\&quot;shutdown\\\&quot;]</p>
     * </blockquote>
     */
    @NameInMap("ExcludeActionCodes")
    public java.util.List<String> excludeActionCodes;

    /**
     * <p>The collection of excluded event name codes.</p>
     * <blockquote>
     * <p>Example: [\\\&quot;TEST_CASE\\\&quot;]</p>
     * </blockquote>
     */
    @NameInMap("ExcludeEventCodes")
    public java.util.List<String> excludeEventCodes;

    /**
     * <p>The collection of excluded event reasons.</p>
     * <blockquote>
     * <p>Example: [\\\&quot;Mining alert\\\&quot;]</p>
     * </blockquote>
     */
    @NameInMap("ExcludeReasons")
    public java.util.List<String> excludeReasons;

    /**
     * <p>The collection of included event reasons.</p>
     * <blockquote>
     * <p>Example: [\\\&quot;Mining alert\\\&quot;]</p>
     * </blockquote>
     */
    @NameInMap("IncludeReasons")
    public java.util.List<String> includeReasons;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-0iw73ro05vcwn6ntq</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>IP</p>
     * 
     * <strong>example:</strong>
     * <p>12.3*.22.11</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The penalty end time.</p>
     * <blockquote>
     * <p>Format: yyyy-MM-dd HH:mm:ss</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2026-03-16 15:15:00</p>
     */
    @NameInMap("PunishEndTime")
    public String punishEndTime;

    /**
     * <p>The penalty start time.</p>
     * <blockquote>
     * <p>Format: yyyy-MM-dd HH:mm:ss</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2026-03-16 15:15:00</p>
     */
    @NameInMap("PunishStartTime")
    public String punishStartTime;

    /**
     * <p>The event reason.</p>
     * 
     * <strong>example:</strong>
     * <p>Mining</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The collection of event source codes.</p>
     * <blockquote>
     * <p>Example: [\\\&quot;MRM\\\&quot;]</p>
     * </blockquote>
     */
    @NameInMap("SourceCodes")
    public java.util.List<String> sourceCodes;

    /**
     * <p>The task status.</p>
     * <ul>
     * <li><strong>Executing</strong>: In progress.</li>
     * <li><strong>Removed</strong>: Removed.</li>
     * <li><strong>Alerting</strong>: Alerting.</li>
     * <li><strong>Ended</strong>: Ended.</li>
     * <li><strong>Processed</strong>: Processed by the user and pending platform review.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Executing</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The collection of task statuses.</p>
     * <ul>
     * <li><strong>Executing</strong>: In progress.</li>
     * <li><strong>Removed</strong>: Removed.</li>
     * <li><strong>Alerting</strong>: Alerting.</li>
     * <li><strong>Ended</strong>: Ended.</li>
     * <li><strong>Processed</strong>: Processed by the user and pending platform review.</li>
     * </ul>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    /**
     * <p>The control URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://qimg.xiaohongshu.com/circe/1040g1v831qggp28ln0705oft1i6k1jil889lhso?imageView2/2/w/1080/format/jpg">https://qimg.xiaohongshu.com/circe/1040g1v831qggp28ln0705oft1i6k1jil889lhso?imageView2/2/w/1080/format/jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static DownloadResourceControlEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadResourceControlEventsRequest self = new DownloadResourceControlEventsRequest();
        return TeaModel.build(map, self);
    }

    public DownloadResourceControlEventsRequest setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public DownloadResourceControlEventsRequest setActionCodes(java.util.List<String> actionCodes) {
        this.actionCodes = actionCodes;
        return this;
    }
    public java.util.List<String> getActionCodes() {
        return this.actionCodes;
    }

    public DownloadResourceControlEventsRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public DownloadResourceControlEventsRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public DownloadResourceControlEventsRequest setCaseCodesPrefix(java.util.List<String> caseCodesPrefix) {
        this.caseCodesPrefix = caseCodesPrefix;
        return this;
    }
    public java.util.List<String> getCaseCodesPrefix() {
        return this.caseCodesPrefix;
    }

    public DownloadResourceControlEventsRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public DownloadResourceControlEventsRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DownloadResourceControlEventsRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public DownloadResourceControlEventsRequest setEventCodes(java.util.List<String> eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public java.util.List<String> getEventCodes() {
        return this.eventCodes;
    }

    public DownloadResourceControlEventsRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public DownloadResourceControlEventsRequest setExcludeActionCodes(java.util.List<String> excludeActionCodes) {
        this.excludeActionCodes = excludeActionCodes;
        return this;
    }
    public java.util.List<String> getExcludeActionCodes() {
        return this.excludeActionCodes;
    }

    public DownloadResourceControlEventsRequest setExcludeEventCodes(java.util.List<String> excludeEventCodes) {
        this.excludeEventCodes = excludeEventCodes;
        return this;
    }
    public java.util.List<String> getExcludeEventCodes() {
        return this.excludeEventCodes;
    }

    public DownloadResourceControlEventsRequest setExcludeReasons(java.util.List<String> excludeReasons) {
        this.excludeReasons = excludeReasons;
        return this;
    }
    public java.util.List<String> getExcludeReasons() {
        return this.excludeReasons;
    }

    public DownloadResourceControlEventsRequest setIncludeReasons(java.util.List<String> includeReasons) {
        this.includeReasons = includeReasons;
        return this;
    }
    public java.util.List<String> getIncludeReasons() {
        return this.includeReasons;
    }

    public DownloadResourceControlEventsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DownloadResourceControlEventsRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DownloadResourceControlEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DownloadResourceControlEventsRequest setPunishEndTime(String punishEndTime) {
        this.punishEndTime = punishEndTime;
        return this;
    }
    public String getPunishEndTime() {
        return this.punishEndTime;
    }

    public DownloadResourceControlEventsRequest setPunishStartTime(String punishStartTime) {
        this.punishStartTime = punishStartTime;
        return this;
    }
    public String getPunishStartTime() {
        return this.punishStartTime;
    }

    public DownloadResourceControlEventsRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public DownloadResourceControlEventsRequest setSourceCodes(java.util.List<String> sourceCodes) {
        this.sourceCodes = sourceCodes;
        return this;
    }
    public java.util.List<String> getSourceCodes() {
        return this.sourceCodes;
    }

    public DownloadResourceControlEventsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DownloadResourceControlEventsRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public DownloadResourceControlEventsRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
