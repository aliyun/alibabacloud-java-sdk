// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateInterceptionRuleShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <br>
     * <p>> You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the cluster.</p>
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
    public String dstTargetListShrink;

    /**
     * <p>The action on traffic. Valid values:</p>
     * <br>
     * <p>*   **1**: blocks traffic.</p>
     * <p>*   **2**: allows traffic and generates alerts.</p>
     * <p>*   **3**: allows traffic and does not generate alerts.</p>
     */
    @NameInMap("InterceptType")
    public Long interceptType;

    /**
     * <p>The priority of the defense rule. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
     */
    @NameInMap("OrderIndex")
    public Long orderIndex;

    /**
     * <p>The name of the defense rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Specifies the status of the defense rule. Valid values:</p>
     * <br>
     * <p>*   **0**: disables the rule.</p>
     * <p>*   **1**: enables the rule.</p>
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
    public String srcTargetShrink;

    public static CreateInterceptionRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInterceptionRuleShrinkRequest self = new CreateInterceptionRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateInterceptionRuleShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateInterceptionRuleShrinkRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateInterceptionRuleShrinkRequest setDstTargetListShrink(String dstTargetListShrink) {
        this.dstTargetListShrink = dstTargetListShrink;
        return this;
    }
    public String getDstTargetListShrink() {
        return this.dstTargetListShrink;
    }

    public CreateInterceptionRuleShrinkRequest setInterceptType(Long interceptType) {
        this.interceptType = interceptType;
        return this;
    }
    public Long getInterceptType() {
        return this.interceptType;
    }

    public CreateInterceptionRuleShrinkRequest setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
        return this;
    }
    public Long getOrderIndex() {
        return this.orderIndex;
    }

    public CreateInterceptionRuleShrinkRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateInterceptionRuleShrinkRequest setRuleSwitch(Integer ruleSwitch) {
        this.ruleSwitch = ruleSwitch;
        return this;
    }
    public Integer getRuleSwitch() {
        return this.ruleSwitch;
    }

    public CreateInterceptionRuleShrinkRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public CreateInterceptionRuleShrinkRequest setSrcTargetShrink(String srcTargetShrink) {
        this.srcTargetShrink = srcTargetShrink;
        return this;
    }
    public String getSrcTargetShrink() {
        return this.srcTargetShrink;
    }

}
