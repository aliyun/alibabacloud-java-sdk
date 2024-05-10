// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotEventTrendRequest extends TeaModel {
    /**
     * <p>End time, timestamp format.</p>
     */
    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The risk levels of the alert events.</p>
     */
    @NameInMap("RiskLevelList")
    public java.util.List<String> riskLevelList;

    /**
     * <p>The source IP address of the attack.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SrcIp")
    public String srcIp;

    /**
     * <p>Start time, timestamp format.</p>
     */
    @NameInMap("StartTimeStamp")
    public Long startTimeStamp;

    public static GetHoneypotEventTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotEventTrendRequest self = new GetHoneypotEventTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetHoneypotEventTrendRequest setEndTimeStamp(Long endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }
    public Long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public GetHoneypotEventTrendRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetHoneypotEventTrendRequest setRiskLevelList(java.util.List<String> riskLevelList) {
        this.riskLevelList = riskLevelList;
        return this;
    }
    public java.util.List<String> getRiskLevelList() {
        return this.riskLevelList;
    }

    public GetHoneypotEventTrendRequest setSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }
    public String getSrcIp() {
        return this.srcIp;
    }

    public GetHoneypotEventTrendRequest setStartTimeStamp(Long startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
        return this;
    }
    public Long getStartTimeStamp() {
        return this.startTimeStamp;
    }

}
