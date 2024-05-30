// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOpaStrategyNewShrinkRequest extends TeaModel {
    /**
     * <p>The risks that you want to detect by using the rule.</p>
     */
    @NameInMap("AlarmDetail")
    public String alarmDetailShrink;

    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>> This parameter is deprecated.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The cluster name.</p>
     * <br>
     * <p>> This parameter is deprecated.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The rule description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The image names.</p>
     */
    @NameInMap("ImageName")
    public java.util.List<String> imageName;

    /**
     * <p>The container tags.</p>
     */
    @NameInMap("Label")
    public java.util.List<String> label;

    /**
     * <p>Specifies whether the rule supports malicious Internet images. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("MaliciousImage")
    public Boolean maliciousImage;

    /**
     * <p>The action that is performed when the rule is hit. Valid values:</p>
     * <br>
     * <p>*   **1**: trigger alerts</p>
     * <p>*   **2**: block</p>
     * <p>*   **3**: allow</p>
     */
    @NameInMap("RuleAction")
    public Integer ruleAction;

    /**
     * <p>The application scope of the rule.</p>
     */
    @NameInMap("Scopes")
    public java.util.List<CreateOpaStrategyNewShrinkRequestScopes> scopes;

    /**
     * <p>The rule ID.</p>
     * <br>
     * <p>>  You can call the [ListOpaClusterStrategyNew](https://help.aliyun.com/document_detail/2623574.html) operation to query the rule ID.</p>
     * <br>
     * <p>> This parameter is invalid when you create a rule.</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    /**
     * <p>The rule name.</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    /**
     * <p>The ID of the rule template.</p>
     * <br>
     * <p>>  You can call the [GetOpaStrategyTemplateSummary](https://help.aliyun.com/document_detail/2539952.html) operation to query the ID of the rule template.</p>
     */
    @NameInMap("StrategyTemplateId")
    public Long strategyTemplateId;

    /**
     * <p>Specifies whether the rule supports unscanned images. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("UnScanedImage")
    public Boolean unScanedImage;

    /**
     * <p>The whitelist.</p>
     */
    @NameInMap("WhiteList")
    public java.util.List<String> whiteList;

    public static CreateOpaStrategyNewShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOpaStrategyNewShrinkRequest self = new CreateOpaStrategyNewShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOpaStrategyNewShrinkRequest setAlarmDetailShrink(String alarmDetailShrink) {
        this.alarmDetailShrink = alarmDetailShrink;
        return this;
    }
    public String getAlarmDetailShrink() {
        return this.alarmDetailShrink;
    }

    public CreateOpaStrategyNewShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateOpaStrategyNewShrinkRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateOpaStrategyNewShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOpaStrategyNewShrinkRequest setImageName(java.util.List<String> imageName) {
        this.imageName = imageName;
        return this;
    }
    public java.util.List<String> getImageName() {
        return this.imageName;
    }

    public CreateOpaStrategyNewShrinkRequest setLabel(java.util.List<String> label) {
        this.label = label;
        return this;
    }
    public java.util.List<String> getLabel() {
        return this.label;
    }

    public CreateOpaStrategyNewShrinkRequest setMaliciousImage(Boolean maliciousImage) {
        this.maliciousImage = maliciousImage;
        return this;
    }
    public Boolean getMaliciousImage() {
        return this.maliciousImage;
    }

    public CreateOpaStrategyNewShrinkRequest setRuleAction(Integer ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public Integer getRuleAction() {
        return this.ruleAction;
    }

    public CreateOpaStrategyNewShrinkRequest setScopes(java.util.List<CreateOpaStrategyNewShrinkRequestScopes> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<CreateOpaStrategyNewShrinkRequestScopes> getScopes() {
        return this.scopes;
    }

    public CreateOpaStrategyNewShrinkRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

    public CreateOpaStrategyNewShrinkRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public CreateOpaStrategyNewShrinkRequest setStrategyTemplateId(Long strategyTemplateId) {
        this.strategyTemplateId = strategyTemplateId;
        return this;
    }
    public Long getStrategyTemplateId() {
        return this.strategyTemplateId;
    }

    public CreateOpaStrategyNewShrinkRequest setUnScanedImage(Boolean unScanedImage) {
        this.unScanedImage = unScanedImage;
        return this;
    }
    public Boolean getUnScanedImage() {
        return this.unScanedImage;
    }

    public CreateOpaStrategyNewShrinkRequest setWhiteList(java.util.List<String> whiteList) {
        this.whiteList = whiteList;
        return this;
    }
    public java.util.List<String> getWhiteList() {
        return this.whiteList;
    }

    public static class CreateOpaStrategyNewShrinkRequestScopes extends TeaModel {
        /**
         * <p>The ID of the cluster node to which the rule is applied.</p>
         * <br>
         * <p>> This parameter is not required when you create the instance.</p>
         */
        @NameInMap("AckPolicyInstanceId")
        public String ackPolicyInstanceId;

        /**
         * <p>Specifies whether to include all namespaces. Valid values:</p>
         * <br>
         * <p>*   **1**: includes all namespaces.</p>
         * <p>*   **0**: does not include all namespaces.</p>
         */
        @NameInMap("AllNamespace")
        public Integer allNamespace;

        /**
         * <p>The ID of the cluster that is specified in the rule.</p>
         * <br>
         * <p>>  You can call the [DescribeGroupedContainerInstances](https://help.aliyun.com/document_detail/421736.html) operation to query the cluster ID.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The namespaces.</p>
         * <br>
         * <p>> This parameter is valid only when the AllNamespace parameter is set to 0.</p>
         */
        @NameInMap("NamespaceList")
        public java.util.List<String> namespaceList;

        public static CreateOpaStrategyNewShrinkRequestScopes build(java.util.Map<String, ?> map) throws Exception {
            CreateOpaStrategyNewShrinkRequestScopes self = new CreateOpaStrategyNewShrinkRequestScopes();
            return TeaModel.build(map, self);
        }

        public CreateOpaStrategyNewShrinkRequestScopes setAckPolicyInstanceId(String ackPolicyInstanceId) {
            this.ackPolicyInstanceId = ackPolicyInstanceId;
            return this;
        }
        public String getAckPolicyInstanceId() {
            return this.ackPolicyInstanceId;
        }

        public CreateOpaStrategyNewShrinkRequestScopes setAllNamespace(Integer allNamespace) {
            this.allNamespace = allNamespace;
            return this;
        }
        public Integer getAllNamespace() {
            return this.allNamespace;
        }

        public CreateOpaStrategyNewShrinkRequestScopes setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateOpaStrategyNewShrinkRequestScopes setNamespaceList(java.util.List<String> namespaceList) {
            this.namespaceList = namespaceList;
            return this;
        }
        public java.util.List<String> getNamespaceList() {
            return this.namespaceList;
        }

    }

}
