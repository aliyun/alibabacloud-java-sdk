// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetConfigRequest extends TeaModel {
    /**
     * <p>The configuration type. Valid values:</p>
     * <ul>
     * <li><strong>kdump_switch</strong>: Active defense experience optimization.</li>
     * <li><strong>threat_detect</strong>: Adaptive threat detection.</li>
     * <li><strong>containerNetwork</strong>: Container network topology.</li>
     * <li><strong>interceptionSwitch</strong>: Cluster microsegmentation.</li>
     * <li><strong>suspicious_aggregation</strong>: Alert association.</li>
     * <li><strong>alidetect</strong>: File detection.</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_38857</strong>: Entrance service performs high-risk operations (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50858</strong>: Web service performs high-risk operations (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50859</strong>: Entrance service performs suspicious operations (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50862</strong>: Cloud Assistant advanced protection for Linux.</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50867</strong>: Injects malicious files (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50868</strong>: Injects suspicious files (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_64025</strong>: Entrance service executes commands in an enhanced mode (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51229</strong>: Browser service performs high-risk operations (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51230</strong>: Entrance service performs suspicious operations (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51232</strong>: System processes perform high-risk operations (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51233</strong>: Java service performs high-risk operations (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51234</strong>: Office components perform high-risk operations (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51235</strong>: Web service performs high-risk operations (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52820</strong>: Injects malicious files (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52826</strong>: Entrance service performs high-risk operations (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_55251</strong>: Database services perform high-risk operations (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_63725</strong>: Entrance service injects suspicious scripts or binary files (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_3277</strong>: Suspicious process startup (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50983</strong>: Obfuscated commands (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51200</strong>: Uses command line to download and run malicious files (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_71131</strong>: Entrance service executes sequence of suspicious behavior (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51225</strong>: Powershell executes high-risk commands (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51226</strong>: Powershell executes suspicious commands (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52821</strong>: Suspicious process startup (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_57242</strong>: Malicious command execution (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_57340</strong>: Uses command line to download and run malicious files (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_39659</strong>: Sensitive registry key protection (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52816</strong>: High-risk account manipulation behavior (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54365</strong>: Creates service auto-startup items (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54366</strong>: Creates high-risk auto-startup items (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54367</strong>: Creates scheduled task auto-startup items (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54368</strong>: Creates registry auto-startup items (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54369</strong>: Creates WMI auto-startup items (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50869</strong>: Unauthorized execution of high-risk commands (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_53272</strong>: Exploits kernel vulnerabilities to elevate privileges (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54395</strong>: Unauthorized reading and writing of sensitive files (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_57897</strong>: Suspected privilege escalation (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52825</strong>: Unauthorized execution of high-risk commands (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_5507</strong>: Malicious drivers (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50876</strong>: Uninstalls security software (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_53168</strong>: Process debugging (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54699</strong>: Hijacks dynamic link library (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_62981</strong>: Bypasses security monitoring (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52815</strong>: Loads high-risk drivers (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52823</strong>: Runs high-risk anti-rootkit (ARK) tools (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54373</strong>: Uninstalls security software (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54374</strong>: Intrusion trace cleanup (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54265</strong>: Hijacks the pluggable authentication module (PAM) (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54953</strong>: Hashdump attack (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54383</strong>: MimiKatz credential stealing (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54384</strong>: Hashdump attack (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50861</strong>: Information detection (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52818</strong>: Information detection (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_54034</strong>: Intranet scan (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51228</strong>: High-risk lateral penetration tools (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50870</strong>: Rebound shell (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50873</strong>: WebShell executes commands.</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51236</strong>: Rebound shell (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50877</strong>: Malicious program communication (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50884</strong>: Suspicious worm script behavior (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_50885</strong>: Malicious script behavior (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51201</strong>: Ransomware (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_51202</strong>: Suspected extortion (Linux).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52827</strong>: Ransomware (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52828</strong>: Suspected extortion (Windows).</li>
     * <li><strong>USER-ENABLE-SWITCH-TYPE_52829</strong>: Deletes system backup behavior (Windows).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kdump_switch</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeCommonTargetConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonTargetConfigRequest self = new DescribeCommonTargetConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCommonTargetConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
