// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotAttackStatisticsRequest extends TeaModel {
    /**
     * <p>Set the page number from which to start displaying the query results. The starting value is <strong>1</strong>. The default value is <strong>1</strong>, indicating that the display starts from the <strong>1st</strong> page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>End time, in timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1675058931215</p>
     */
    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    /**
     * <p>Sets the language type for requests and received messages, default is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese </li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies the maximum number of data entries displayed per page for paginated queries. The default number of entries displayed per page is 20. If the pagesize parameter is empty, 20 entries will be returned by default. It is recommended that the pagesize value should not be empty.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>List of risk levels</p>
     */
    @NameInMap("RiskLevelList")
    public java.util.List<String> riskLevelList;

    /**
     * <p>Attacker\&quot;s IP</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>47.92.139.**</p>
     */
    @NameInMap("SrcIp")
    public String srcIp;

    /**
     * <p>Start time, in timestamp format.</p>
     * 
     * <strong>example:</strong>
     * <p>1681624877761</p>
     */
    @NameInMap("StartTimeStamp")
    public Long startTimeStamp;

    /**
     * <p>The type of attack source statistics. Values:</p>
     * <ul>
     * <li><strong>TOP_ATTACKED_AGENT</strong>: Top 5 most attacked probes. </li>
     * <li><strong>TOP_ATTACKED_IP</strong>: Top 5 most attacked IP addresses.</li>
     * <li><strong>ATTACK_EVENT_TYPE</strong>: Type of intrusion event. </li>
     * <li><strong>ATTACK_HONEYPOT_TYPE</strong>: Type of compromised honeypot.</li>
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
