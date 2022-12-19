// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspiciousOverallConfigRequest extends TeaModel {
    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

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
