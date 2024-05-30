// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateOpaStrategyNewShrinkRequest extends TeaModel {
    /**
     * <p>The risks that you want to detect by using the rule.</p>
     */
    @NameInMap("AlarmDetail")
    public String alarmDetailShrink;

    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>> This parameter is deprecated. You can use the Scopes parameter to specify a scope in which cluster parameters take effect.</p>
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
     * <p>The image tags.</p>
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
     * <p>*   **1**: alert</p>
     * <p>*   **2**: block</p>
     * <p>*   **3**: allow</p>
     */
    @NameInMap("RuleAction")
    public Integer ruleAction;

    /**
     * <p>The application scope.</p>
     */
    @NameInMap("Scopes")
    public java.util.List<UpdateOpaStrategyNewShrinkRequestScopes> scopes;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>>  You can call the [ListOpaClusterStrategyNew](https://help.aliyun.com/document_detail/2623574.html) operation to query the ID.</p>
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
     * <p>The whitelists.</p>
     */
    @NameInMap("WhiteList")
    public java.util.List<String> whiteList;

    public static UpdateOpaStrategyNewShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOpaStrategyNewShrinkRequest self = new UpdateOpaStrategyNewShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOpaStrategyNewShrinkRequest setAlarmDetailShrink(String alarmDetailShrink) {
        this.alarmDetailShrink = alarmDetailShrink;
        return this;
    }
    public String getAlarmDetailShrink() {
        return this.alarmDetailShrink;
    }

    public UpdateOpaStrategyNewShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateOpaStrategyNewShrinkRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UpdateOpaStrategyNewShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateOpaStrategyNewShrinkRequest setImageName(java.util.List<String> imageName) {
        this.imageName = imageName;
        return this;
    }
    public java.util.List<String> getImageName() {
        return this.imageName;
    }

    public UpdateOpaStrategyNewShrinkRequest setLabel(java.util.List<String> label) {
        this.label = label;
        return this;
    }
    public java.util.List<String> getLabel() {
        return this.label;
    }

    public UpdateOpaStrategyNewShrinkRequest setMaliciousImage(Boolean maliciousImage) {
        this.maliciousImage = maliciousImage;
        return this;
    }
    public Boolean getMaliciousImage() {
        return this.maliciousImage;
    }

    public UpdateOpaStrategyNewShrinkRequest setRuleAction(Integer ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public Integer getRuleAction() {
        return this.ruleAction;
    }

    public UpdateOpaStrategyNewShrinkRequest setScopes(java.util.List<UpdateOpaStrategyNewShrinkRequestScopes> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<UpdateOpaStrategyNewShrinkRequestScopes> getScopes() {
        return this.scopes;
    }

    public UpdateOpaStrategyNewShrinkRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

    public UpdateOpaStrategyNewShrinkRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public UpdateOpaStrategyNewShrinkRequest setStrategyTemplateId(Long strategyTemplateId) {
        this.strategyTemplateId = strategyTemplateId;
        return this;
    }
    public Long getStrategyTemplateId() {
        return this.strategyTemplateId;
    }

    public UpdateOpaStrategyNewShrinkRequest setUnScanedImage(Boolean unScanedImage) {
        this.unScanedImage = unScanedImage;
        return this;
    }
    public Boolean getUnScanedImage() {
        return this.unScanedImage;
    }

    public UpdateOpaStrategyNewShrinkRequest setWhiteList(java.util.List<String> whiteList) {
        this.whiteList = whiteList;
        return this;
    }
    public java.util.List<String> getWhiteList() {
        return this.whiteList;
    }

    public static class UpdateOpaStrategyNewShrinkRequestScopes extends TeaModel {
        /**
         * <p>The ID of the cluster node to which the rule is applied.</p>
         * <br>
         * <p>>  You can call the [GetOpaStrategyDetailNew](~~GetOpaStrategyDetailNew~~) operation to query the ID of the cluster node to which the rule is applied.</p>
         */
        @NameInMap("AckPolicyInstanceId")
        public String ackPolicyInstanceId;

        /**
         * <p>Specifies whether all namespaces are included. Valid values:</p>
         * <br>
         * <p>*   **0**: Not all namespaces are included.</p>
         * <p>*   **1**: All namespaces are included.</p>
         */
        @NameInMap("AllNamespace")
        public Integer allNamespace;

        /**
         * <p>The cluster ID.</p>
         * <br>
         * <p>>  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the cluster ID.</p>
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

        public static UpdateOpaStrategyNewShrinkRequestScopes build(java.util.Map<String, ?> map) throws Exception {
            UpdateOpaStrategyNewShrinkRequestScopes self = new UpdateOpaStrategyNewShrinkRequestScopes();
            return TeaModel.build(map, self);
        }

        public UpdateOpaStrategyNewShrinkRequestScopes setAckPolicyInstanceId(String ackPolicyInstanceId) {
            this.ackPolicyInstanceId = ackPolicyInstanceId;
            return this;
        }
        public String getAckPolicyInstanceId() {
            return this.ackPolicyInstanceId;
        }

        public UpdateOpaStrategyNewShrinkRequestScopes setAllNamespace(Integer allNamespace) {
            this.allNamespace = allNamespace;
            return this;
        }
        public Integer getAllNamespace() {
            return this.allNamespace;
        }

        public UpdateOpaStrategyNewShrinkRequestScopes setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public UpdateOpaStrategyNewShrinkRequestScopes setNamespaceList(java.util.List<String> namespaceList) {
            this.namespaceList = namespaceList;
            return this;
        }
        public java.util.List<String> getNamespaceList() {
            return this.namespaceList;
        }

    }

}
