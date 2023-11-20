// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOpaStrategyNewRequest extends TeaModel {
    @NameInMap("AlarmDetail")
    public CreateOpaStrategyNewRequestAlarmDetail alarmDetail;

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
    public java.util.List<CreateOpaStrategyNewRequestScopes> scopes;

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

    public static CreateOpaStrategyNewRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOpaStrategyNewRequest self = new CreateOpaStrategyNewRequest();
        return TeaModel.build(map, self);
    }

    public CreateOpaStrategyNewRequest setAlarmDetail(CreateOpaStrategyNewRequestAlarmDetail alarmDetail) {
        this.alarmDetail = alarmDetail;
        return this;
    }
    public CreateOpaStrategyNewRequestAlarmDetail getAlarmDetail() {
        return this.alarmDetail;
    }

    public CreateOpaStrategyNewRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateOpaStrategyNewRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateOpaStrategyNewRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOpaStrategyNewRequest setImageName(java.util.List<String> imageName) {
        this.imageName = imageName;
        return this;
    }
    public java.util.List<String> getImageName() {
        return this.imageName;
    }

    public CreateOpaStrategyNewRequest setLabel(java.util.List<String> label) {
        this.label = label;
        return this;
    }
    public java.util.List<String> getLabel() {
        return this.label;
    }

    public CreateOpaStrategyNewRequest setMaliciousImage(Boolean maliciousImage) {
        this.maliciousImage = maliciousImage;
        return this;
    }
    public Boolean getMaliciousImage() {
        return this.maliciousImage;
    }

    public CreateOpaStrategyNewRequest setRuleAction(Integer ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public Integer getRuleAction() {
        return this.ruleAction;
    }

    public CreateOpaStrategyNewRequest setScopes(java.util.List<CreateOpaStrategyNewRequestScopes> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<CreateOpaStrategyNewRequestScopes> getScopes() {
        return this.scopes;
    }

    public CreateOpaStrategyNewRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

    public CreateOpaStrategyNewRequest setStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }
    public String getStrategyName() {
        return this.strategyName;
    }

    public CreateOpaStrategyNewRequest setStrategyTemplateId(Long strategyTemplateId) {
        this.strategyTemplateId = strategyTemplateId;
        return this;
    }
    public Long getStrategyTemplateId() {
        return this.strategyTemplateId;
    }

    public CreateOpaStrategyNewRequest setUnScanedImage(Boolean unScanedImage) {
        this.unScanedImage = unScanedImage;
        return this;
    }
    public Boolean getUnScanedImage() {
        return this.unScanedImage;
    }

    public CreateOpaStrategyNewRequest setWhiteList(java.util.List<String> whiteList) {
        this.whiteList = whiteList;
        return this;
    }
    public java.util.List<String> getWhiteList() {
        return this.whiteList;
    }

    public static class CreateOpaStrategyNewRequestAlarmDetailBaselineItem extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static CreateOpaStrategyNewRequestAlarmDetailBaselineItem build(java.util.Map<String, ?> map) throws Exception {
            CreateOpaStrategyNewRequestAlarmDetailBaselineItem self = new CreateOpaStrategyNewRequestAlarmDetailBaselineItem();
            return TeaModel.build(map, self);
        }

        public CreateOpaStrategyNewRequestAlarmDetailBaselineItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateOpaStrategyNewRequestAlarmDetailBaselineItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateOpaStrategyNewRequestAlarmDetailBaseline extends TeaModel {
        @NameInMap("Item")
        public java.util.List<CreateOpaStrategyNewRequestAlarmDetailBaselineItem> item;

        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static CreateOpaStrategyNewRequestAlarmDetailBaseline build(java.util.Map<String, ?> map) throws Exception {
            CreateOpaStrategyNewRequestAlarmDetailBaseline self = new CreateOpaStrategyNewRequestAlarmDetailBaseline();
            return TeaModel.build(map, self);
        }

        public CreateOpaStrategyNewRequestAlarmDetailBaseline setItem(java.util.List<CreateOpaStrategyNewRequestAlarmDetailBaselineItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<CreateOpaStrategyNewRequestAlarmDetailBaselineItem> getItem() {
            return this.item;
        }

        public CreateOpaStrategyNewRequestAlarmDetailBaseline setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class CreateOpaStrategyNewRequestAlarmDetailMaliciousFileItem extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static CreateOpaStrategyNewRequestAlarmDetailMaliciousFileItem build(java.util.Map<String, ?> map) throws Exception {
            CreateOpaStrategyNewRequestAlarmDetailMaliciousFileItem self = new CreateOpaStrategyNewRequestAlarmDetailMaliciousFileItem();
            return TeaModel.build(map, self);
        }

        public CreateOpaStrategyNewRequestAlarmDetailMaliciousFileItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateOpaStrategyNewRequestAlarmDetailMaliciousFileItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateOpaStrategyNewRequestAlarmDetailMaliciousFile extends TeaModel {
        @NameInMap("Item")
        public java.util.List<CreateOpaStrategyNewRequestAlarmDetailMaliciousFileItem> item;

        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static CreateOpaStrategyNewRequestAlarmDetailMaliciousFile build(java.util.Map<String, ?> map) throws Exception {
            CreateOpaStrategyNewRequestAlarmDetailMaliciousFile self = new CreateOpaStrategyNewRequestAlarmDetailMaliciousFile();
            return TeaModel.build(map, self);
        }

        public CreateOpaStrategyNewRequestAlarmDetailMaliciousFile setItem(java.util.List<CreateOpaStrategyNewRequestAlarmDetailMaliciousFileItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<CreateOpaStrategyNewRequestAlarmDetailMaliciousFileItem> getItem() {
            return this.item;
        }

        public CreateOpaStrategyNewRequestAlarmDetailMaliciousFile setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class CreateOpaStrategyNewRequestAlarmDetailVulItem extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static CreateOpaStrategyNewRequestAlarmDetailVulItem build(java.util.Map<String, ?> map) throws Exception {
            CreateOpaStrategyNewRequestAlarmDetailVulItem self = new CreateOpaStrategyNewRequestAlarmDetailVulItem();
            return TeaModel.build(map, self);
        }

        public CreateOpaStrategyNewRequestAlarmDetailVulItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateOpaStrategyNewRequestAlarmDetailVulItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateOpaStrategyNewRequestAlarmDetailVul extends TeaModel {
        @NameInMap("Item")
        public java.util.List<CreateOpaStrategyNewRequestAlarmDetailVulItem> item;

        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static CreateOpaStrategyNewRequestAlarmDetailVul build(java.util.Map<String, ?> map) throws Exception {
            CreateOpaStrategyNewRequestAlarmDetailVul self = new CreateOpaStrategyNewRequestAlarmDetailVul();
            return TeaModel.build(map, self);
        }

        public CreateOpaStrategyNewRequestAlarmDetailVul setItem(java.util.List<CreateOpaStrategyNewRequestAlarmDetailVulItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<CreateOpaStrategyNewRequestAlarmDetailVulItem> getItem() {
            return this.item;
        }

        public CreateOpaStrategyNewRequestAlarmDetailVul setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class CreateOpaStrategyNewRequestAlarmDetail extends TeaModel {
        @NameInMap("Baseline")
        public CreateOpaStrategyNewRequestAlarmDetailBaseline baseline;

        @NameInMap("MaliciousFile")
        public CreateOpaStrategyNewRequestAlarmDetailMaliciousFile maliciousFile;

        @NameInMap("Vul")
        public CreateOpaStrategyNewRequestAlarmDetailVul vul;

        public static CreateOpaStrategyNewRequestAlarmDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateOpaStrategyNewRequestAlarmDetail self = new CreateOpaStrategyNewRequestAlarmDetail();
            return TeaModel.build(map, self);
        }

        public CreateOpaStrategyNewRequestAlarmDetail setBaseline(CreateOpaStrategyNewRequestAlarmDetailBaseline baseline) {
            this.baseline = baseline;
            return this;
        }
        public CreateOpaStrategyNewRequestAlarmDetailBaseline getBaseline() {
            return this.baseline;
        }

        public CreateOpaStrategyNewRequestAlarmDetail setMaliciousFile(CreateOpaStrategyNewRequestAlarmDetailMaliciousFile maliciousFile) {
            this.maliciousFile = maliciousFile;
            return this;
        }
        public CreateOpaStrategyNewRequestAlarmDetailMaliciousFile getMaliciousFile() {
            return this.maliciousFile;
        }

        public CreateOpaStrategyNewRequestAlarmDetail setVul(CreateOpaStrategyNewRequestAlarmDetailVul vul) {
            this.vul = vul;
            return this;
        }
        public CreateOpaStrategyNewRequestAlarmDetailVul getVul() {
            return this.vul;
        }

    }

    public static class CreateOpaStrategyNewRequestScopes extends TeaModel {
        @NameInMap("AckPolicyInstanceId")
        public String ackPolicyInstanceId;

        @NameInMap("AllNamespace")
        public Integer allNamespace;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("NamespaceList")
        public java.util.List<String> namespaceList;

        public static CreateOpaStrategyNewRequestScopes build(java.util.Map<String, ?> map) throws Exception {
            CreateOpaStrategyNewRequestScopes self = new CreateOpaStrategyNewRequestScopes();
            return TeaModel.build(map, self);
        }

        public CreateOpaStrategyNewRequestScopes setAckPolicyInstanceId(String ackPolicyInstanceId) {
            this.ackPolicyInstanceId = ackPolicyInstanceId;
            return this;
        }
        public String getAckPolicyInstanceId() {
            return this.ackPolicyInstanceId;
        }

        public CreateOpaStrategyNewRequestScopes setAllNamespace(Integer allNamespace) {
            this.allNamespace = allNamespace;
            return this;
        }
        public Integer getAllNamespace() {
            return this.allNamespace;
        }

        public CreateOpaStrategyNewRequestScopes setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateOpaStrategyNewRequestScopes setNamespaceList(java.util.List<String> namespaceList) {
            this.namespaceList = namespaceList;
            return this;
        }
        public java.util.List<String> getNamespaceList() {
            return this.namespaceList;
        }

    }

}
