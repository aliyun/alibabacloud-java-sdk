// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSuspiciousOverallConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the feature. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: yes</li>
     * <li><strong>off</strong>: no</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("Config")
    public String config;

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
     * <p>Specifies whether to configure assets for the feature. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong>: no</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect only when you set <strong>Config</strong> to <strong>on</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NoTargetAsOn")
    public Boolean noTargetAsOn;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>222.178.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the feature. Valid values:</p>
     * <ul>
     * <li><strong>auto_breaking</strong>: Anti-Virus</li>
     * <li><strong>ransomware_breaking</strong>: Anti-ransomware (Bait Capture)</li>
     * <li><strong>webshell_cloud_breaking</strong>: Webshell Protection</li>
     * <li><strong>alinet</strong>: Behavior prevention</li>
     * <li><strong>k8s_log_analysis</strong>: K8s Threat Detection</li>
     * <li><strong>alisecguard</strong>: Defense mode for Client Protection</li>
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
