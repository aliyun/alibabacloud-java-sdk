// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSuspiciousOverallConfigRequest extends TeaModel {
    // Specifies whether to enable the feature. Valid values:
    // 
    // *   **on**: yes
    // *   **off**: no
    @NameInMap("Config")
    public String config;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // Specifies whether to configure assets for the feature. Default value: **false**. Valid values:
    // 
    // *   **true**: yes
    // *   **false**: no
    // 
    // >  This parameter takes effect only when you set **Config** to **on**.
    @NameInMap("NoTargetAsOn")
    public Boolean noTargetAsOn;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The type of the feature. Valid values:
    // 
    // *   **auto_breaking**: Anti-Virus
    // *   **ransomware_breaking**: Anti-ransomware (Bait Capture)
    // *   **webshell\_cloud_breaking**: Webshell Protection
    // *   **alinet**: Behavior prevention
    // *   **k8s\_log_analysis**: K8s Threat Detection
    // *   **alisecguard**: Defense mode for Client Protection
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
