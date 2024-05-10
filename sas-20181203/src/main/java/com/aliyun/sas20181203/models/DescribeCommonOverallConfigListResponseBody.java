// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCommonOverallConfigListResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the configurations of features.</p>
     */
    @NameInMap("OverallList")
    public java.util.List<DescribeCommonOverallConfigListResponseBodyOverallList> overallList;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCommonOverallConfigListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonOverallConfigListResponseBody self = new DescribeCommonOverallConfigListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommonOverallConfigListResponseBody setOverallList(java.util.List<DescribeCommonOverallConfigListResponseBodyOverallList> overallList) {
        this.overallList = overallList;
        return this;
    }
    public java.util.List<DescribeCommonOverallConfigListResponseBodyOverallList> getOverallList() {
        return this.overallList;
    }

    public DescribeCommonOverallConfigListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCommonOverallConfigListResponseBodyOverallList extends TeaModel {
        /**
         * <p>Indicates the status of the switch. Valid values:</p>
         * <br>
         * <p>*   **off**</p>
         * <p>*   **on**</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The total number of entries that are returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The type of the configuration. Valid values:</p>
         * <br>
         * <p>*   **kdump_switch**: Active defense experience optimization.</p>
         * <p>*   **threat_detect**: Adaptive threat detection.</p>
         * <p>*   **suspicious_aggregation**: Alert association.</p>
         * <p>*   **alidetect**: File detection.</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_38857**: Entrance service performs high-risk operations (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_50858**: Web service performs high-risk operations (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_50859**: Entrance service performs suspicious operations (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_50862**: Cloud Assistant advanced protection (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_50867**: Injects malicious files (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_50868**: Injects suspicious files (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_64025**: Entrance service executes commands in an enhanced mode (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_51229**: Browser service performs high-risk operations (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_51230**: Entrance service performs suspicious operations (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_51232**: System processes perform high-risk operations (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_51233**: Java service performs high-risk operations (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_51234**: Office components perform high-risk operations (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_51235**: Web service performs high-risk operations (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_52820**: Injects malicious files (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_52826**: Entrance service performs high-risk operations (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_55251**: Database services perform high-risk operations (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_63725**: Entrance service injects suspicious scripts or binary files (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_3277**: Suspicious process startup (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_50983**: Obfuscated commands (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_51200**: Uses command line to download and run malicious files (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_71131**: Entrance service executes sequence of suspicious behavior (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_51225**: Powershell executes high-risk commands (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_51226**: Powershell executes suspicious commands (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_52821**: Suspicious process startup (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_57242**: Malicious command execution (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_57340**: Uses command line to download and run malicious files (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_39659**: Sensitive registry key protection (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_52816**: High-risk account manipulation behavior (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_54365**: Creates service auto-startup items (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_54366**: Creates high-risk auto-startup items (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_54367**: Creates scheduled task auto-startup items (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_54368**: Creates registry auto-startup items (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_54369**: Creates WMI auto-startup items (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_50869**: Unauthorized execution of high-risk commands (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_53272**: Exploits kernel vulnerabilities to elevate privileges (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_54395**: Unauthorized reading and writing of sensitive files (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_57897**: Suspected privilege escalation (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_52825**: Unauthorized execution of high-risk commands (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_5507**: Malicious drivers (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_50876**: Uninstalls security software (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_53168**: Process debugging (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_54699**: Hijacks dynamic link library (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_62981**: Bypasses security monitoring (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_52815**: Loads high-risk drivers (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_52823**: Runs high-risk anti-rootkit (ARK) tools (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_54373**: Uninstalls security software (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_54374**: Intrusion trace cleanup (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_54265**: Hijacks the pluggable authentication module (PAM) (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_54953**: Hashdump attack (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_54383**: MimiKatz credential stealing (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_54384**: Hashdump attack (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_50861**: Information detection (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_52818**: Information detection (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_54034**: Intranet scan (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_51228**: High-risk lateral penetration tools (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_50870**: Rebound shell (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_50873**: WebShell executes commands.</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_51236**: Rebound shell (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_50877**: Malicious program communication (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_50884**: Suspicious worm script behavior (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_50885**: Malicious script behavior (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_51201**: Ransomware (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_51202**: Suspected extortion (Linux).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_52827**: Ransomware (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_52828**: Suspected extortion (Windows).</p>
         * <p>*   **USER-ENABLE-SWITCH-TYPE_52829**: Deletes system backup behavior (Windows).</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeCommonOverallConfigListResponseBodyOverallList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonOverallConfigListResponseBodyOverallList self = new DescribeCommonOverallConfigListResponseBodyOverallList();
            return TeaModel.build(map, self);
        }

        public DescribeCommonOverallConfigListResponseBodyOverallList setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeCommonOverallConfigListResponseBodyOverallList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeCommonOverallConfigListResponseBodyOverallList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
