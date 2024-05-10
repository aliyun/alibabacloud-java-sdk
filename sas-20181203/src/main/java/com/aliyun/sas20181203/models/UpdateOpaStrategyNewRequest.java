// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateOpaStrategyNewRequest extends TeaModel {
    /**
     * <p>The rule configuration.</p>
     */
    @NameInMap("AlarmDetail")
    public UpdateOpaStrategyNewRequestAlarmDetail alarmDetail;

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
    public java.util.List<UpdateOpaStrategyNewRequestScopes> scopes;

    /**
     * <p>The rule ID.</p>
     * <br>
     * <p>>  You can call the [ListOpaClusterStrategyNew](https://help.aliyun.com/document_detail/2623574.html) operation to query the rule ID.</p>
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
        /**
         * <p>The ID of the baseline check item.</p>
         * <br>
         * <p>>  You can call the [GetOpaClusterBaseLineList](https://help.aliyun.com/document_detail/2539883.html) operation to query the ID of the baseline check item.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the baseline check item.</p>
         * <br>
         * <p>>  You can call the [GetOpaClusterBaseLineList](https://help.aliyun.com/document_detail/2539883.html) operation to query the name of the baseline check item.</p>
         */
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
        /**
         * <p>The baseline check configuration.</p>
         */
        @NameInMap("Item")
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailBaselineItem> item;

        /**
         * <p>The risk levels.</p>
         */
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

    public static class UpdateOpaStrategyNewRequestAlarmDetailBuildRiskItem extends TeaModel {
        /**
         * <p>The ID of the image build risk.</p>
         * <br>
         * <p>>  You can call the [ListImageBuildRiskItem](~~ListImageBuildRiskItem~~) operation to query the ID of the malicious sample.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the image build risk.</p>
         * <br>
         * <p>>  You can call the [ListImageBuildRiskItem](~~ListImageBuildRiskItem~~) operation to query the ID of the malicious sample.</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateOpaStrategyNewRequestAlarmDetailBuildRiskItem build(java.util.Map<String, ?> map) throws Exception {
            UpdateOpaStrategyNewRequestAlarmDetailBuildRiskItem self = new UpdateOpaStrategyNewRequestAlarmDetailBuildRiskItem();
            return TeaModel.build(map, self);
        }

        public UpdateOpaStrategyNewRequestAlarmDetailBuildRiskItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateOpaStrategyNewRequestAlarmDetailBuildRiskItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateOpaStrategyNewRequestAlarmDetailBuildRisk extends TeaModel {
        /**
         * <p>The configuration of image build risk.</p>
         */
        @NameInMap("Item")
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailBuildRiskItem> item;

        /**
         * <p>The risk levels.</p>
         */
        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static UpdateOpaStrategyNewRequestAlarmDetailBuildRisk build(java.util.Map<String, ?> map) throws Exception {
            UpdateOpaStrategyNewRequestAlarmDetailBuildRisk self = new UpdateOpaStrategyNewRequestAlarmDetailBuildRisk();
            return TeaModel.build(map, self);
        }

        public UpdateOpaStrategyNewRequestAlarmDetailBuildRisk setItem(java.util.List<UpdateOpaStrategyNewRequestAlarmDetailBuildRiskItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailBuildRiskItem> getItem() {
            return this.item;
        }

        public UpdateOpaStrategyNewRequestAlarmDetailBuildRisk setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class UpdateOpaStrategyNewRequestAlarmDetailMaliciousFileItem extends TeaModel {
        /**
         * <p>The ID of the malicious sample.</p>
         * <br>
         * <p>>  You can call the [DescribeMatchedMaliciousNames](~~DescribeMatchedMaliciousNames~~) operation to query the ID of the malicious sample.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the malicious sample.</p>
         * <br>
         * <p>>  You can call the [DescribeMatchedMaliciousNames](~~DescribeMatchedMaliciousNames~~) operation to query the name of the malicious sample.</p>
         */
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
        /**
         * <p>The configuration of malicious samples.</p>
         */
        @NameInMap("Item")
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailMaliciousFileItem> item;

        /**
         * <p>The risk levels.</p>
         */
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

    public static class UpdateOpaStrategyNewRequestAlarmDetailSensitiveFileItem extends TeaModel {
        /**
         * <p>The ID of the sensitive files.</p>
         * <br>
         * <p>>  You can call the [GetSensitiveDefineRuleConfig](~~GetSensitiveDefineRuleConfig~~) operation to query the ID of the malicious sample.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the sensitive files.</p>
         * <br>
         * <p>>  You can call the [GetSensitiveDefineRuleConfig](~~GetSensitiveDefineRuleConfig~~) operation to query the ID of the malicious sample.</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateOpaStrategyNewRequestAlarmDetailSensitiveFileItem build(java.util.Map<String, ?> map) throws Exception {
            UpdateOpaStrategyNewRequestAlarmDetailSensitiveFileItem self = new UpdateOpaStrategyNewRequestAlarmDetailSensitiveFileItem();
            return TeaModel.build(map, self);
        }

        public UpdateOpaStrategyNewRequestAlarmDetailSensitiveFileItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateOpaStrategyNewRequestAlarmDetailSensitiveFileItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateOpaStrategyNewRequestAlarmDetailSensitiveFile extends TeaModel {
        /**
         * <p>The configuration of sensitive file.</p>
         */
        @NameInMap("Item")
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailSensitiveFileItem> item;

        /**
         * <p>The risk levels.</p>
         */
        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static UpdateOpaStrategyNewRequestAlarmDetailSensitiveFile build(java.util.Map<String, ?> map) throws Exception {
            UpdateOpaStrategyNewRequestAlarmDetailSensitiveFile self = new UpdateOpaStrategyNewRequestAlarmDetailSensitiveFile();
            return TeaModel.build(map, self);
        }

        public UpdateOpaStrategyNewRequestAlarmDetailSensitiveFile setItem(java.util.List<UpdateOpaStrategyNewRequestAlarmDetailSensitiveFileItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailSensitiveFileItem> getItem() {
            return this.item;
        }

        public UpdateOpaStrategyNewRequestAlarmDetailSensitiveFile setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class UpdateOpaStrategyNewRequestAlarmDetailVulItem extends TeaModel {
        /**
         * <p>The vulnerability ID.</p>
         * <br>
         * <p>>  You can call the [DescribeVulListPage](https://help.aliyun.com/document_detail/471928.html) operation to query the vulnerability ID.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The vulnerability name.</p>
         * <br>
         * <p>>  You can call the [DescribeVulListPage](https://help.aliyun.com/document_detail/471928.html) operation to query the vulnerability name.</p>
         */
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

    public static class UpdateOpaStrategyNewRequestAlarmDetailVulRiskClass extends TeaModel {
        /**
         * <p>The ID of the vulnerability types. Valid values:</p>
         * <br>
         * <p>*   **cve**: system vulnerability</p>
         * <p>*   **app**: application vulnerability</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **system vulnerability**</p>
         * <p>*   **application vulnerability**</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateOpaStrategyNewRequestAlarmDetailVulRiskClass build(java.util.Map<String, ?> map) throws Exception {
            UpdateOpaStrategyNewRequestAlarmDetailVulRiskClass self = new UpdateOpaStrategyNewRequestAlarmDetailVulRiskClass();
            return TeaModel.build(map, self);
        }

        public UpdateOpaStrategyNewRequestAlarmDetailVulRiskClass setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateOpaStrategyNewRequestAlarmDetailVulRiskClass setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateOpaStrategyNewRequestAlarmDetailVul extends TeaModel {
        /**
         * <p>The information about the vulnerability.</p>
         */
        @NameInMap("Item")
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailVulItem> item;

        /**
         * <p>Risk type of vulnerability.</p>
         */
        @NameInMap("RiskClass")
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailVulRiskClass> riskClass;

        /**
         * <p>The risk levels.</p>
         */
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

        public UpdateOpaStrategyNewRequestAlarmDetailVul setRiskClass(java.util.List<UpdateOpaStrategyNewRequestAlarmDetailVulRiskClass> riskClass) {
            this.riskClass = riskClass;
            return this;
        }
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailVulRiskClass> getRiskClass() {
            return this.riskClass;
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
        /**
         * <p>The baseline check configuration.</p>
         */
        @NameInMap("Baseline")
        public UpdateOpaStrategyNewRequestAlarmDetailBaseline baseline;

        /**
         * <p>The configuration of image build risk.</p>
         */
        @NameInMap("BuildRisk")
        public UpdateOpaStrategyNewRequestAlarmDetailBuildRisk buildRisk;

        /**
         * <p>The configuration of malicious samples.</p>
         */
        @NameInMap("MaliciousFile")
        public UpdateOpaStrategyNewRequestAlarmDetailMaliciousFile maliciousFile;

        /**
         * <p>The configuration of sensitive file.</p>
         */
        @NameInMap("SensitiveFile")
        public UpdateOpaStrategyNewRequestAlarmDetailSensitiveFile sensitiveFile;

        /**
         * <p>The vulnerability configuration.</p>
         */
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

        public UpdateOpaStrategyNewRequestAlarmDetail setBuildRisk(UpdateOpaStrategyNewRequestAlarmDetailBuildRisk buildRisk) {
            this.buildRisk = buildRisk;
            return this;
        }
        public UpdateOpaStrategyNewRequestAlarmDetailBuildRisk getBuildRisk() {
            return this.buildRisk;
        }

        public UpdateOpaStrategyNewRequestAlarmDetail setMaliciousFile(UpdateOpaStrategyNewRequestAlarmDetailMaliciousFile maliciousFile) {
            this.maliciousFile = maliciousFile;
            return this;
        }
        public UpdateOpaStrategyNewRequestAlarmDetailMaliciousFile getMaliciousFile() {
            return this.maliciousFile;
        }

        public UpdateOpaStrategyNewRequestAlarmDetail setSensitiveFile(UpdateOpaStrategyNewRequestAlarmDetailSensitiveFile sensitiveFile) {
            this.sensitiveFile = sensitiveFile;
            return this;
        }
        public UpdateOpaStrategyNewRequestAlarmDetailSensitiveFile getSensitiveFile() {
            return this.sensitiveFile;
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
