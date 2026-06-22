// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotAttackStatisticsRequest extends TeaModel {
    /**
     * <p>The page number of the page to return. Minimum value: <strong>1</strong>. Default value: <strong>1</strong>, which indicates that the first page is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time in timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1675058931215</p>
     */
    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return on each page in a paged query. Default value: 20. If you leave this parameter empty, 20 entries are returned by default. &gt; Specify a value for the paging parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of risk levels.</p>
     */
    @NameInMap("RiskLevelList")
    public java.util.List<String> riskLevelList;

    /**
     * <p>The IP address of the attack source.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>47.92.139.**</p>
     */
    @NameInMap("SrcIp")
    public String srcIp;

    /**
     * <p>The start time in timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1681624877761</p>
     */
    @NameInMap("StartTimeStamp")
    public Long startTimeStamp;

    /**
     * <p>The type of attack source statistics information. Valid values:</p>
     * <ul>
     * <li><strong>TOP_ATTACKED_AGENT</strong>: the top 5 probes by number of attacks.</li>
     * <li><strong>TOP_ATTACKED_IP</strong>: the top 5 IP addresses by number of attacks.</li>
     * <li><strong>ATTACK_EVENT_TYPE</strong>: the intrusion event type.</li>
     * <li><strong>ATTACK_HONEYPOT_TYPE</strong>: the type of the compromised honeypot.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TOP_ATTACKED_IP</p>
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
