// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BatchOperateCommonOverallConfigRequest extends TeaModel {
    /**
     * <p>The status of the feature. Valid values:</p>
     * <br>
     * <p>*   **on**: enabled</p>
     * <p>*   **off**: disabled</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The type of the feature in proactive defense. Valid values:</p>
     * <br>
     * <p>*   **kdump_switch**: Active defense experience optimization</p>
     * <p>*   **threat_detect**: Dynamic adaptive threat detection capability</p>
     * <p>*   **suspicious_aggregation**: Alert Association</p>
     * <p>*   **alidetect**: File Test</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_38857**: Entrance service execution high-risk operation (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50858**: Web service performs high-risk operations (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50859**: Entrance service execution suspicious operation (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50862**: Cloud Assistant Advanced Protection (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50867**: Create malicious files (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50868**: Create suspicious files (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_64025**: Ingress service execute command [enhanced mode] (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51229**: Browser service execution a high-risk operation (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51230**: Entrance service execution suspicious operation (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51232**: System processes execution high-risk operations (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51233**: Java service execution high-risk operations (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51234**: Office components execution high-risk operations (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51235**: Web service performs high-risk operations (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52820**: Create malicious files (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52826**: Entrance service execution high-risk operation (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_55251**: Database services execution high-risk operations (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_63725**: Ingress service implants suspicious script/binary file (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_3277**: Suspicious process startup (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50983**: obfuscated command (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51200**: Command line download and run malicious files (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_71131**: Ingress service executes sequence of suspicious behavior (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51225**: Powershell executes high-risk commands (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51226**: Powershell execute suspicious command (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52821**: Suspicious process startup (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_57242**: Malicious command execution (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_57340**: Command line download and run malicious files (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_39659**: Sensitive Registry Key Protection (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52816**: high-risk account manipulation behavior (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54365**: Create service autorun item (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54366**: Create high-risk autorun item (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54367**: Create scheduled task autorun item (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54368**: Create registry autorun item (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54369**: Create WMI autorun item (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50869**: Unauthorized execution of high-risk orders (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_53272**: Exploiting Kernel Vulnerabilities to Elevate Privileges (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54395**: Unauthorized reading and writing of sensitive files (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_57897**: suspected privilege escalation (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52825**: Unauthorized execution of high-risk orders (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_5507**: malicious drivers (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50876**: Against security software (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_53168**: process debugging (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54699**: Hijack dynamic link library (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_62981**: Bypassing security monitoring (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52815**: Load high-risk drivers (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52823**: Running high-risk ARK tools (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54373**: Against security software (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54374**: Intrusion trace cleanup (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54265**: Hijacking the PAM Module (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54953**: Hashdump Attack (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54383**: MimiKatz Credential Stealing (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54384**: Hashdump Attack (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50861**: Information detection (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52818**: Information detection (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_54034**: Intranet scan (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51228**: High-risk lateral penetration tools (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50870**: Rebound Shell (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50873**: WebShell execute command</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51236**: Rebound Shell (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50877**: Malicious soft communication (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50884**: Suspicious worm script behavior (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_50885**: malicious script behavior (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51201**: ransomware (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_51202**: Suspected Extortion (Linux)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52827**: ransomware (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52828**: Suspected Extortion (Windows)</p>
     * <p>*   **USER-ENABLE-SWITCH-TYPE_52829**: delete system backup behavior (Windows)</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TypeList")
    public java.util.List<String> typeList;

    public static BatchOperateCommonOverallConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchOperateCommonOverallConfigRequest self = new BatchOperateCommonOverallConfigRequest();
        return TeaModel.build(map, self);
    }

    public BatchOperateCommonOverallConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public BatchOperateCommonOverallConfigRequest setTypeList(java.util.List<String> typeList) {
        this.typeList = typeList;
        return this;
    }
    public java.util.List<String> getTypeList() {
        return this.typeList;
    }

}
