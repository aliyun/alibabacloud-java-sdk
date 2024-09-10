// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOpaStrategyNewRequest extends TeaModel {
    /**
     * <p>The risks that you want to detect by using the rule.</p>
     */
    @NameInMap("AlarmDetail")
    public CreateOpaStrategyNewRequestAlarmDetail alarmDetail;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cfa7e2fb8c221483ba59e098c34c6****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The cluster name.</p>
     * <blockquote>
     * <p>This parameter is deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The rule description.</p>
     * 
     * <strong>example:</strong>
     * <p>default policy</p>
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
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MaliciousImage")
    public Boolean maliciousImage;

    /**
     * <p>The action that is performed when the rule is hit. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: trigger alerts</li>
     * <li><strong>2</strong>: block</li>
     * <li><strong>3</strong>: allow</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleAction")
    public Integer ruleAction;

    /**
     * <p>The application scope of the rule.</p>
     */
    @NameInMap("Scopes")
    public java.util.List<CreateOpaStrategyNewRequestScopes> scopes;

    /**
     * <p>The rule ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2623574.html">ListOpaClusterStrategyNew</a> operation to query the rule ID.</p>
     * </blockquote>
     * <blockquote>
     * <p>This parameter is invalid when you create a rule.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("StrategyName")
    public String strategyName;

    /**
     * <p>The ID of the rule template.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2539952.html">GetOpaStrategyTemplateSummary</a> operation to query the ID of the rule template.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>109</p>
     */
    @NameInMap("StrategyTemplateId")
    public Long strategyTemplateId;

    /**
     * <p>Specifies whether the rule supports unscanned images. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
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
        /**
         * <p>The ID of the baseline check item.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2539883.html">GetOpaClusterBaseLineList</a> operation to query the ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hc.image.checklist.identify.hc_exploit_couchdb_linux.item</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the baseline check item.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2539883.html">GetOpaClusterBaseLineList</a> operation to query the name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Unauthorized access to CouchDB configuration risk</p>
         */
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
        /**
         * <p>The baseline check items.</p>
         */
        @NameInMap("Item")
        public java.util.List<CreateOpaStrategyNewRequestAlarmDetailBaselineItem> item;

        /**
         * <p>The risk levels.</p>
         */
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

    public static class CreateOpaStrategyNewRequestAlarmDetailBuildRiskItem extends TeaModel {
        /**
         * <p>The ID of the image build risk.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListImageBuildRiskItem~~">ListImageBuildRiskItem</a> operation to query the ID of the malicious sample.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the image build risk.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListImageBuildRiskItem~~">ListImageBuildRiskItem</a> operation to query the ID of the malicious sample.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateOpaStrategyNewRequestAlarmDetailBuildRiskItem build(java.util.Map<String, ?> map) throws Exception {
            CreateOpaStrategyNewRequestAlarmDetailBuildRiskItem self = new CreateOpaStrategyNewRequestAlarmDetailBuildRiskItem();
            return TeaModel.build(map, self);
        }

        public CreateOpaStrategyNewRequestAlarmDetailBuildRiskItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateOpaStrategyNewRequestAlarmDetailBuildRiskItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateOpaStrategyNewRequestAlarmDetailBuildRisk extends TeaModel {
        /**
         * <p>The configuration of image build risk.</p>
         */
        @NameInMap("Item")
        public java.util.List<CreateOpaStrategyNewRequestAlarmDetailBuildRiskItem> item;

        /**
         * <p>The risk levels.</p>
         */
        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static CreateOpaStrategyNewRequestAlarmDetailBuildRisk build(java.util.Map<String, ?> map) throws Exception {
            CreateOpaStrategyNewRequestAlarmDetailBuildRisk self = new CreateOpaStrategyNewRequestAlarmDetailBuildRisk();
            return TeaModel.build(map, self);
        }

        public CreateOpaStrategyNewRequestAlarmDetailBuildRisk setItem(java.util.List<CreateOpaStrategyNewRequestAlarmDetailBuildRiskItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<CreateOpaStrategyNewRequestAlarmDetailBuildRiskItem> getItem() {
            return this.item;
        }

        public CreateOpaStrategyNewRequestAlarmDetailBuildRisk setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class CreateOpaStrategyNewRequestAlarmDetailMaliciousFileItem extends TeaModel {
        /**
         * <p>The ID of the malicious sample.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeMatchedMaliciousNames~~">DescribeMatchedMaliciousNames</a> operation to query the ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3685699</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the malicious sample.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeMatchedMaliciousNames~~">DescribeMatchedMaliciousNames</a> operation to query the name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>abnormal binary file</p>
         */
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
        /**
         * <p>The malicious samples.</p>
         */
        @NameInMap("Item")
        public java.util.List<CreateOpaStrategyNewRequestAlarmDetailMaliciousFileItem> item;

        /**
         * <p>The risk levels.</p>
         */
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

    public static class CreateOpaStrategyNewRequestAlarmDetailSensitiveFileItem extends TeaModel {
        /**
         * <p>The ID of the sensitive files.</p>
         * <blockquote>
         * <p> You can call the <a href="~~GetSensitiveDefineRuleConfig~~">GetSensitiveDefineRuleConfig</a> operation to query the ID of the malicious sample.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the sensitive files.</p>
         * <blockquote>
         * <p> You can call the <a href="~~GetSensitiveDefineRuleConfig~~">GetSensitiveDefineRuleConfig</a> operation to query the ID of the malicious sample.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateOpaStrategyNewRequestAlarmDetailSensitiveFileItem build(java.util.Map<String, ?> map) throws Exception {
            CreateOpaStrategyNewRequestAlarmDetailSensitiveFileItem self = new CreateOpaStrategyNewRequestAlarmDetailSensitiveFileItem();
            return TeaModel.build(map, self);
        }

        public CreateOpaStrategyNewRequestAlarmDetailSensitiveFileItem setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateOpaStrategyNewRequestAlarmDetailSensitiveFileItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateOpaStrategyNewRequestAlarmDetailSensitiveFile extends TeaModel {
        /**
         * <p>The configuration of sensitive file.</p>
         */
        @NameInMap("Item")
        public java.util.List<CreateOpaStrategyNewRequestAlarmDetailSensitiveFileItem> item;

        /**
         * <p>The risk levels.</p>
         */
        @NameInMap("RiskLevel")
        public java.util.List<String> riskLevel;

        public static CreateOpaStrategyNewRequestAlarmDetailSensitiveFile build(java.util.Map<String, ?> map) throws Exception {
            CreateOpaStrategyNewRequestAlarmDetailSensitiveFile self = new CreateOpaStrategyNewRequestAlarmDetailSensitiveFile();
            return TeaModel.build(map, self);
        }

        public CreateOpaStrategyNewRequestAlarmDetailSensitiveFile setItem(java.util.List<CreateOpaStrategyNewRequestAlarmDetailSensitiveFileItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<CreateOpaStrategyNewRequestAlarmDetailSensitiveFileItem> getItem() {
            return this.item;
        }

        public CreateOpaStrategyNewRequestAlarmDetailSensitiveFile setRiskLevel(java.util.List<String> riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public java.util.List<String> getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class CreateOpaStrategyNewRequestAlarmDetailVulItem extends TeaModel {
        /**
         * <p>The ID of the vulnerability.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/471928.html">DescribeVulListPage</a> operation to query the ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CVE-2023-36034</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the vulnerability.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/471928.html">DescribeVulListPage</a> operation to query the name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Microsoft Edge vul</p>
         */
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

    public static class CreateOpaStrategyNewRequestAlarmDetailVulRiskClass extends TeaModel {
        /**
         * <p>The ID of the vulnerability types. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: system vulnerability</li>
         * <li><strong>app</strong>: application vulnerability</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>system vulnerability</strong></li>
         * <li><strong>application vulnerability</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system vulnerability</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreateOpaStrategyNewRequestAlarmDetailVulRiskClass build(java.util.Map<String, ?> map) throws Exception {
            CreateOpaStrategyNewRequestAlarmDetailVulRiskClass self = new CreateOpaStrategyNewRequestAlarmDetailVulRiskClass();
            return TeaModel.build(map, self);
        }

        public CreateOpaStrategyNewRequestAlarmDetailVulRiskClass setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateOpaStrategyNewRequestAlarmDetailVulRiskClass setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateOpaStrategyNewRequestAlarmDetailVul extends TeaModel {
        /**
         * <p>The vulnerabilities.</p>
         */
        @NameInMap("Item")
        public java.util.List<CreateOpaStrategyNewRequestAlarmDetailVulItem> item;

        /**
         * <p>Risk type of vulnerability.</p>
         */
        @NameInMap("RiskClass")
        public java.util.List<CreateOpaStrategyNewRequestAlarmDetailVulRiskClass> riskClass;

        /**
         * <p>The risk levels.</p>
         */
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

        public CreateOpaStrategyNewRequestAlarmDetailVul setRiskClass(java.util.List<CreateOpaStrategyNewRequestAlarmDetailVulRiskClass> riskClass) {
            this.riskClass = riskClass;
            return this;
        }
        public java.util.List<CreateOpaStrategyNewRequestAlarmDetailVulRiskClass> getRiskClass() {
            return this.riskClass;
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
        /**
         * <p>The baseline risks.</p>
         */
        @NameInMap("Baseline")
        public CreateOpaStrategyNewRequestAlarmDetailBaseline baseline;

        /**
         * <p>The configuration of image build risk.</p>
         */
        @NameInMap("BuildRisk")
        public CreateOpaStrategyNewRequestAlarmDetailBuildRisk buildRisk;

        /**
         * <p>The malicious sample risks.</p>
         */
        @NameInMap("MaliciousFile")
        public CreateOpaStrategyNewRequestAlarmDetailMaliciousFile maliciousFile;

        /**
         * <p>The configuration of sensitive file.</p>
         */
        @NameInMap("SensitiveFile")
        public CreateOpaStrategyNewRequestAlarmDetailSensitiveFile sensitiveFile;

        /**
         * <p>The vulnerability risks.</p>
         */
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

        public CreateOpaStrategyNewRequestAlarmDetail setBuildRisk(CreateOpaStrategyNewRequestAlarmDetailBuildRisk buildRisk) {
            this.buildRisk = buildRisk;
            return this;
        }
        public CreateOpaStrategyNewRequestAlarmDetailBuildRisk getBuildRisk() {
            return this.buildRisk;
        }

        public CreateOpaStrategyNewRequestAlarmDetail setMaliciousFile(CreateOpaStrategyNewRequestAlarmDetailMaliciousFile maliciousFile) {
            this.maliciousFile = maliciousFile;
            return this;
        }
        public CreateOpaStrategyNewRequestAlarmDetailMaliciousFile getMaliciousFile() {
            return this.maliciousFile;
        }

        public CreateOpaStrategyNewRequestAlarmDetail setSensitiveFile(CreateOpaStrategyNewRequestAlarmDetailSensitiveFile sensitiveFile) {
            this.sensitiveFile = sensitiveFile;
            return this;
        }
        public CreateOpaStrategyNewRequestAlarmDetailSensitiveFile getSensitiveFile() {
            return this.sensitiveFile;
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
        /**
         * <p>The ID of the cluster node to which the rule is applied.</p>
         * <blockquote>
         * <p>This parameter is not required when you create the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ack-p-1</p>
         */
        @NameInMap("AckPolicyInstanceId")
        public String ackPolicyInstanceId;

        /**
         * <p>Specifies whether to include all namespaces. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: includes all namespaces.</li>
         * <li><strong>0</strong>: does not include all namespaces.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllNamespace")
        public Integer allNamespace;

        /**
         * <p>The ID of the cluster that is specified in the rule.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/421736.html">DescribeGroupedContainerInstances</a> operation to query the cluster ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cc50d***015d2</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The namespaces.</p>
         * <blockquote>
         * <p>This parameter is valid only when the AllNamespace parameter is set to 0.</p>
         * </blockquote>
         */
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
