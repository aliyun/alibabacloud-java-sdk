// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSuspiciousOverallConfigRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("NoTargetAsOn")
    public Boolean noTargetAsOn;

    /**
     * <p>OperateSuspiciousOverallConfig</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Type")
    public String type;

    public static OperateSuspiciousOverallConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateSuspiciousOverallConfigRequest self = new OperateSuspiciousOverallConfigRequest();
        return TeaModel.build(map, self);
    }

    public OperateSuspiciousOverallConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public OperateSuspiciousOverallConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public OperateSuspiciousOverallConfigRequest setNoTargetAsOn(Boolean noTargetAsOn) {
        this.noTargetAsOn = noTargetAsOn;
        return this;
    }
    public Boolean getNoTargetAsOn() {
        return this.noTargetAsOn;
    }

    public OperateSuspiciousOverallConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public OperateSuspiciousOverallConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
