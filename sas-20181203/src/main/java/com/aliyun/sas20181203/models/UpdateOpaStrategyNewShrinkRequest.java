// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateOpaStrategyNewShrinkRequest extends TeaModel {
    /**
     * <p>The alert content details included in the policy.</p>
     */
    @NameInMap("AlarmDetail")
    public String alarmDetailShrink;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>Notice: This parameter is deprecated. Use the Scopes parameter to specify the scope of clusters to which the policy applies..</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c870ec78ecbcb41d2a35c679823ef****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The cluster name.</p>
     * <blockquote>
     * <p>Notice: This parameter is deprecated..</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>docker-law</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The policy description.</p>
     * 
     * <strong>example:</strong>
     * <p>4566</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list of image names included in the policy.</p>
     */
    @NameInMap("ImageName")
    public java.util.List<String> imageName;

    /**
     * <p>The list of image tags included in the policy.</p>
     */
    @NameInMap("Label")
    public java.util.List<String> label;

    /**
     * <p>Specifies whether the policy supports Internet malicious images. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Supported.</li>
     * <li><strong>false</strong>: Not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MaliciousImage")
    public Boolean maliciousImage;

    /**
     * <p>The action to take when the policy is hit. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Alert.</li>
     * <li><strong>2</strong>: Block.</li>
     * <li><strong>3</strong>: Allow.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleAction")
    public Integer ruleAction;

    /**
     * <p>The scope of the policy.</p>
     */
    @NameInMap("Scopes")
    public java.util.List<UpdateOpaStrategyNewShrinkRequestScopes> scopes;

    /**
     * <p>The policy ID.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2623574.html">ListOpaClusterStrategyNew</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1003</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    /**
     * <p>The policy template ID.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/2539952.html">GetOpaStrategyTemplateSummary</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>109</p>
     */
    @NameInMap("StrategyTemplateId")
    public Long strategyTemplateId;

    /**
     * <p>Specifies whether the policy supports unscanned images. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Supported.</li>
     * <li><strong>false</strong>: Not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UnScanedImage")
    public Boolean unScanedImage;

    /**
     * <p>The whitelist.</p>
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
         * <p>The policy instance ID in the cluster.</p>
         * <blockquote>
         * <p>Call the <a href="~~GetOpaStrategyDetailNew~~">GetOpaStrategyDetailNew</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ack-1</p>
         */
        @NameInMap("AckPolicyInstanceId")
        public String ackPolicyInstanceId;

        /**
         * <p>Specifies whether all namespaces are included. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: No.</li>
         * <li><strong>1</strong>: Yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllNamespace")
        public Integer allNamespace;

        /**
         * <p>The ID of the container cluster.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cdcb56a931c**</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The list of namespaces.</p>
         * <blockquote>
         * <p>Notice: This parameter takes effect only when AllNamespace is set to 0..</p>
         * </blockquote>
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
