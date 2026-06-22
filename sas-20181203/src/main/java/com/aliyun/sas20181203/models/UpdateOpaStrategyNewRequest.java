// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateOpaStrategyNewRequest extends TeaModel {
    /**
     * <p>The alert content details included in the policy.</p>
     */
    @NameInMap("AlarmDetail")
    public UpdateOpaStrategyNewRequestAlarmDetail alarmDetail;

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
    public java.util.List<UpdateOpaStrategyNewRequestScopes> scopes;

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
         * <p>The baseline check item ID.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/2539883.html">GetOpaClusterBaseLineList</a> operation to query this value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hc.image.checklist.identify.hc_exploit_couchdb_linux.item</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The baseline check item name.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/2539883.html">GetOpaClusterBaseLineList</a> operation to query this value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>passwd</p>
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
         * <p>The baseline item information.</p>
         */
        @NameInMap("Item")
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailBaselineItem> item;

        /**
         * <p>The list of risk levels.</p>
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
         * <p>The risky image build command type ID.</p>
         * <blockquote>
         * <p>Call the <a href="~~ListImageBuildRiskItem~~">ListImageBuildRiskItem</a> operation to query this value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The risky image build command type name.</p>
         * <blockquote>
         * <p>Call the <a href="~~ListImageBuildRiskItem~~">ListImageBuildRiskItem</a> operation to query this value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>name</p>
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
         * <p>The list of risk items.</p>
         */
        @NameInMap("Item")
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailBuildRiskItem> item;

        /**
         * <p>The list of risk levels.</p>
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
         * <p>The malicious sample ID.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeMatchedMaliciousNames~~">DescribeMatchedMaliciousNames</a> operation to query this value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>65201</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The malicious sample name.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeMatchedMaliciousNames~~">DescribeMatchedMaliciousNames</a> operation to query this value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>abnormal binary file</p>
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
         * <p>The malicious sample list.</p>
         */
        @NameInMap("Item")
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailMaliciousFileItem> item;

        /**
         * <p>The list of risk levels.</p>
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
         * <p>The sensitive file type ID.</p>
         * <blockquote>
         * <p>Call the <a href="~~GetSensitiveDefineRuleConfig~~">GetSensitiveDefineRuleConfig</a> operation to query this value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The sensitive file type name.</p>
         * <blockquote>
         * <p>Call the <a href="~~GetSensitiveDefineRuleConfig~~">GetSensitiveDefineRuleConfig</a> operation to query this value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>name</p>
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
         * <p>The list of sensitive file check items.</p>
         */
        @NameInMap("Item")
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailSensitiveFileItem> item;

        /**
         * <p>The list of risk levels.</p>
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
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/471928.html">DescribeVulListPage</a> operation to query this value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CVE-2023-36034</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The vulnerability name.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/471928.html">DescribeVulListPage</a> operation to query this value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oval:com.redhat.rhsa:def:20227002</p>
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
         * <p>The vulnerability type ID. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: system vulnerability</li>
         * <li><strong>app</strong>: application vulnerability.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The vulnerability type name. Valid values:</p>
         * <ul>
         * <li><strong>system vulnerability</strong></li>
         * <li><strong>application vulnerability</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>系统漏洞</p>
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
         * <p>The vulnerability list.</p>
         */
        @NameInMap("Item")
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailVulItem> item;

        /**
         * <p>The list of vulnerability types.</p>
         */
        @NameInMap("RiskClass")
        public java.util.List<UpdateOpaStrategyNewRequestAlarmDetailVulRiskClass> riskClass;

        /**
         * <p>The list of risk levels.</p>
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
         * <p>The baseline risk information.</p>
         */
        @NameInMap("Baseline")
        public UpdateOpaStrategyNewRequestAlarmDetailBaseline baseline;

        /**
         * <p>The risky image build command information.</p>
         */
        @NameInMap("BuildRisk")
        public UpdateOpaStrategyNewRequestAlarmDetailBuildRisk buildRisk;

        /**
         * <p>The malicious sample information.</p>
         */
        @NameInMap("MaliciousFile")
        public UpdateOpaStrategyNewRequestAlarmDetailMaliciousFile maliciousFile;

        /**
         * <p>The sensitive file information.</p>
         */
        @NameInMap("SensitiveFile")
        public UpdateOpaStrategyNewRequestAlarmDetailSensitiveFile sensitiveFile;

        /**
         * <p>The vulnerability item information.</p>
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
