// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOpaStrategyNewShrinkRequest extends TeaModel {
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
    public java.util.List<CreateOpaStrategyNewShrinkRequestScopes> scopes;

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
        @NameInMap("AckPolicyInstanceId")
        public String ackPolicyInstanceId;

        @NameInMap("AllNamespace")
        public Integer allNamespace;

        @NameInMap("ClusterId")
        public String clusterId;

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
