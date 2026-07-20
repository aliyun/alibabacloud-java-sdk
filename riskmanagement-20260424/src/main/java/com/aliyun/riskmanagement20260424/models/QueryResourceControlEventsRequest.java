// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryResourceControlEventsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>shutdown</p>
     */
    @NameInMap("ActionCode")
    public String actionCode;

    /**
     * <strong>example:</strong>
     * <p>shutdown</p>
     */
    @NameInMap("ActionCodes")
    public java.util.List<String> actionCodes;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("BusinessCode")
    public String businessCode;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;BANFF\&quot;]</p>
     */
    @NameInMap("CaseCodesPrefix")
    public java.util.List<String> caseCodesPrefix;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <strong>example:</strong>
     * <p>short.industry.taobao.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>BANFF_ECS_PE_ECS_MINING_SHUTDOWN</p>
     */
    @NameInMap("EventCode")
    public String eventCode;

    /**
     * <strong>example:</strong>
     * <p>[&quot;BANFF_ECS_PE_ECS_MINING_SHUTDOWN&quot;]</p>
     */
    @NameInMap("EventCodes")
    public java.util.List<String> eventCodes;

    /**
     * <strong>example:</strong>
     * <p>2PTOHhN3YUeaPWzq9FLmpdZ9EOW</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;7ac74fbfe06b2b85bb470083b7a05fb7\&quot;,\&quot;1180c5bbff0a385b00d2cf73e3371d11\&quot;]</p>
     */
    @NameInMap("EventIdList")
    public java.util.List<String> eventIdList;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;shutdown\&quot;]</p>
     */
    @NameInMap("ExcludeActionCodes")
    public java.util.List<String> excludeActionCodes;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;TEST_CASE\&quot;]</p>
     */
    @NameInMap("ExcludeEventCodes")
    public java.util.List<String> excludeEventCodes;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;挖矿告警\&quot;,\&quot;挖矿管控事件\&quot;,\&quot;挖矿\&quot;]</p>
     */
    @NameInMap("ExcludeReasons")
    public java.util.List<String> excludeReasons;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;挖矿告警\&quot;,\&quot;挖矿管控事件\&quot;,\&quot;挖矿\&quot;]</p>
     */
    @NameInMap("IncludeReasons")
    public java.util.List<String> includeReasons;

    /**
     * <strong>example:</strong>
     * <p>rm-0iw73ro05vcwn6ntq</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>12.3*.22.11</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>2026-03-16 15:15:00</p>
     */
    @NameInMap("PunishEndTime")
    public String punishEndTime;

    /**
     * <strong>example:</strong>
     * <p>2026-03-16 15:15:00</p>
     */
    @NameInMap("PunishStartTime")
    public String punishStartTime;

    /**
     * <strong>example:</strong>
     * <p>挖矿</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;MRM\&quot;]</p>
     */
    @NameInMap("SourceCodes")
    public java.util.List<String> sourceCodes;

    /**
     * <strong>example:</strong>
     * <p>Executing</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;Executing\&quot;]</p>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    /**
     * <strong>example:</strong>
     * <p><a href="https://qimg.xiaohongshu.com/circe/1040g1v831qggp28ln0705oft1i6k1jil889lhso?imageView2/2/w/1080/format/jpg">https://qimg.xiaohongshu.com/circe/1040g1v831qggp28ln0705oft1i6k1jil889lhso?imageView2/2/w/1080/format/jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static QueryResourceControlEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceControlEventsRequest self = new QueryResourceControlEventsRequest();
        return TeaModel.build(map, self);
    }

    public QueryResourceControlEventsRequest setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public QueryResourceControlEventsRequest setActionCodes(java.util.List<String> actionCodes) {
        this.actionCodes = actionCodes;
        return this;
    }
    public java.util.List<String> getActionCodes() {
        return this.actionCodes;
    }

    public QueryResourceControlEventsRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public QueryResourceControlEventsRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public QueryResourceControlEventsRequest setCaseCodesPrefix(java.util.List<String> caseCodesPrefix) {
        this.caseCodesPrefix = caseCodesPrefix;
        return this;
    }
    public java.util.List<String> getCaseCodesPrefix() {
        return this.caseCodesPrefix;
    }

    public QueryResourceControlEventsRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public QueryResourceControlEventsRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public QueryResourceControlEventsRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public QueryResourceControlEventsRequest setEventCodes(java.util.List<String> eventCodes) {
        this.eventCodes = eventCodes;
        return this;
    }
    public java.util.List<String> getEventCodes() {
        return this.eventCodes;
    }

    public QueryResourceControlEventsRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public QueryResourceControlEventsRequest setEventIdList(java.util.List<String> eventIdList) {
        this.eventIdList = eventIdList;
        return this;
    }
    public java.util.List<String> getEventIdList() {
        return this.eventIdList;
    }

    public QueryResourceControlEventsRequest setExcludeActionCodes(java.util.List<String> excludeActionCodes) {
        this.excludeActionCodes = excludeActionCodes;
        return this;
    }
    public java.util.List<String> getExcludeActionCodes() {
        return this.excludeActionCodes;
    }

    public QueryResourceControlEventsRequest setExcludeEventCodes(java.util.List<String> excludeEventCodes) {
        this.excludeEventCodes = excludeEventCodes;
        return this;
    }
    public java.util.List<String> getExcludeEventCodes() {
        return this.excludeEventCodes;
    }

    public QueryResourceControlEventsRequest setExcludeReasons(java.util.List<String> excludeReasons) {
        this.excludeReasons = excludeReasons;
        return this;
    }
    public java.util.List<String> getExcludeReasons() {
        return this.excludeReasons;
    }

    public QueryResourceControlEventsRequest setIncludeReasons(java.util.List<String> includeReasons) {
        this.includeReasons = includeReasons;
        return this;
    }
    public java.util.List<String> getIncludeReasons() {
        return this.includeReasons;
    }

    public QueryResourceControlEventsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryResourceControlEventsRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public QueryResourceControlEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryResourceControlEventsRequest setPunishEndTime(String punishEndTime) {
        this.punishEndTime = punishEndTime;
        return this;
    }
    public String getPunishEndTime() {
        return this.punishEndTime;
    }

    public QueryResourceControlEventsRequest setPunishStartTime(String punishStartTime) {
        this.punishStartTime = punishStartTime;
        return this;
    }
    public String getPunishStartTime() {
        return this.punishStartTime;
    }

    public QueryResourceControlEventsRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public QueryResourceControlEventsRequest setSourceCodes(java.util.List<String> sourceCodes) {
        this.sourceCodes = sourceCodes;
        return this;
    }
    public java.util.List<String> getSourceCodes() {
        return this.sourceCodes;
    }

    public QueryResourceControlEventsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryResourceControlEventsRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public QueryResourceControlEventsRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
