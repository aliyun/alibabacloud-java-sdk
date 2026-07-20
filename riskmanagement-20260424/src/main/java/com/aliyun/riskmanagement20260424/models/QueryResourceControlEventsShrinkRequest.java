// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryResourceControlEventsShrinkRequest extends TeaModel {
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
    public String actionCodesShrink;

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
    public String caseCodesPrefixShrink;

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
    public String eventCodesShrink;

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
    public String eventIdListShrink;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;shutdown\&quot;]</p>
     */
    @NameInMap("ExcludeActionCodes")
    public String excludeActionCodesShrink;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;TEST_CASE\&quot;]</p>
     */
    @NameInMap("ExcludeEventCodes")
    public String excludeEventCodesShrink;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;挖矿告警\&quot;,\&quot;挖矿管控事件\&quot;,\&quot;挖矿\&quot;]</p>
     */
    @NameInMap("ExcludeReasons")
    public String excludeReasonsShrink;

    /**
     * <strong>example:</strong>
     * <p>[\&quot;挖矿告警\&quot;,\&quot;挖矿管控事件\&quot;,\&quot;挖矿\&quot;]</p>
     */
    @NameInMap("IncludeReasons")
    public String includeReasonsShrink;

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
    public String sourceCodesShrink;

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
    public String statusListShrink;

    /**
     * <strong>example:</strong>
     * <p><a href="https://qimg.xiaohongshu.com/circe/1040g1v831qggp28ln0705oft1i6k1jil889lhso?imageView2/2/w/1080/format/jpg">https://qimg.xiaohongshu.com/circe/1040g1v831qggp28ln0705oft1i6k1jil889lhso?imageView2/2/w/1080/format/jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static QueryResourceControlEventsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceControlEventsShrinkRequest self = new QueryResourceControlEventsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryResourceControlEventsShrinkRequest setActionCode(String actionCode) {
        this.actionCode = actionCode;
        return this;
    }
    public String getActionCode() {
        return this.actionCode;
    }

    public QueryResourceControlEventsShrinkRequest setActionCodesShrink(String actionCodesShrink) {
        this.actionCodesShrink = actionCodesShrink;
        return this;
    }
    public String getActionCodesShrink() {
        return this.actionCodesShrink;
    }

    public QueryResourceControlEventsShrinkRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public QueryResourceControlEventsShrinkRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public QueryResourceControlEventsShrinkRequest setCaseCodesPrefixShrink(String caseCodesPrefixShrink) {
        this.caseCodesPrefixShrink = caseCodesPrefixShrink;
        return this;
    }
    public String getCaseCodesPrefixShrink() {
        return this.caseCodesPrefixShrink;
    }

    public QueryResourceControlEventsShrinkRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public QueryResourceControlEventsShrinkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public QueryResourceControlEventsShrinkRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public QueryResourceControlEventsShrinkRequest setEventCodesShrink(String eventCodesShrink) {
        this.eventCodesShrink = eventCodesShrink;
        return this;
    }
    public String getEventCodesShrink() {
        return this.eventCodesShrink;
    }

    public QueryResourceControlEventsShrinkRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public QueryResourceControlEventsShrinkRequest setEventIdListShrink(String eventIdListShrink) {
        this.eventIdListShrink = eventIdListShrink;
        return this;
    }
    public String getEventIdListShrink() {
        return this.eventIdListShrink;
    }

    public QueryResourceControlEventsShrinkRequest setExcludeActionCodesShrink(String excludeActionCodesShrink) {
        this.excludeActionCodesShrink = excludeActionCodesShrink;
        return this;
    }
    public String getExcludeActionCodesShrink() {
        return this.excludeActionCodesShrink;
    }

    public QueryResourceControlEventsShrinkRequest setExcludeEventCodesShrink(String excludeEventCodesShrink) {
        this.excludeEventCodesShrink = excludeEventCodesShrink;
        return this;
    }
    public String getExcludeEventCodesShrink() {
        return this.excludeEventCodesShrink;
    }

    public QueryResourceControlEventsShrinkRequest setExcludeReasonsShrink(String excludeReasonsShrink) {
        this.excludeReasonsShrink = excludeReasonsShrink;
        return this;
    }
    public String getExcludeReasonsShrink() {
        return this.excludeReasonsShrink;
    }

    public QueryResourceControlEventsShrinkRequest setIncludeReasonsShrink(String includeReasonsShrink) {
        this.includeReasonsShrink = includeReasonsShrink;
        return this;
    }
    public String getIncludeReasonsShrink() {
        return this.includeReasonsShrink;
    }

    public QueryResourceControlEventsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryResourceControlEventsShrinkRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public QueryResourceControlEventsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryResourceControlEventsShrinkRequest setPunishEndTime(String punishEndTime) {
        this.punishEndTime = punishEndTime;
        return this;
    }
    public String getPunishEndTime() {
        return this.punishEndTime;
    }

    public QueryResourceControlEventsShrinkRequest setPunishStartTime(String punishStartTime) {
        this.punishStartTime = punishStartTime;
        return this;
    }
    public String getPunishStartTime() {
        return this.punishStartTime;
    }

    public QueryResourceControlEventsShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public QueryResourceControlEventsShrinkRequest setSourceCodesShrink(String sourceCodesShrink) {
        this.sourceCodesShrink = sourceCodesShrink;
        return this;
    }
    public String getSourceCodesShrink() {
        return this.sourceCodesShrink;
    }

    public QueryResourceControlEventsShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryResourceControlEventsShrinkRequest setStatusListShrink(String statusListShrink) {
        this.statusListShrink = statusListShrink;
        return this;
    }
    public String getStatusListShrink() {
        return this.statusListShrink;
    }

    public QueryResourceControlEventsShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
