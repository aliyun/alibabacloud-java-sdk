// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspiciousOverallConfigResponseBody extends TeaModel {
    // The configuration.
    @NameInMap("OverallConfig")
    public DescribeSuspiciousOverallConfigResponseBodyOverallConfig overallConfig;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSuspiciousOverallConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspiciousOverallConfigResponseBody self = new DescribeSuspiciousOverallConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspiciousOverallConfigResponseBody setOverallConfig(DescribeSuspiciousOverallConfigResponseBodyOverallConfig overallConfig) {
        this.overallConfig = overallConfig;
        return this;
    }
    public DescribeSuspiciousOverallConfigResponseBodyOverallConfig getOverallConfig() {
        return this.overallConfig;
    }

    public DescribeSuspiciousOverallConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSuspiciousOverallConfigResponseBodyOverallConfig extends TeaModel {
        // The status of the feature. Valid values:
        // 
        // *   **off**: disabled
        // *   **on**: enabled
        @NameInMap("Config")
        public String config;

        // The type of the feature. Valid values:
        // 
        // *   **auto_breaking**: Anti-Virus
        // *   **ransomware_breaking**: Anti-ransomware (Bait Capture)
        // *   **webshell\_cloud_breaking**: Webshell Protection
        // *   **alinet**: Behavior prevention
        // *   **k8s\_log_analysis**: K8s Threat Detection
        // *   **alisecguard**: Defense mode for Client Protection
        @NameInMap("Type")
        public String type;

        public static DescribeSuspiciousOverallConfigResponseBodyOverallConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspiciousOverallConfigResponseBodyOverallConfig self = new DescribeSuspiciousOverallConfigResponseBodyOverallConfig();
            return TeaModel.build(map, self);
        }

        public DescribeSuspiciousOverallConfigResponseBodyOverallConfig setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribeSuspiciousOverallConfigResponseBodyOverallConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
