// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSuspiciousTargetConfigRequest extends TeaModel {
    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The configuration of proactive defense for your server. The value includes the following fields:
    // 
    // *   **targetType**: specifies the dimension from which you manage proactive defense. UUIDs are supported. Set the value to **uuid**.
    // *   **target**: specifies the UUID of the server for which you want to configure proactive defense.
    // *   **flag**: specifies whether to enable or disable proactive defense for your server. Valid values are **add** and **del**. The value add indicates that proactive defense will be enabled for your server. The value del indicates that proactive defense will be disabled for your server.
    @NameInMap("TargetOperations")
    public String targetOperations;

    // The dimension from which you manage proactive defense. Only the server UUID dimension is supported.
    // 
    // Set the value to **uuid**.
    @NameInMap("TargetType")
    public String targetType;

    // The type of proactive defense. Valid Values:
    // 
    // *   **auto_breaking**: automatic blocking
    // *   **webshell_cloud_breaking**: webshell defense
    // *   **alinet**: malicious behavior defense
    // *   **ransomware_breaking**: ransomware capture
    // *   **alisecguard**: client protection
    @NameInMap("Type")
    public String type;

    public static OperateSuspiciousTargetConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateSuspiciousTargetConfigRequest self = new OperateSuspiciousTargetConfigRequest();
        return TeaModel.build(map, self);
    }

    public OperateSuspiciousTargetConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public OperateSuspiciousTargetConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public OperateSuspiciousTargetConfigRequest setTargetOperations(String targetOperations) {
        this.targetOperations = targetOperations;
        return this;
    }
    public String getTargetOperations() {
        return this.targetOperations;
    }

    public OperateSuspiciousTargetConfigRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public OperateSuspiciousTargetConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
