// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonOverallConfigRequest extends TeaModel {
    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>59.61.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The configuration type. Valid values:</p>
     * <ul>
     * <li><strong>kdump_switch</strong>: proactive defense optimization</li>
     * <li><strong>threat_detect</strong>: adaptive threat detection</li>
     * <li><strong>suspicious_aggregation</strong>: alert association</li>
     * <li><strong>alidetect</strong>: file detection</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_3277</strong>: suspicious process startup</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_5507</strong>: malicious driver</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_38857</strong>: entry service performing high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50858</strong>: web service performing high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50859</strong>: entry service performing suspicious operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50861</strong>: information probing</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50862</strong>: Cloud Assistant advanced protection</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50867</strong>: malicious file implantation</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50868</strong>: suspicious file implantation</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50869</strong>: unauthorized execution of high-risk commands</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50870</strong>: reverse shell</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50873</strong>: WebShell command execution</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50876</strong>: anti-security software</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50877</strong>: malicious program communication</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50884</strong>: suspicious worm script behavior</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50885</strong>: malicious script behavior</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50983</strong>: obfuscated commands</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51200</strong>: downloading and running malicious files from the command line</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51201</strong>: ransomware</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51202</strong>: suspicious ransomware behavior</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_53168</strong>: process debugging</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_53272</strong>: privilege escalation by exploiting kernel vulnerabilities</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54034</strong>: internal network scanning</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54265</strong>: PAM module hijacking</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54395</strong>: unauthorized read/write of sensitive files</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54699</strong>: dynamic-link library hijacking</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54953</strong>: HashDump attack</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_57897</strong>: suspected privilege escalation behavior</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_62981</strong>: bypassing security monitoring</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_64025</strong>: entry service command execution [enhanced mode]</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_39659</strong>: sensitive registry key protection</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51225</strong>: Powershell executing high-risk commands</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51226</strong>: Powershell executing suspicious commands</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51228</strong>: high-risk lateral movement tools</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51229</strong>: browser service performing high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51230</strong>: entry service performing suspicious operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51232</strong>: system process performing high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51233</strong>: Java service performing high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51234</strong>: Office component performing high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51235</strong>: web service performing high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51236</strong>: reverse shell</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52815</strong>: loading high-risk drivers</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52816</strong>: high-risk account manipulation</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52818</strong>: information probing</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52820</strong>: malicious file implantation</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52821</strong>: suspicious process startup</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52823</strong>: running high-risk ARK tools</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52825</strong>: unauthorized execution of high-risk commands</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52826</strong>: entry service performing high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52827</strong>: ransomware</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52828</strong>: suspicious ransomware behavior</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52829</strong>: system backup deletion behavior</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54168</strong>: LSA security authority service protection</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54365</strong>: creating service auto-start items</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54366</strong>: creating high-risk auto-start items</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54367</strong>: creating scheduled task auto-start items</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54368</strong>: creating registry auto-start items</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54369</strong>: creating WMI auto-start items</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54373</strong>: anti-security software</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54374</strong>: intrusion trace cleanup</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54384</strong>: HashDump attack</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_55251</strong>: database service performing high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_57242</strong>: malicious command execution</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_57340</strong>: downloading and running malicious files from the command line</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_62357</strong>: Cloud Assistant service information probing</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_63725</strong>: entry service implanting suspicious scripts or binary files.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kdump_switch</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeCommonOverallConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonOverallConfigRequest self = new DescribeCommonOverallConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommonOverallConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeCommonOverallConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
