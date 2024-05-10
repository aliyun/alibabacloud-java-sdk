// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateInterceptionRuleRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <br>
     * <p>> You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The information about the destination network object. The value of this parameter contains the following fields:</p>
     * <br>
     * <p>*   targetId: the ID of the destination network object. You can call the [ListInterceptionTargetPage](~~ListInterceptionTargetPage~~) operation to query the ID.</p>
     * <p>*   ports: the destination port ranges.</p>
     */
    @NameInMap("DstTargetList")
    public java.util.Map<String, ?> dstTargetList;

    /**
     * <p>The action on traffic. Valid values:</p>
     * <br>
     * <p>*   **1**: blocks traffic.</p>
     * <p>*   **2**: allows traffic and generates alerts.</p>
     * <p>*   **3**: allows traffic and does not generate alerts.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InterceptType")
    public Long interceptType;

    /**
     * <p>The priority of the defense rule. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderIndex")
    public Long orderIndex;

    /**
     * <p>The name of the defense rule.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Specifies the status of the defense rule. Valid values:</p>
     * <br>
     * <p>*   **0**: disables the rule.</p>
     * <p>*   **1**: enables the rule.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleSwitch")
    public Integer ruleSwitch;

    /**
     * <p>The type of the defense rule. Valid values:</p>
     * <br>
     * <p>*   customize: custom rule</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The source network object. The value of this parameter contains the following field:</p>
     * <br>
     * <p>*   targetId: the ID of the source network object. You can call the [ListInterceptionTargetPage](~~ListInterceptionTargetPage~~) operation to query the ID.</p>
     */
    @NameInMap("SrcTarget")
    public java.util.Map<String, ?> srcTarget;

    public static CreateInterceptionRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInterceptionRuleRequest self = new CreateInterceptionRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateInterceptionRuleRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateInterceptionRuleRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateInterceptionRuleRequest setDstTargetList(java.util.Map<String, ?> dstTargetList) {
        this.dstTargetList = dstTargetList;
        return this;
    }
    public java.util.Map<String, ?> getDstTargetList() {
        return this.dstTargetList;
    }

    public CreateInterceptionRuleRequest setInterceptType(Long interceptType) {
        this.interceptType = interceptType;
        return this;
    }
    public Long getInterceptType() {
        return this.interceptType;
    }

    public CreateInterceptionRuleRequest setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        return this;
    }
    public Long getOrderIndex() {
        return this.orderIndex;
    }

    public CreateInterceptionRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateInterceptionRuleRequest setRuleSwitch(Integer ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    public CreateInterceptionRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public CreateInterceptionRuleRequest setSrcTarget(java.util.Map<String, ?> srcTarget) {
        this.srcTarget = srcTarget;
        return this;
    }
    public java.util.Map<String, ?> getSrcTarget() {
        return this.srcTarget;
    }

}
