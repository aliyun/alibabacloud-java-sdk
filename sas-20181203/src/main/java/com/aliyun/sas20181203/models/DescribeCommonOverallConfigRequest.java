// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonOverallConfigRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the feature. Valid values:</p>
     * <br>
     * <p>*   **kdump_switch**: Active defense experience optimization</p>
     * <p>*   **threat_detect**: Dynamic adaptive threat detection capability</p>
     * <p>*   **suspicious_aggregation**: Alert Association</p>
     * <p>*   **alidetect**: File Test</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_3277**: Suspicious process startup</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_5507**: malicious drivers</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_38857**: Entrance service execution high-risk operation</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50858**: Web service performs high-risk operations</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50859**: Entrance service execution suspicious operation</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50861**: Information detection</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50862**: Cloud Assistant Advanced Protection</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50867**: Create malicious files</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50868**: Create suspicious files</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50869**: Unauthorized execution of high-risk orders</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50870**: Rebound Shell</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50873**: WebShell execute command</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50876**: Against security software</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50877**: Malicious soft communication</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50884**: Suspicious worm script behavior</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50885**: malicious script behavior</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50983**: obfuscated command</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51200**: Command line download and run malicious files</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51201**: ransomware</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51202**: Suspected Extortion</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_53168**: process debugging</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_53272**: Exploiting Kernel Vulnerabilities to Elevate Privileges</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54034**: Intranet scan</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54265**: Hijacking the PAM Module</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54395**: Unauthorized reading and writing of sensitive files</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54699**: Hijack dynamic link library</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54953**: Hashdump Attack</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_57897**: suspected privilege escalation</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_62981**: Bypassing security monitoring</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_64025**: Ingress service execute command [enhanced mode]</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_39659**: Sensitive Registry Key Protection</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51225**: Powershell executes high-risk commands</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51226**: Powershell execute suspicious command</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51228**: High-risk lateral penetration tools</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51229**: Browser service execution a high-risk operation</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51230**: Entrance service execution suspicious operation</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51232**: System processes execution high-risk operations</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51233**: Java service execution high-risk operations</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51234**: Office components execution high-risk operations</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51235**: Web service performs high-risk operations</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51236**: Rebound shells</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52815**: Load high-risk drivers</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52816**: high-risk account manipulation behavior</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52818**: Information detection</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52820**: Create malicious files</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52821**: Suspicious process startup</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52823**: Running high-risk ARK tools</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52825**: Unauthorized execution of high-risk orders</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52826**: Entrance service execution high-risk operation</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52827**: Ransomware</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52828**: Suspected Extortion</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52829**: delete system backup behavior</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54168**: LSA security permission service protection</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54365**: Create service autorun item</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54366**: Create high-risk autorun item</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54367**: Create scheduled task autorun item</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54368**: Create registry autorun item</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54369**: Create WMI autorun item</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54373**: Against security software</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54374**: Intrusion trace cleanup</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54384**: Hashdump Attack</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_55251**: Database services execution high-risk operations</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_57242**: Malicious command execution</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_57340**: Command line download and run malicious files</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_62357**: Cloud Assistant service information detection</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_63725**: Ingress service implants suspicious script/binary file</p>
     * <br>
     * <p>This parameter is required.</p>
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
