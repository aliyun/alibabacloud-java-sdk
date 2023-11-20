// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateOpaStrategyNewRequest extends TeaModel {
    @NameInMap("AlarmDetail")
    public UpdateOpaStrategyNewRequestAlarmDetail alarmDetail;

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
    public java.util.List<UpdateOpaStrategyNewRequestScopes> scopes;

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

    public static UpdateOpaStrategyNewRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOpaStrategyNewRequest self = new UpdateOpaStrategyNewRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOpaStrategyNewRequest setAlarmDetail(UpdateOpaStrategyNewRequestAlarmDetail alarmDetail) {
        this.alarmDetail = alarmDetail;
        return this;
    }
    public UpdateOpaStrategyNewRequestAlarmDetail getAlarmDetail() {
        return this.alarmDetail;
    }

    public UpdateOpaStrategyNewRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateOpaStrategyNewRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UpdateOpaStrategyNewRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateOpaStrategyNewRequest setImageName(java.util.List<String> imageName) {
        this.imageName = imageName;
        return this;
    }
    public java.util.List<String> getImageName() {
        return this.imageName;
    }

    public UpdateOpaStrategyNewRequest setLabel(java.util.List<String> label) {
        this.label = label;
        return this;
    }
    public java.util.List<String> getLabel() {
        return this.label;
    }

    public UpdateOpaStrategyNewRequest setMaliciousImage(Boolean maliciousImage) {
        this.maliciousImage = maliciousImage;
        return this;
    }
    public Boolean getMaliciousImage() {
        return this.maliciousImage;
    }

    public UpdateOpaStrategyNewRequest setRuleAction(Integer ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public Integer getRuleAction() {
        return this.ruleAction;
    }

    public UpdateOpaStrategyNewRequest setScopes(java.util.List<UpdateOpaStrategyNewRequestScopes> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<UpdateOpaStrategyNewRequestScopes> getScopes() {
        return this.scopes;
    }

    public UpdateOpaStrategyNewRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

    public UpdateOpaStrategyNewRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public UpdateOpaStrategyNewRequest setStrategyTemplateId(Long strategyTemplateId) {
        this.strategyTemplateId = strategyTemplateId;
        return this;
    }
    public Long getStrategyTemplateId() {
        return this.strategyTemplateId;
    }

    public UpdateOpaStrategyNewRequest setUnScanedImage(Boolean unScanedImage) {
        this.unScanedImage = unScanedImage;
        return this;
    }
    public Boolean getUnScanedImage() {
        return this.unScanedImage;
    }

    public UpdateOpaStrategyNewRequest setWhiteList(java.util.List<String> whiteList) {
        this.whiteList = whiteList;
        return this;
    }
    public java.util.List<String> getWhiteList() {
        return this.whiteList;
    }

    public static class UpdateOpaStrategyNewRequestAlarmDetailBaselineItem extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static UpdateOpaStrategyNewRequestAlarmDetailBaselineItem build(java.util.Map<String, ?> map) throws Exception {
            UpdateOpaStrategyNewRequestAlarmDetailBaselineItem self = new UpdateOpaStrategyNewRequestAlarmDetailBaselineItem();
            return TeaModel.build(map, self);
        }

        public UpdateOpaStrategyNewRequestAlarmDetailBaselineItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateOpaStrategyNewRequestAlarmDetailBaselineItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateOpaStrategyNewRequestAlarmDetailBaseline extends TeaModel {
        @NameInMap("Item")
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailBaselineItem> item;

        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static UpdateOpaStrategyNewRequestAlarmDetailBaseline build(java.util.Map<String, ?> map) throws Exception {
            UpdateOpaStrategyNewRequestAlarmDetailBaseline self = new UpdateOpaStrategyNewRequestAlarmDetailBaseline();
            return TeaModel.build(map, self);
        }

        public UpdateOpaStrategyNewRequestAlarmDetailBaseline setItem(java.util.List<UpdateOpaStrategyNewRequestAlarmDetailBaselineItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailBaselineItem> getItem() {
            return this.item;
        }

        public UpdateOpaStrategyNewRequestAlarmDetailBaseline setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class UpdateOpaStrategyNewRequestAlarmDetailMaliciousFileItem extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static UpdateOpaStrategyNewRequestAlarmDetailMaliciousFileItem build(java.util.Map<String, ?> map) throws Exception {
            UpdateOpaStrategyNewRequestAlarmDetailMaliciousFileItem self = new UpdateOpaStrategyNewRequestAlarmDetailMaliciousFileItem();
            return TeaModel.build(map, self);
        }

        public UpdateOpaStrategyNewRequestAlarmDetailMaliciousFileItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateOpaStrategyNewRequestAlarmDetailMaliciousFileItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateOpaStrategyNewRequestAlarmDetailMaliciousFile extends TeaModel {
        @NameInMap("Item")
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailMaliciousFileItem> item;

        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static UpdateOpaStrategyNewRequestAlarmDetailMaliciousFile build(java.util.Map<String, ?> map) throws Exception {
            UpdateOpaStrategyNewRequestAlarmDetailMaliciousFile self = new UpdateOpaStrategyNewRequestAlarmDetailMaliciousFile();
            return TeaModel.build(map, self);
        }

        public UpdateOpaStrategyNewRequestAlarmDetailMaliciousFile setItem(java.util.List<UpdateOpaStrategyNewRequestAlarmDetailMaliciousFileItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailMaliciousFileItem> getItem() {
            return this.item;
        }

        public UpdateOpaStrategyNewRequestAlarmDetailMaliciousFile setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class UpdateOpaStrategyNewRequestAlarmDetailVulItem extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static UpdateOpaStrategyNewRequestAlarmDetailVulItem build(java.util.Map<String, ?> map) throws Exception {
            UpdateOpaStrategyNewRequestAlarmDetailVulItem self = new UpdateOpaStrategyNewRequestAlarmDetailVulItem();
            return TeaModel.build(map, self);
        }

        public UpdateOpaStrategyNewRequestAlarmDetailVulItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateOpaStrategyNewRequestAlarmDetailVulItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateOpaStrategyNewRequestAlarmDetailVul extends TeaModel {
        @NameInMap("Item")
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailVulItem> item;

        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static UpdateOpaStrategyNewRequestAlarmDetailVul build(java.util.Map<String, ?> map) throws Exception {
            UpdateOpaStrategyNewRequestAlarmDetailVul self = new UpdateOpaStrategyNewRequestAlarmDetailVul();
            return TeaModel.build(map, self);
        }

        public UpdateOpaStrategyNewRequestAlarmDetailVul setItem(java.util.List<UpdateOpaStrategyNewRequestAlarmDetailVulItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailVulItem> getItem() {
            return this.item;
        }

        public UpdateOpaStrategyNewRequestAlarmDetailVul setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class UpdateOpaStrategyNewRequestAlarmDetail extends TeaModel {
        @NameInMap("Baseline")
        public UpdateOpaStrategyNewRequestAlarmDetailBaseline baseline;

        @NameInMap("MaliciousFile")
        public UpdateOpaStrategyNewRequestAlarmDetailMaliciousFile maliciousFile;

        @NameInMap("Vul")
        public UpdateOpaStrategyNewRequestAlarmDetailVul vul;

        public static UpdateOpaStrategyNewRequestAlarmDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdateOpaStrategyNewRequestAlarmDetail self = new UpdateOpaStrategyNewRequestAlarmDetail();
            return TeaModel.build(map, self);
        }

        public UpdateOpaStrategyNewRequestAlarmDetail setBaseline(UpdateOpaStrategyNewRequestAlarmDetailBaseline baseline) {
            this.baseline = baseline;
            return this;
        }
        public UpdateOpaStrategyNewRequestAlarmDetailBaseline getBaseline() {
            return this.baseline;
        }

        public UpdateOpaStrategyNewRequestAlarmDetail setMaliciousFile(UpdateOpaStrategyNewRequestAlarmDetailMaliciousFile maliciousFile) {
            this.maliciousFile = maliciousFile;
            return this;
        }
        public UpdateOpaStrategyNewRequestAlarmDetailMaliciousFile getMaliciousFile() {
            return this.maliciousFile;
        }

        public UpdateOpaStrategyNewRequestAlarmDetail setVul(UpdateOpaStrategyNewRequestAlarmDetailVul vul) {
            this.vul = vul;
            return this;
        }
        public UpdateOpaStrategyNewRequestAlarmDetailVul getVul() {
            return this.vul;
        }

    }

    public static class UpdateOpaStrategyNewRequestScopes extends TeaModel {
        @NameInMap("AckPolicyInstanceId")
        public String ackPolicyInstanceId;

        @NameInMap("AllNamespace")
        public Integer allNamespace;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("NamespaceList")
        public java.util.List<String> namespaceList;

        public static UpdateOpaStrategyNewRequestScopes build(java.util.Map<String, ?> map) throws Exception {
            UpdateOpaStrategyNewRequestScopes self = new UpdateOpaStrategyNewRequestScopes();
            return TeaModel.build(map, self);
        }

        public UpdateOpaStrategyNewRequestScopes setAckPolicyInstanceId(String ackPolicyInstanceId) {
            this.ackPolicyInstanceId = ackPolicyInstanceId;
            return this;
        }
        public String getAckPolicyInstanceId() {
            return this.ackPolicyInstanceId;
        }

        public UpdateOpaStrategyNewRequestScopes setAllNamespace(Integer allNamespace) {
            this.allNamespace = allNamespace;
            return this;
        }
        public Integer getAllNamespace() {
            return this.allNamespace;
        }

        public UpdateOpaStrategyNewRequestScopes setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public UpdateOpaStrategyNewRequestScopes setNamespaceList(java.util.List<String> namespaceList) {
            this.namespaceList = namespaceList;
            return this;
        }
        public java.util.List<String> getNamespaceList() {
            return this.namespaceList;
        }

    }

}
