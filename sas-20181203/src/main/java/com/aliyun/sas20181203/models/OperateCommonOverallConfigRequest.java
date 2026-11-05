// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateCommonOverallConfigRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. Different requests must use different tokens. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The switch status. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled</li>
     * <li><strong>off</strong>: disabled</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>Specifies whether to only precheck the request. Valid values: true: Prechecks the request without performing the actual operation. false: Performs the actual operation.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether assets need to be configured. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: required</li>
     * <li><strong>false</strong>: not required<blockquote>
     * <p>This value is valid only when <strong>Config</strong> is set to <strong>on</strong>.</p>
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
     * <p>223.79.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The configuration type. Valid values:</p>
     * <ul>
     * <li><strong>kdump_switch</strong>: proactive defense optimization experience</li>
     * <li><strong>threat_detect</strong>: adaptive threat detection capability</li>
     * <li><strong>suspicious_aggregation</strong>: alerting associate</li>
     * <li><strong>alidetect</strong>: file detection</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_38857</strong>: high-risk operations executed by Linux entry services</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50858</strong>: high-risk operations executed by Linux web services</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50859</strong>: suspicious operations executed by Linux entry services</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50862</strong>: advanced protection for Linux Cloud Assistant</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50867</strong>: malicious file implantation in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50868</strong>: suspicious file implantation in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_64025</strong>: command execution by Linux entry services [enhanced pattern]</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51229</strong>: high-risk operations executed by Windows browser services</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51230</strong>: suspicious operations executed by Windows entry services</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51232</strong>: high-risk operations executed by Windows system processes</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51233</strong>: high-risk operations executed by Windows Java services</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51234</strong>: high-risk operations executed by Windows Office components</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51235</strong>: high-risk operations executed by Windows web services</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52820</strong>: malicious file implantation in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52826</strong>: high-risk operations executed by Windows entry services</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_55251</strong>: high-risk operations executed by Windows database services</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_63725</strong>: suspicious script or binary file implantation by Windows entry services</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_3277</strong>: suspicious process startup in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50983</strong>: command obfuscation in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51200</strong>: downloading and running malicious files via Linux command line</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_71131</strong>: suspicious behavior sequences executed by Linux entry services</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51225</strong>: high-risk commands executed by Windows PowerShell</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51226</strong>: suspicious commands executed by Windows PowerShell</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52821</strong>: suspicious process startup in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_57242</strong>: malicious command execution in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_57340</strong>: downloading and running malicious files via Windows command line</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_39659</strong>: sensitive registry key protection in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52816</strong>: high-risk account manipulation in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54365</strong>: creation of service auto-start items in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54366</strong>: creation of high-risk auto-start items in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54367</strong>: creation of scheduled node auto-start items in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54368</strong>: creation of registry auto-start items in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54369</strong>: creation of WMI auto-start items in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50869</strong>: unauthorized execution of high-risk commands in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_53272</strong>: privilege escalation by exploiting kernel vulnerabilities in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54395</strong>: unauthorized reading and writing of sensitive files in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_57897</strong>: suspected privilege escalation in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52825</strong>: unauthorized execution of high-risk commands in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_5507</strong>: malicious drivers in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50876</strong>: evasion of security software in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_53168</strong>: process debugging in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54699</strong>: dynamic-link library hijacking in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_62981</strong>: bypassing security monitoring in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52815</strong>: loading of high-risk drivers in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52823</strong>: running high-risk ARK tools in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54373</strong>: evasion of security software in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54374</strong>: clearing intrusion traces in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54265</strong>: PAM module hijacking in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54953</strong>: HashDump attacks in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54383</strong>: credential theft by Mimikatz in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54384</strong>: HashDump attacks in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50861</strong>: information probing in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52818</strong>: information probing in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54034</strong>: internal network scanning in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51228</strong>: high-risk lateral movement tools in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50870</strong>: reverse shells in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50873</strong>: command execution by web shells</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51236</strong>: reverse shells in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50877</strong>: malicious program communication in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50884</strong>: suspicious worm script behavior in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50885</strong>: malicious script behavior in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51201</strong>: ransomware virus in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51202</strong>: suspicious ransomware behavior in Linux</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52827</strong>: ransomware virus in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52828</strong>: suspicious ransomware behavior in Windows</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52829</strong>: delete system backups behavior in Windows</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kdump_switch</p>
     */
    @NameInMap("Type")
    public String type;

    public static OperateCommonOverallConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateCommonOverallConfigRequest self = new OperateCommonOverallConfigRequest();
        return TeaModel.build(map, self);
    }

    public OperateCommonOverallConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public OperateCommonOverallConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public OperateCommonOverallConfigRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public OperateCommonOverallConfigRequest setNoTargetAsOn(Boolean noTargetAsOn) {
        this.noTargetAsOn = noTargetAsOn;
        return this;
    }
    public Boolean getNoTargetAsOn() {
        return this.noTargetAsOn;
    }

    public OperateCommonOverallConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public OperateCommonOverallConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
