// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotAttackStatisticsRequest extends TeaModel {
    /**
     * <p>The page number. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time. The value is a UNIX timestamp.</p>
     */
    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page. We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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

    /**
     * <p>The start time. The value is a UNIX timestamp.</p>
     */
    @NameInMap("StartTimeStamp")
    public Long startTimeStamp;

    /**
     * <p>The type of the attack source statistics. Valid values:</p>
     * <br>
     * <p>*   **TOP_ATTACKED_AGENT**: the top 5 probes that are attacked the most frequently</p>
     * <p>*   **TOP_ATTACKED_IP**: the top 5 IP addresses that are attacked the most frequently</p>
     * <p>*   **ATTACK_EVENT_TYPE**: the type of the intrusion event</p>
     * <p>*   **ATTACK_HONEYPOT_TYPE**: the type of the attacked honeypot</p>
     */
    @NameInMap("StatisticsType")
    public String statisticsType;

    public static GetHoneypotAttackStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotAttackStatisticsRequest self = new GetHoneypotAttackStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetHoneypotAttackStatisticsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetHoneypotAttackStatisticsRequest setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public GetHoneypotAttackStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetHoneypotAttackStatisticsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetHoneypotAttackStatisticsRequest setRiskLevelList(java.util.List<String> riskLevelList) {
        this.riskLevelList = riskLevelList;
        return this;
    }
    public java.util.List<String> getRiskLevelList() {
        return this.riskLevelList;
    }

    public GetHoneypotAttackStatisticsRequest setSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }
    public String getSrcIp() {
        return this.srcIp;
    }

    public GetHoneypotAttackStatisticsRequest setStartTimeStamp(Long startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
        return this;
    }
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public GetHoneypotAttackStatisticsRequest setStatisticsType(String statisticsType) {
        this.statisticsType = statisticsType;
        return this;
    }
    public String getStatisticsType() {
        return this.statisticsType;
    }

}
