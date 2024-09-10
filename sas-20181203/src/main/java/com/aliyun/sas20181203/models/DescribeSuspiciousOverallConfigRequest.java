// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspiciousOverallConfigRequest extends TeaModel {
    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>39.161.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>auto_breaking</p>
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
