// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSuspiciousTargetConfigRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The configuration of proactive defense for your server. The value includes the following fields:</p>
     * <br>
     * <p>*   **targetType**: specifies the dimension from which you manage proactive defense. UUIDs are supported. Set the value to **uuid**.</p>
     * <p>*   **target**: specifies the UUID of the server for which you want to configure proactive defense.</p>
     * <p>*   **flag**: specifies whether to enable or disable proactive defense for your server. Valid values are **add** and **del**. The value add indicates that proactive defense will be enabled for your server. The value del indicates that proactive defense will be disabled for your server.</p>
     */
    @NameInMap("TargetOperations")
    public String targetOperations;

    /**
     * <p>The dimension from which you manage proactive defense. Only the server UUID dimension is supported.</p>
     * <br>
     * <p>Set the value to **uuid**.</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The type of proactive defense. Valid Values:</p>
     * <br>
     * <p>*   **auto_breaking**: automatic blocking</p>
     * <p>*   **webshell_cloud_breaking**: webshell defense</p>
     * <p>*   **alinet**: malicious behavior defense</p>
     * <p>*   **ransomware_breaking**: ransomware capture</p>
     * <p>*   **alisecguard**: client protection</p>
     */
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
