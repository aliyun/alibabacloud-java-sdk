// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotEventsRequest extends TeaModel {
    /**
     * <p>The probe IDs.</p>
     */
    @NameInMap("AgentIdList")
    public java.util.List<String> agentIdList;

    /**
     * <p>The ID of the alert.</p>
     */
    @NameInMap("AlarmEventId")
    public Long alarmEventId;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The status of the event. Valid values:</p>
     * <br>
     * <p>*   **y**: handled</p>
     * <p>*   **n**: unhandled</p>
     * <p>*   **a**: all statuses</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The honeypot IDs.</p>
     */
    @NameInMap("HoneypotIdList")
    public java.util.List<String> honeypotIdList;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the attacker profile.</p>
     */
    @NameInMap("PortraitId")
    public String portraitId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The risk levels.</p>
     */
    @NameInMap("RiskLevelList")
    public java.util.List<String> riskLevelList;

    /**
     * <p>The source IP address of the attack.</p>
     */
    @NameInMap("SrcIp")
    public String srcIp;

    public static ListHoneypotEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotEventsRequest self = new ListHoneypotEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListHoneypotEventsRequest setAgentIdList(java.util.List<String> agentIdList) {
        this.agentIdList = agentIdList;
        return this;
    }
    public java.util.List<String> getAgentIdList() {
        return this.agentIdList;
    }

    public ListHoneypotEventsRequest setAlarmEventId(Long alarmEventId) {
        this.alarmEventId = alarmEventId;
        return this;
    }
    public Long getAlarmEventId() {
        return this.alarmEventId;
    }

    public ListHoneypotEventsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListHoneypotEventsRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public ListHoneypotEventsRequest setHoneypotIdList(java.util.List<String> honeypotIdList) {
        this.honeypotIdList = honeypotIdList;
        return this;
    }
    public java.util.List<String> getHoneypotIdList() {
        return this.honeypotIdList;
    }

    public ListHoneypotEventsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListHoneypotEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHoneypotEventsRequest setPortraitId(String portraitId) {
        this.portraitId = portraitId;
        return this;
    }
    public String getPortraitId() {
        return this.portraitId;
    }

    public ListHoneypotEventsRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHoneypotEventsRequest setRiskLevelList(java.util.List<String> riskLevelList) {
        this.riskLevelList = riskLevelList;
        return this;
    }
    public java.util.List<String> getRiskLevelList() {
        return this.riskLevelList;
    }

    public ListHoneypotEventsRequest setSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }
    public String getSrcIp() {
        return this.srcIp;
    }

}
