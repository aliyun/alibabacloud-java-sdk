// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonOverallConfigResponseBody extends TeaModel {
    /**
     * <p>The information about the feature.</p>
     */
    @NameInMap("OverallConfig")
    public DescribeCommonOverallConfigResponseBodyOverallConfig overallConfig;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The status of the feature. Valid values:</p>
         * <br>
         * <p>*   **on**: enabled</p>
         * <p>*   **off**: disabled</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The type of the feature. Valid values:</p>
         * <br>
         * <p>*   **kdump_switch**: Active defense experience optimization</p>
         * <p>*   **threat_detect**: Dynamic adaptive threat detection capability</p>
         * <p>*   **suspicious_aggregation**: Alert Association</p>
         * <p>*   **alidetect**: File Test</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_3277**: Suspicious process startup</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_5507**: malicious drivers</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_38857**: Entrance service execution high-risk operation</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_50858**: Web service performs high-risk operations</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_50859**: Entrance service execution suspicious operation</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_50861**: Information detection</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_50862**: Cloud Assistant Advanced Protection</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_50867**: Create malicious files</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_50868**: Create suspicious files</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_50869**: Unauthorized execution of high-risk orders</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_50870**: Rebound Shell</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_50873**: WebShell execute command</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_50876**: Against security software</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_50877**: Malicious soft communication</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_50884**: Suspicious worm script behavior</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_50885**: malicious script behavior</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_50983**: obfuscated command</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_51200**: Command line download and run malicious files</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_51201**: ransomware</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_51202**: Suspected Extortion</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_53168**: process debugging</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_53272**: Exploiting Kernel Vulnerabilities to Elevate Privileges</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_54034**: Intranet scan</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_54265**: Hijacking the PAM Module</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_54395**: Unauthorized reading and writing of sensitive files</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_54699**: Hijack dynamic link library</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_54953**: Hashdump Attack</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_57897**: suspected privilege escalation</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_62981**: Bypassing security monitoring</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_64025**: Ingress service execute command \[enhanced mode]</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_39659**: Sensitive Registry Key Protection</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_51225**: Powershell executes high-risk commands</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_51226**: Powershell execute suspicious command</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_51228**: High-risk lateral penetration tools</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_51229**: Browser service execution a high-risk operation</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_51230**: Entrance service execution suspicious operation</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_51232**: System processes execution high-risk operations</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_51233**: Java service execution high-risk operations</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_51234**: Office components execution high-risk operations</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_51235**: Web service performs high-risk operations</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_51236**: Rebound shells</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_52815**: Load high-risk drivers</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_52816**: high-risk account manipulation behavior</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_52818**: Information detection</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_52820**: Create malicious files</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_52821**: Suspicious process startup</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_52823**: Running high-risk ARK tools</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_52825**: Unauthorized execution of high-risk orders</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_52826**: Entrance service execution high-risk operation</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_52827**: Ransomware</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_52828**: Suspected Extortion</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_52829**: delete system backup behavior</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_54168**: LSA security permission service protection</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_54365**: Create service autorun item</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_54366**: Create high-risk autorun item</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_54367**: Create scheduled task autorun item</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_54368**: Create registry autorun item</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_54369**: Create WMI autorun item</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_54373**: Against security software</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_54374**: Intrusion trace cleanup</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_54384**: Hashdump Attack</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_55251**: Database services execution high-risk operations</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_57242**: Malicious command execution</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_57340**: Command line download and run malicious files</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_62357**: Cloud Assistant service information detection</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE\_63725**: Ingress service implants suspicious script/binary file</p>
         */
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
