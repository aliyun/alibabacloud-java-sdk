// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSuspiciousTargetConfigRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The configuration of proactive defense for your server. The value includes the following fields:</p>
     * <ul>
     * <li><strong>targetType</strong>: specifies the dimension from which you manage proactive defense. UUIDs are supported. Set the value to <strong>uuid</strong>.</li>
     * <li><strong>target</strong>: specifies the UUID of the server for which you want to configure proactive defense.</li>
     * <li><strong>flag</strong>: specifies whether to enable or disable proactive defense for your server. Valid values are <strong>add</strong> and <strong>del</strong>. The value add indicates that proactive defense will be enabled for your server. The value del indicates that proactive defense will be disabled for your server.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;[{&quot;targetType&quot;:&quot;uuid&quot;,&quot;target&quot;:&quot;0585f81a-dd84-4ddf-9971-f59d12345678&quot;,&quot;flag&quot;:&quot;add&quot;},{&quot;targetType&quot;:&quot;uuid&quot;,&quot;target&quot;:&quot;01acfd9d-e6a4-4e61-b9eb-aae012345678&quot;,&quot;flag&quot;:&quot;add&quot;},{&quot;targetType&quot;:&quot;uuid&quot;,&quot;target&quot;:&quot;04a0e735-ad32-4835-b635-045812345678&quot;,&quot;flag&quot;:&quot;add&quot;}]&quot;</p>
     */
    @NameInMap("TargetOperations")
    public String targetOperations;

    /**
     * <p>The dimension from which you manage proactive defense. Only the server UUID dimension is supported.</p>
     * <p>Set the value to <strong>uuid</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>uuid</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The type of proactive defense. Valid Values:</p>
     * <ul>
     * <li><strong>auto_breaking</strong>: automatic blocking</li>
     * <li><strong>webshell_cloud_breaking</strong>: webshell defense</li>
     * <li><strong>alinet</strong>: malicious behavior defense</li>
     * <li><strong>ransomware_breaking</strong>: ransomware capture</li>
     * <li><strong>alisecguard</strong>: client protection</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>auto_breaking</p>
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
