// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateCommonOverallConfigRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. Different requests must use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The switch status. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enabled.</li>
     * <li><strong>off</strong>: disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>Specifies whether asset configuration is required. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Required.</li>
     * <li><strong>false</strong>: Not required.<blockquote>
     * <p>This parameter takes effect only when <strong>config</strong> is set to <strong>on</strong>.</p>
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
     * <li><strong>kdump_switch</strong>: proactive defense optimization</li>
     * <li><strong>threat_detect</strong>: adaptive threat detection capability</li>
     * <li><strong>suspicious_aggregation</strong>: alert associate</li>
     * <li><strong>alidetect</strong>: file detection</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_38857</strong>: Linux entry service execute high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50858</strong>: Linux web service execute high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50859</strong>: Linux entry service execute suspicious operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50862</strong>: Linux Cloud Assistant advanced protection</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50867</strong>: Linux malicious file implantation</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50868</strong>: Linux suspicious file implantation</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_64025</strong>: Linux entry service execute commands [enhanced mode]</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51229</strong>: Windows browser service execute high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51230</strong>: Windows entry service execute suspicious operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51232</strong>: Windows system process execute high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51233</strong>: Windows Java service execute high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51234</strong>: Windows Office component execute high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51235</strong>: Windows web service execute high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52820</strong>: Windows malicious file implantation</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52826</strong>: Windows entry service execute high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_55251</strong>: Windows database service execute high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_63725</strong>: Windows entry service implanting suspicious scripts/binary files</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_3277</strong>: Linux suspicious process startup</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50983</strong>: Linux obfuscation commands</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51200</strong>: Linux command line downloading and running malicious files</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_71131</strong>: Linux entry service execute suspicious behavior sequence</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51225</strong>: Windows PowerShell execute high-risk commands</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51226</strong>: Windows PowerShell execute suspicious commands</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52821</strong>: Windows suspicious process startup</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_57242</strong>: Windows malicious command execution</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_57340</strong>: Windows command line downloading and running malicious files</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_39659</strong>: Windows sensitive registry key protection</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52816</strong>: Windows high-risk account manipulation</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54365</strong>: Windows creating service auto-start items</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54366</strong>: Windows creating high-risk auto-start items</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54367</strong>: Windows creating scheduled task auto-start items</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54368</strong>: Windows creating registry auto-start items</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54369</strong>: Windows creating WMI auto-start items</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50869</strong>: Linux privilege escalation execute high-risk commands</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_53272</strong>: Linux kernel vulnerability privilege escalation</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54395</strong>: Linux privilege escalation reading/writing sensitive files</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_57897</strong>: Linux suspected privilege escalation behavior</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52825</strong>: Windows privilege escalation execute high-risk commands</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_5507</strong>: Linux malicious driver</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50876</strong>: Linux anti-security software</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_53168</strong>: Linux process debugging</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54699</strong>: Linux dynamic-link library hijacking</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_62981</strong>: Linux bypassing security monitoring</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52815</strong>: Windows loading high-risk drivers</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52823</strong>: Windows running high-risk ARK tools</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54373</strong>: Windows anti-security software</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54374</strong>: Windows intrusion trace cleanup</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54265</strong>: Linux PAM module hijacking</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54953</strong>: Linux HashDump attack</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54383</strong>: Windows MimiKatz credential theft</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54384</strong>: Windows HashDump attack</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50861</strong>: Linux information reconnaissance</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52818</strong>: Windows information reconnaissance</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54034</strong>: Linux internal network scanning</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51228</strong>: Windows high-risk lateral movement tools</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50870</strong>: Linux reverse shell</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50873</strong>: WebShell command execution</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51236</strong>: Windows reverse shell</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50877</strong>: Linux malicious program communication</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50884</strong>: Linux suspicious worm script behavior</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50885</strong>: Linux malicious script behavior</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51201</strong>: Linux ransomware virus</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51202</strong>: Linux suspicious ransomware behavior</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52827</strong>: Windows ransomware virus</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52828</strong>: Windows suspicious ransomware behavior</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52829</strong>: Windows delete system backup behavior</li>
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
