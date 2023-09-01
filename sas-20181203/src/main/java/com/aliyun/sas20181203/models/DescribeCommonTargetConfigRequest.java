// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonTargetConfigRequest extends TeaModel {
    /**
     * <p>The configuration type. Valid values:</p>
     * <br>
     * <p>*   **kdump_switch**: Active defense experience optimization.</p>
     * <p>*   **threat_detect**: Adaptive threat detection.</p>
     * <p>*   **containerNetwork**: Container network topology.</p>
     * <p>*   **interceptionSwitch**: Cluster microsegmentation.</p>
     * <p>*   **suspicious_aggregation**: Alert association.</p>
     * <p>*   **alidetect**: File detection.</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_38857**: Entrance service performs high-risk operations (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_50858**: Web service performs high-risk operations (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_50859**: Entrance service performs suspicious operations (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_50862**: Cloud Assistant advanced protection for Linux.</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_50867**: Injects malicious files (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_50868**: Injects suspicious files (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_64025**: Entrance service executes commands in an enhanced mode (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_51229**: Browser service performs high-risk operations (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_51230**: Entrance service performs suspicious operations (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_51232**: System processes perform high-risk operations (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_51233**: Java service performs high-risk operations (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_51234**: Office components perform high-risk operations (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_51235**: Web service performs high-risk operations (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_52820**: Injects malicious files (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_52826**: Entrance service performs high-risk operations (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_55251**: Database services perform high-risk operations (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_63725**: Entrance service injects suspicious scripts or binary files (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_3277**: Suspicious process startup (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_50983**: Obfuscated commands (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_51200**: Uses command line to download and run malicious files (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_71131**: Entrance service executes sequence of suspicious behavior (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_51225**: Powershell executes high-risk commands (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_51226**: Powershell executes suspicious commands (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_52821**: Suspicious process startup (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_57242**: Malicious command execution (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_57340**: Uses command line to download and run malicious files (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_39659**: Sensitive registry key protection (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_52816**: High-risk account manipulation behavior (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_54365**: Creates service auto-startup items (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_54366**: Creates high-risk auto-startup items (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_54367**: Creates scheduled task auto-startup items (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_54368**: Creates registry auto-startup items (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_54369**: Creates WMI auto-startup items (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_50869**: Unauthorized execution of high-risk commands (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_53272**: Exploits kernel vulnerabilities to elevate privileges (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_54395**: Unauthorized reading and writing of sensitive files (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_57897**: Suspected privilege escalation (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_52825**: Unauthorized execution of high-risk commands (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_5507**: Malicious drivers (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_50876**: Uninstalls security software (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_53168**: Process debugging (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_54699**: Hijacks dynamic link library (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_62981**: Bypasses security monitoring (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_52815**: Loads high-risk drivers (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_52823**: Runs high-risk anti-rootkit (ARK) tools (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_54373**: Uninstalls security software (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_54374**: Intrusion trace cleanup (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_54265**: Hijacks the pluggable authentication module (PAM) (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_54953**: Hashdump attack (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_54383**: MimiKatz credential stealing (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_54384**: Hashdump attack (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_50861**: Information detection (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_52818**: Information detection (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_54034**: Intranet scan (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_51228**: High-risk lateral penetration tools (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_50870**: Rebound shell (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_50873**: WebShell executes commands.</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_51236**: Rebound shell (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_50877**: Malicious program communication (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_50884**: Suspicious worm script behavior (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_50885**: Malicious script behavior (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_51201**: Ransomware (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_51202**: Suspected extortion (Linux).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_52827**: Ransomware (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_52828**: Suspected extortion (Windows).</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE\_52829**: Deletes system backup behavior (Windows).</p>
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
