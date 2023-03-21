// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FixCheckWarningsRequest extends TeaModel {
    @NameInMap("CheckParams")
    public String checkParams;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RiskId")
    public Long riskId;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Uuids")
    public String uuids;

    public static FixCheckWarningsRequest build(java.util.Map<String, ?> map) throws Exception {
        FixCheckWarningsRequest self = new FixCheckWarningsRequest();
        return TeaModel.build(map, self);
    }

    public FixCheckWarningsRequest setCheckParams(String checkParams) {
        this.checkParams = checkParams;
        return this;
    }
    public String getCheckParams() {
        return this.checkParams;
    }

    public FixCheckWarningsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public FixCheckWarningsRequest setRiskId(Long riskId) {
        this.riskId = riskId;
        return this;
    }
    public Long getRiskId() {
        return this.riskId;
    }

    public FixCheckWarningsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public FixCheckWarningsRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
