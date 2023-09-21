// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotEventTrendRequest extends TeaModel {
    @NameInMap("EndTimeStamp")
    public Long endTimeStamp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RiskLevelList")
    public java.util.List<String> riskLevelList;

    @NameInMap("SrcIp")
    public String srcIp;

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
