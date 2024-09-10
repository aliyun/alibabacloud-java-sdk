// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonOverallConfigRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>59.61.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the feature. Valid values:</p>
     * <ul>
     * <li><strong>kdump_switch</strong>: Active defense experience optimization</li>
     * <li><strong>threat_detect</strong>: Dynamic adaptive threat detection capability</li>
     * <li><strong>suspicious_aggregation</strong>: Alert Association</li>
     * <li><strong>alidetect</strong>: File Test</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_3277</strong>: Suspicious process startup</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_5507</strong>: malicious drivers</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_38857</strong>: Entrance service execution high-risk operation</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50858</strong>: Web service performs high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50859</strong>: Entrance service execution suspicious operation</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50861</strong>: Information detection</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50862</strong>: Cloud Assistant Advanced Protection</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50867</strong>: Create malicious files</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50868</strong>: Create suspicious files</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50869</strong>: Unauthorized execution of high-risk orders</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50870</strong>: Rebound Shell</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50873</strong>: WebShell execute command</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50876</strong>: Against security software</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50877</strong>: Malicious soft communication</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50884</strong>: Suspicious worm script behavior</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50885</strong>: malicious script behavior</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50983</strong>: obfuscated command</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51200</strong>: Command line download and run malicious files</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51201</strong>: ransomware</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51202</strong>: Suspected Extortion</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_53168</strong>: process debugging</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_53272</strong>: Exploiting Kernel Vulnerabilities to Elevate Privileges</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54034</strong>: Intranet scan</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54265</strong>: Hijacking the PAM Module</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54395</strong>: Unauthorized reading and writing of sensitive files</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54699</strong>: Hijack dynamic link library</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54953</strong>: Hashdump Attack</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_57897</strong>: suspected privilege escalation</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_62981</strong>: Bypassing security monitoring</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_64025</strong>: Ingress service execute command [enhanced mode]</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_39659</strong>: Sensitive Registry Key Protection</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51225</strong>: Powershell executes high-risk commands</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51226</strong>: Powershell execute suspicious command</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51228</strong>: High-risk lateral penetration tools</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51229</strong>: Browser service execution a high-risk operation</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51230</strong>: Entrance service execution suspicious operation</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51232</strong>: System processes execution high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51233</strong>: Java service execution high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51234</strong>: Office components execution high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51235</strong>: Web service performs high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51236</strong>: Rebound shells</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52815</strong>: Load high-risk drivers</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52816</strong>: high-risk account manipulation behavior</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52818</strong>: Information detection</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52820</strong>: Create malicious files</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52821</strong>: Suspicious process startup</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52823</strong>: Running high-risk ARK tools</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52825</strong>: Unauthorized execution of high-risk orders</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52826</strong>: Entrance service execution high-risk operation</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52827</strong>: Ransomware</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52828</strong>: Suspected Extortion</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52829</strong>: delete system backup behavior</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54168</strong>: LSA security permission service protection</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54365</strong>: Create service autorun item</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54366</strong>: Create high-risk autorun item</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54367</strong>: Create scheduled task autorun item</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54368</strong>: Create registry autorun item</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54369</strong>: Create WMI autorun item</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54373</strong>: Against security software</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54374</strong>: Intrusion trace cleanup</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54384</strong>: Hashdump Attack</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_55251</strong>: Database services execution high-risk operations</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_57242</strong>: Malicious command execution</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_57340</strong>: Command line download and run malicious files</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_62357</strong>: Cloud Assistant service information detection</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_63725</strong>: Ingress service implants suspicious script/binary file</li>
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
