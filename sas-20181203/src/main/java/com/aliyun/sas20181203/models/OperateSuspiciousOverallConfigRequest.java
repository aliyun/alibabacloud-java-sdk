// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSuspiciousOverallConfigRequest extends TeaModel {
    /**
     * <p>The switch status. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enable</li>
     * <li><strong>off</strong>: Disable</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>Specifies whether asset configuration is required. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Required</li>
     * <li><strong>false</strong>: Not required<blockquote>
     * <p>This value takes effect only when <strong>config</strong> is set to <strong>on</strong>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NoTargetAsOn")
    public Boolean noTargetAsOn;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>222.178.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The switch type. Valid values:</p>
     * <ul>
     * <li><strong>auto_breaking</strong>: Anti-virus</li>
     * <li><strong>ransomware_breaking</strong>: Anti-ransomware (bait capture)</li>
     * <li><strong>webshell_cloud_breaking</strong>: Website backdoor connection defense</li>
     * <li><strong>alinet</strong>: Malicious network behavior defense</li>
     * <li><strong>k8s_log_analysis</strong>: Container K8s threat detection</li>
     * <li><strong>alisecguard</strong>: Client self-protection defense mode</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>k8s_log_analysis</p>
     */
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
