// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspiciousOverallConfigResponseBody extends TeaModel {
    /**
     * <p>The configuration.</p>
     */
    @NameInMap("OverallConfig")
    public DescribeSuspiciousOverallConfigResponseBodyOverallConfig overallConfig;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
        /**
         * <p>The status of the feature. Valid values:</p>
         * <br>
         * <p>*   **off**: disabled</p>
         * <p>*   **on**: enabled</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The type of the feature. Valid values:</p>
         * <br>
         * <p>*   **auto_breaking**: Anti-Virus</p>
         * <p>*   **ransomware_breaking**: Anti-ransomware (Bait Capture)</p>
         * <p>*   **webshell_cloud_breaking**: Webshell Protection</p>
         * <p>*   **alinet**: Behavior prevention</p>
         * <p>*   **k8s_log_analysis**: K8s Threat Detection</p>
         * <p>*   **alisecguard**: Defense mode for Client Protection</p>
         */
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
