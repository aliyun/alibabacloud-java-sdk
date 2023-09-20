// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyHybridCloudClusterBypassStatusRequest extends TeaModel {
    /**
     * <p>The ID of the hybrid cloud cluster.</p>
     */
    @NameInMap("ClusterResourceId")
    public String clusterResourceId;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>**You can call the **DescribeInstanceInfo[ operation to obtain the ID of the WAF instance.](~~140857~~)</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The status of manual bypass. Valid values:</p>
     * <br>
     * <p>*   **on**: enabled.</p>
     * <p>*   **off**: disabled. This is the default value.</p>
     */
    @NameInMap("RuleStatus")
    public String ruleStatus;

    public static ModifyHybridCloudClusterBypassStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHybridCloudClusterBypassStatusRequest self = new ModifyHybridCloudClusterBypassStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHybridCloudClusterBypassStatusRequest setClusterResourceId(String clusterResourceId) {
        this.clusterResourceId = clusterResourceId;
        return this;
    }
    public String getClusterResourceId() {
        return this.clusterResourceId;
    }

    public ModifyHybridCloudClusterBypassStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHybridCloudClusterBypassStatusRequest setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public String getRuleStatus() {
        return this.ruleStatus;
    }

}
