// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspiciousOverallConfigRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the feature. Valid values:</p>
     * <br>
     * <p>*   **auto_breaking**: Anti-Virus</p>
     * <p>*   **ransomware_breaking**: Anti-ransomware (Bait Capture)</p>
     * <p>*   **webshell_cloud_breaking**: Webshell Protection</p>
     * <p>*   **alinet**: Behavior prevention</p>
     * <p>*   **k8s_log_analysis**: K8s Threat Detection</p>
     * <p>*   **alisecguard**: Defense mode for Client Protection</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeSuspiciousOverallConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspiciousOverallConfigRequest self = new DescribeSuspiciousOverallConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspiciousOverallConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSuspiciousOverallConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
