// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonOverallConfigResponseBody extends TeaModel {
    // The information about the feature.
    @NameInMap("OverallConfig")
    public DescribeCommonOverallConfigResponseBodyOverallConfig overallConfig;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCommonOverallConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonOverallConfigResponseBody self = new DescribeCommonOverallConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommonOverallConfigResponseBody setOverallConfig(DescribeCommonOverallConfigResponseBodyOverallConfig overallConfig) {
        this.overallConfig = overallConfig;
        return this;
    }
    public DescribeCommonOverallConfigResponseBodyOverallConfig getOverallConfig() {
        return this.overallConfig;
    }

    public DescribeCommonOverallConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCommonOverallConfigResponseBodyOverallConfig extends TeaModel {
        // The status of the feature. Valid values:
        // 
        // *   **on**: enabled
        // *   **off**: disabled
        @NameInMap("Config")
        public String config;

        // The type of the feature. Valid values:
        // 
        // *   **kdump_switch**: Active defense experience optimization
        // *   **threat_detect**: Dynamic adaptive threat detection capability
        // *   **suspicious_aggregation**: Alert Association
        // *   **alidetect**: File Test
        // *   **USER-ENABLE-SWITCH-TYPE\_3277**: Suspicious process startup
        // *   **USER-ENABLE-SWITCH-TYPE\_5507**: malicious drivers
        // *   **USER-ENABLE-SWITCH-TYPE\_38857**: Entrance service execution high-risk operation
        // *   **USER-ENABLE-SWITCH-TYPE\_50858**: Web service performs high-risk operations
        // *   **USER-ENABLE-SWITCH-TYPE\_50859**: Entrance service execution suspicious operation
        // *   **USER-ENABLE-SWITCH-TYPE\_50861**: Information detection
        // *   **USER-ENABLE-SWITCH-TYPE\_50862**: Cloud Assistant Advanced Protection
        // *   **USER-ENABLE-SWITCH-TYPE\_50867**: Create malicious files
        // *   **USER-ENABLE-SWITCH-TYPE\_50868**: Create suspicious files
        // *   **USER-ENABLE-SWITCH-TYPE\_50869**: Unauthorized execution of high-risk orders
        // *   **USER-ENABLE-SWITCH-TYPE\_50870**: Rebound Shell
        // *   **USER-ENABLE-SWITCH-TYPE\_50873**: WebShell execute command
        // *   **USER-ENABLE-SWITCH-TYPE\_50876**: Against security software
        // *   **USER-ENABLE-SWITCH-TYPE\_50877**: Malicious soft communication
        // *   **USER-ENABLE-SWITCH-TYPE\_50884**: Suspicious worm script behavior
        // *   **USER-ENABLE-SWITCH-TYPE\_50885**: malicious script behavior
        // *   **USER-ENABLE-SWITCH-TYPE\_50983**: obfuscated command
        // *   **USER-ENABLE-SWITCH-TYPE\_51200**: Command line download and run malicious files
        // *   **USER-ENABLE-SWITCH-TYPE\_51201**: ransomware
        // *   **USER-ENABLE-SWITCH-TYPE\_51202**: Suspected Extortion
        // *   **USER-ENABLE-SWITCH-TYPE\_53168**: process debugging
        // *   **USER-ENABLE-SWITCH-TYPE\_53272**: Exploiting Kernel Vulnerabilities to Elevate Privileges
        // *   **USER-ENABLE-SWITCH-TYPE\_54034**: Intranet scan
        // *   **USER-ENABLE-SWITCH-TYPE\_54265**: Hijacking the PAM Module
        // *   **USER-ENABLE-SWITCH-TYPE\_54395**: Unauthorized reading and writing of sensitive files
        // *   **USER-ENABLE-SWITCH-TYPE\_54699**: Hijack dynamic link library
        // *   **USER-ENABLE-SWITCH-TYPE\_54953**: Hashdump Attack
        // *   **USER-ENABLE-SWITCH-TYPE\_57897**: suspected privilege escalation
        // *   **USER-ENABLE-SWITCH-TYPE\_62981**: Bypassing security monitoring
        // *   **USER-ENABLE-SWITCH-TYPE\_64025**: Ingress service execute command \[enhanced mode]
        // *   **USER-ENABLE-SWITCH-TYPE\_39659**: Sensitive Registry Key Protection
        // *   **USER-ENABLE-SWITCH-TYPE\_51225**: Powershell executes high-risk commands
        // *   **USER-ENABLE-SWITCH-TYPE\_51226**: Powershell execute suspicious command
        // *   **USER-ENABLE-SWITCH-TYPE\_51228**: High-risk lateral penetration tools
        // *   **USER-ENABLE-SWITCH-TYPE\_51229**: Browser service execution a high-risk operation
        // *   **USER-ENABLE-SWITCH-TYPE\_51230**: Entrance service execution suspicious operation
        // *   **USER-ENABLE-SWITCH-TYPE\_51232**: System processes execution high-risk operations
        // *   **USER-ENABLE-SWITCH-TYPE\_51233**: Java service execution high-risk operations
        // *   **USER-ENABLE-SWITCH-TYPE\_51234**: Office components execution high-risk operations
        // *   **USER-ENABLE-SWITCH-TYPE\_51235**: Web service performs high-risk operations
        // *   **USER-ENABLE-SWITCH-TYPE\_51236**: Rebound shells
        // *   **USER-ENABLE-SWITCH-TYPE\_52815**: Load high-risk drivers
        // *   **USER-ENABLE-SWITCH-TYPE\_52816**: high-risk account manipulation behavior
        // *   **USER-ENABLE-SWITCH-TYPE\_52818**: Information detection
        // *   **USER-ENABLE-SWITCH-TYPE\_52820**: Create malicious files
        // *   **USER-ENABLE-SWITCH-TYPE\_52821**: Suspicious process startup
        // *   **USER-ENABLE-SWITCH-TYPE\_52823**: Running high-risk ARK tools
        // *   **USER-ENABLE-SWITCH-TYPE\_52825**: Unauthorized execution of high-risk orders
        // *   **USER-ENABLE-SWITCH-TYPE\_52826**: Entrance service execution high-risk operation
        // *   **USER-ENABLE-SWITCH-TYPE\_52827**: Ransomware
        // *   **USER-ENABLE-SWITCH-TYPE\_52828**: Suspected Extortion
        // *   **USER-ENABLE-SWITCH-TYPE\_52829**: delete system backup behavior
        // *   **USER-ENABLE-SWITCH-TYPE\_54168**: LSA security permission service protection
        // *   **USER-ENABLE-SWITCH-TYPE\_54365**: Create service autorun item
        // *   **USER-ENABLE-SWITCH-TYPE\_54366**: Create high-risk autorun item
        // *   **USER-ENABLE-SWITCH-TYPE\_54367**: Create scheduled task autorun item
        // *   **USER-ENABLE-SWITCH-TYPE\_54368**: Create registry autorun item
        // *   **USER-ENABLE-SWITCH-TYPE\_54369**: Create WMI autorun item
        // *   **USER-ENABLE-SWITCH-TYPE\_54373**: Against security software
        // *   **USER-ENABLE-SWITCH-TYPE\_54374**: Intrusion trace cleanup
        // *   **USER-ENABLE-SWITCH-TYPE\_54384**: Hashdump Attack
        // *   **USER-ENABLE-SWITCH-TYPE\_55251**: Database services execution high-risk operations
        // *   **USER-ENABLE-SWITCH-TYPE\_57242**: Malicious command execution
        // *   **USER-ENABLE-SWITCH-TYPE\_57340**: Command line download and run malicious files
        // *   **USER-ENABLE-SWITCH-TYPE\_62357**: Cloud Assistant service information detection
        // *   **USER-ENABLE-SWITCH-TYPE\_63725**: Ingress service implants suspicious script/binary file
        @NameInMap("Type")
        public String type;

        public static DescribeCommonOverallConfigResponseBodyOverallConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonOverallConfigResponseBodyOverallConfig self = new DescribeCommonOverallConfigResponseBodyOverallConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCommonOverallConfigResponseBodyOverallConfig setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeCommonOverallConfigResponseBodyOverallConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
