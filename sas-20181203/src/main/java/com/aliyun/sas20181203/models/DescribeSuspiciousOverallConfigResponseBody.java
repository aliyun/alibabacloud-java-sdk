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
     * 
     * <strong>example:</strong>
     * <p>6673D49C-A9AB-40DD-B4A2-B92306701AE7</p>
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
         * <ul>
         * <li><strong>off</strong>: disabled</li>
         * <li><strong>on</strong>: enabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The type of the feature. Valid values:</p>
         * <ul>
         * <li><strong>auto_breaking</strong>: Anti-Virus</li>
         * <li><strong>ransomware_breaking</strong>: Anti-ransomware (Bait Capture)</li>
         * <li><strong>webshell_cloud_breaking</strong>: Webshell Protection</li>
         * <li><strong>alinet</strong>: Behavior prevention</li>
         * <li><strong>k8s_log_analysis</strong>: K8s Threat Detection</li>
         * <li><strong>alisecguard</strong>: Defense mode for Client Protection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto_breaking</p>
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
