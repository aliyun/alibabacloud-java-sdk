// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateOpaStrategyNewShrinkRequest extends TeaModel {
    @NameInMap("AlarmDetail")
    public String alarmDetailShrink;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("Description")
    public String description;

    @NameInMap("ImageName")
    public java.util.List<String> imageName;

    @NameInMap("Label")
    public java.util.List<String> label;

    @NameInMap("MaliciousImage")
    public Boolean maliciousImage;

    @NameInMap("RuleAction")
    public Integer ruleAction;

    @NameInMap("Scopes")
    public java.util.List<UpdateOpaStrategyNewShrinkRequestScopes> scopes;

    @NameInMap("StrategyId")
    public Long strategyId;

    @NameInMap("StrategyName")
    public String strategyName;

    @NameInMap("StrategyTemplateId")
    public Long strategyTemplateId;

    @NameInMap("UnScanedImage")
    public Boolean unScanedImage;

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
        @NameInMap("AckPolicyInstanceId")
        public String ackPolicyInstanceId;

        @NameInMap("AllNamespace")
        public Integer allNamespace;

        @NameInMap("ClusterId")
        public String clusterId;

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
