// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateInterceptionRuleRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster to query.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter must be from an ACK cluster. You can call the DescribeClustersV1 operation of Container Service for Kubernetes (ACK) to query existing clusters, or call the CreateCluster operation to create a cluster, and then call the DescribeGroupedContainerInstances operation of Security Center to obtain the ID of a managed cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c35xxxa416</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sas-test-cnnf</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The list of destination objects. The metric descriptions are as follows:</p>
     * <ul>
     * <li>targetId: The ID of the destination object. You can invoke the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to obtain this parameter.</li>
     * <li>ports: The list of destination port ranges.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;targetId&quot;: 600036,
     *             &quot;ports&quot;: [
     *                   &quot;1/65535&quot;
     *             ]
     *       }
     * ]</p>
     */
    @NameInMap("DstTargetList")
    public java.util.Map<String, ?> dstTargetList;

    /**
     * <p>The interception mode. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Block Mode.</li>
     * <li><strong>2</strong>: Alert mode.</li>
     * <li><strong>3</strong>: Allow mode.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InterceptType")
    public Long interceptType;

    /**
     * <p>The priority of the rule. Valid values: 1 to 1000. A smaller value indicates a higher priority.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrderIndex")
    public Long orderIndex;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-rule-1</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>Specifies whether to enable the rule. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disabled.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RuleSwitch")
    public Integer ruleSwitch;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <ul>
     * <li>customize: user-defined rule</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>customize</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The source object. The metric description is as follows:</p>
     * <ul>
     * <li>targetId: The ID of the source object. You can invoke the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to obtain this parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;targetId&quot;:301940}</p>
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
