// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class CreateBlockRequest extends TeaModel {
    @NameInMap("ApproveStrategyNodes")
    public java.util.List<CreateBlockRequestApproveStrategyNodes> approveStrategyNodes;

    @NameInMap("BlockId")
    public Long blockId;

    @NameInMap("Director")
    public String director;

    @NameInMap("IsNeedApprove")
    public Integer isNeedApprove;

    @NameInMap("IsRecall")
    public Integer isRecall;

    @NameInMap("IsTemplate")
    public Integer isTemplate;

    @NameInMap("LabelName")
    public String labelName;

    @NameInMap("NoticeDesc")
    public String noticeDesc;

    @NameInMap("NoticeEnclosureInfos")
    public java.util.List<CreateBlockRequestNoticeEnclosureInfos> noticeEnclosureInfos;

    @NameInMap("NoticeRequestLink")
    public String noticeRequestLink;

    @NameInMap("NoticeType")
    public Integer noticeType;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("Scene")
    public Integer scene;

    @NameInMap("Scopes")
    public java.util.List<CreateBlockRequestScopes> scopes;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Title")
    public String title;

    @NameInMap("Type")
    public String type;

    @NameInMap("VersionId")
    public Long versionId;

    @NameInMap("creatorEmpId")
    public String creatorEmpId;

    public static CreateBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockRequest self = new CreateBlockRequest();
        return TeaModel.build(map, self);
    }

    public CreateBlockRequest setApproveStrategyNodes(java.util.List<CreateBlockRequestApproveStrategyNodes> approveStrategyNodes) {
        this.approveStrategyNodes = approveStrategyNodes;
        return this;
    }
    public java.util.List<CreateBlockRequestApproveStrategyNodes> getApproveStrategyNodes() {
        return this.approveStrategyNodes;
    }

    public CreateBlockRequest setBlockId(Long blockId) {
        this.blockId = blockId;
        return this;
    }
    public Long getBlockId() {
        return this.blockId;
    }

    public CreateBlockRequest setDirector(String director) {
        this.director = director;
        return this;
    }
    public String getDirector() {
        return this.director;
    }

    public CreateBlockRequest setIsNeedApprove(Integer isNeedApprove) {
        this.isNeedApprove = isNeedApprove;
        return this;
    }
    public Integer getIsNeedApprove() {
        return this.isNeedApprove;
    }

    public CreateBlockRequest setIsRecall(Integer isRecall) {
        this.isRecall = isRecall;
        return this;
    }
    public Integer getIsRecall() {
        return this.isRecall;
    }

    public CreateBlockRequest setIsTemplate(Integer isTemplate) {
        this.isTemplate = isTemplate;
        return this;
    }
    public Integer getIsTemplate() {
        return this.isTemplate;
    }

    public CreateBlockRequest setLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }
    public String getLabelName() {
        return this.labelName;
    }

    public CreateBlockRequest setNoticeDesc(String noticeDesc) {
        this.noticeDesc = noticeDesc;
        return this;
    }
    public String getNoticeDesc() {
        return this.noticeDesc;
    }

    public CreateBlockRequest setNoticeEnclosureInfos(java.util.List<CreateBlockRequestNoticeEnclosureInfos> noticeEnclosureInfos) {
        this.noticeEnclosureInfos = noticeEnclosureInfos;
        return this;
    }
    public java.util.List<CreateBlockRequestNoticeEnclosureInfos> getNoticeEnclosureInfos() {
        return this.noticeEnclosureInfos;
    }

    public CreateBlockRequest setNoticeRequestLink(String noticeRequestLink) {
        this.noticeRequestLink = noticeRequestLink;
        return this;
    }
    public String getNoticeRequestLink() {
        return this.noticeRequestLink;
    }

    public CreateBlockRequest setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
        return this;
    }
    public Integer getNoticeType() {
        return this.noticeType;
    }

    public CreateBlockRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public CreateBlockRequest setScene(Integer scene) {
        this.scene = scene;
        return this;
    }
    public Integer getScene() {
        return this.scene;
    }

    public CreateBlockRequest setScopes(java.util.List<CreateBlockRequestScopes> scopes) {
        this.scopes = scopes;
        return this;
    }
    public java.util.List<CreateBlockRequestScopes> getScopes() {
        return this.scopes;
    }

    public CreateBlockRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public CreateBlockRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateBlockRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateBlockRequest setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

    public CreateBlockRequest setCreatorEmpId(String creatorEmpId) {
        this.creatorEmpId = creatorEmpId;
        return this;
    }
    public String getCreatorEmpId() {
        return this.creatorEmpId;
    }

    public static class CreateBlockRequestApproveStrategyNodes extends TeaModel {
        @NameInMap("ApproveRuleType")
        public Integer approveRuleType;

        @NameInMap("ApproveType")
        public Integer approveType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("NodeCode")
        public String nodeCode;

        @NameInMap("PriorityOrder")
        public Integer priorityOrder;

        @NameInMap("RoleCode")
        public Integer roleCode;

        @NameInMap("RoleValue")
        public java.util.List<String> roleValue;

        @NameInMap("TemplateId")
        public Long templateId;

        public static CreateBlockRequestApproveStrategyNodes build(java.util.Map<String, ?> map) throws Exception {
            CreateBlockRequestApproveStrategyNodes self = new CreateBlockRequestApproveStrategyNodes();
            return TeaModel.build(map, self);
        }

        public CreateBlockRequestApproveStrategyNodes setApproveRuleType(Integer approveRuleType) {
            this.approveRuleType = approveRuleType;
            return this;
        }
        public Integer getApproveRuleType() {
            return this.approveRuleType;
        }

        public CreateBlockRequestApproveStrategyNodes setApproveType(Integer approveType) {
            this.approveType = approveType;
            return this;
        }
        public Integer getApproveType() {
            return this.approveType;
        }

        public CreateBlockRequestApproveStrategyNodes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateBlockRequestApproveStrategyNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateBlockRequestApproveStrategyNodes setNodeCode(String nodeCode) {
            this.nodeCode = nodeCode;
            return this;
        }
        public String getNodeCode() {
            return this.nodeCode;
        }

        public CreateBlockRequestApproveStrategyNodes setPriorityOrder(Integer priorityOrder) {
            this.priorityOrder = priorityOrder;
            return this;
        }
        public Integer getPriorityOrder() {
            return this.priorityOrder;
        }

        public CreateBlockRequestApproveStrategyNodes setRoleCode(Integer roleCode) {
            this.roleCode = roleCode;
            return this;
        }
        public Integer getRoleCode() {
            return this.roleCode;
        }

        public CreateBlockRequestApproveStrategyNodes setRoleValue(java.util.List<String> roleValue) {
            this.roleValue = roleValue;
            return this;
        }
        public java.util.List<String> getRoleValue() {
            return this.roleValue;
        }

        public CreateBlockRequestApproveStrategyNodes setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

    public static class CreateBlockRequestNoticeEnclosureInfos extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("url")
        public String url;

        public static CreateBlockRequestNoticeEnclosureInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateBlockRequestNoticeEnclosureInfos self = new CreateBlockRequestNoticeEnclosureInfos();
            return TeaModel.build(map, self);
        }

        public CreateBlockRequestNoticeEnclosureInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateBlockRequestNoticeEnclosureInfos setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateBlockRequestScopesBlockScopeApp extends TeaModel {
        @NameInMap("AppName")
        public java.util.List<String> appName;

        @NameInMap("Type")
        public Integer type;

        public static CreateBlockRequestScopesBlockScopeApp build(java.util.Map<String, ?> map) throws Exception {
            CreateBlockRequestScopesBlockScopeApp self = new CreateBlockRequestScopesBlockScopeApp();
            return TeaModel.build(map, self);
        }

        public CreateBlockRequestScopesBlockScopeApp setAppName(java.util.List<String> appName) {
            this.appName = appName;
            return this;
        }
        public java.util.List<String> getAppName() {
            return this.appName;
        }

        public CreateBlockRequestScopesBlockScopeApp setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class CreateBlockRequestScopesBlockScopeBgSystem extends TeaModel {
        @NameInMap("RelateCodes")
        public java.util.List<String> relateCodes;

        @NameInMap("SelfCodeName")
        public String selfCodeName;

        public static CreateBlockRequestScopesBlockScopeBgSystem build(java.util.Map<String, ?> map) throws Exception {
            CreateBlockRequestScopesBlockScopeBgSystem self = new CreateBlockRequestScopesBlockScopeBgSystem();
            return TeaModel.build(map, self);
        }

        public CreateBlockRequestScopesBlockScopeBgSystem setRelateCodes(java.util.List<String> relateCodes) {
            this.relateCodes = relateCodes;
            return this;
        }
        public java.util.List<String> getRelateCodes() {
            return this.relateCodes;
        }

        public CreateBlockRequestScopesBlockScopeBgSystem setSelfCodeName(String selfCodeName) {
            this.selfCodeName = selfCodeName;
            return this;
        }
        public String getSelfCodeName() {
            return this.selfCodeName;
        }

    }

    public static class CreateBlockRequestScopesBlockScopeClusterRelations extends TeaModel {
        @NameInMap("AppCodes")
        public java.util.List<String> appCodes;

        @NameInMap("LabelCodes")
        public java.util.List<String> labelCodes;

        @NameInMap("RelateCodes")
        public java.util.List<String> relateCodes;

        @NameInMap("SelfCode")
        public String selfCode;

        public static CreateBlockRequestScopesBlockScopeClusterRelations build(java.util.Map<String, ?> map) throws Exception {
            CreateBlockRequestScopesBlockScopeClusterRelations self = new CreateBlockRequestScopesBlockScopeClusterRelations();
            return TeaModel.build(map, self);
        }

        public CreateBlockRequestScopesBlockScopeClusterRelations setAppCodes(java.util.List<String> appCodes) {
            this.appCodes = appCodes;
            return this;
        }
        public java.util.List<String> getAppCodes() {
            return this.appCodes;
        }

        public CreateBlockRequestScopesBlockScopeClusterRelations setLabelCodes(java.util.List<String> labelCodes) {
            this.labelCodes = labelCodes;
            return this;
        }
        public java.util.List<String> getLabelCodes() {
            return this.labelCodes;
        }

        public CreateBlockRequestScopesBlockScopeClusterRelations setRelateCodes(java.util.List<String> relateCodes) {
            this.relateCodes = relateCodes;
            return this;
        }
        public java.util.List<String> getRelateCodes() {
            return this.relateCodes;
        }

        public CreateBlockRequestScopesBlockScopeClusterRelations setSelfCode(String selfCode) {
            this.selfCode = selfCode;
            return this;
        }
        public String getSelfCode() {
            return this.selfCode;
        }

    }

    public static class CreateBlockRequestScopesBlockScopeCluster extends TeaModel {
        @NameInMap("CodeNames")
        public java.util.List<String> codeNames;

        @NameInMap("Relations")
        public java.util.List<CreateBlockRequestScopesBlockScopeClusterRelations> relations;

        public static CreateBlockRequestScopesBlockScopeCluster build(java.util.Map<String, ?> map) throws Exception {
            CreateBlockRequestScopesBlockScopeCluster self = new CreateBlockRequestScopesBlockScopeCluster();
            return TeaModel.build(map, self);
        }

        public CreateBlockRequestScopesBlockScopeCluster setCodeNames(java.util.List<String> codeNames) {
            this.codeNames = codeNames;
            return this;
        }
        public java.util.List<String> getCodeNames() {
            return this.codeNames;
        }

        public CreateBlockRequestScopesBlockScopeCluster setRelations(java.util.List<CreateBlockRequestScopesBlockScopeClusterRelations> relations) {
            this.relations = relations;
            return this;
        }
        public java.util.List<CreateBlockRequestScopesBlockScopeClusterRelations> getRelations() {
            return this.relations;
        }

    }

    public static class CreateBlockRequestScopesBlockScopeCustomerRelations extends TeaModel {
        @NameInMap("AppCodes")
        public java.util.List<String> appCodes;

        @NameInMap("LabelCodes")
        public java.util.List<String> labelCodes;

        @NameInMap("RelateCodes")
        public java.util.List<String> relateCodes;

        @NameInMap("SelfCode")
        public String selfCode;

        public static CreateBlockRequestScopesBlockScopeCustomerRelations build(java.util.Map<String, ?> map) throws Exception {
            CreateBlockRequestScopesBlockScopeCustomerRelations self = new CreateBlockRequestScopesBlockScopeCustomerRelations();
            return TeaModel.build(map, self);
        }

        public CreateBlockRequestScopesBlockScopeCustomerRelations setAppCodes(java.util.List<String> appCodes) {
            this.appCodes = appCodes;
            return this;
        }
        public java.util.List<String> getAppCodes() {
            return this.appCodes;
        }

        public CreateBlockRequestScopesBlockScopeCustomerRelations setLabelCodes(java.util.List<String> labelCodes) {
            this.labelCodes = labelCodes;
            return this;
        }
        public java.util.List<String> getLabelCodes() {
            return this.labelCodes;
        }

        public CreateBlockRequestScopesBlockScopeCustomerRelations setRelateCodes(java.util.List<String> relateCodes) {
            this.relateCodes = relateCodes;
            return this;
        }
        public java.util.List<String> getRelateCodes() {
            return this.relateCodes;
        }

        public CreateBlockRequestScopesBlockScopeCustomerRelations setSelfCode(String selfCode) {
            this.selfCode = selfCode;
            return this;
        }
        public String getSelfCode() {
            return this.selfCode;
        }

    }

    public static class CreateBlockRequestScopesBlockScopeCustomer extends TeaModel {
        @NameInMap("CodeNames")
        public java.util.List<String> codeNames;

        @NameInMap("Relations")
        public java.util.List<CreateBlockRequestScopesBlockScopeCustomerRelations> relations;

        @NameInMap("Uid")
        public String uid;

        @NameInMap("ViewCodes")
        public java.util.List<Integer> viewCodes;

        public static CreateBlockRequestScopesBlockScopeCustomer build(java.util.Map<String, ?> map) throws Exception {
            CreateBlockRequestScopesBlockScopeCustomer self = new CreateBlockRequestScopesBlockScopeCustomer();
            return TeaModel.build(map, self);
        }

        public CreateBlockRequestScopesBlockScopeCustomer setCodeNames(java.util.List<String> codeNames) {
            this.codeNames = codeNames;
            return this;
        }
        public java.util.List<String> getCodeNames() {
            return this.codeNames;
        }

        public CreateBlockRequestScopesBlockScopeCustomer setRelations(java.util.List<CreateBlockRequestScopesBlockScopeCustomerRelations> relations) {
            this.relations = relations;
            return this;
        }
        public java.util.List<CreateBlockRequestScopesBlockScopeCustomerRelations> getRelations() {
            return this.relations;
        }

        public CreateBlockRequestScopesBlockScopeCustomer setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public CreateBlockRequestScopesBlockScopeCustomer setViewCodes(java.util.List<Integer> viewCodes) {
            this.viewCodes = viewCodes;
            return this;
        }
        public java.util.List<Integer> getViewCodes() {
            return this.viewCodes;
        }

    }

    public static class CreateBlockRequestScopesBlockScopeProductRelations extends TeaModel {
        @NameInMap("AppCodes")
        public java.util.List<String> appCodes;

        @NameInMap("LabelCodes")
        public java.util.List<String> labelCodes;

        @NameInMap("RelateCodes")
        public java.util.List<String> relateCodes;

        @NameInMap("SelfCode")
        public String selfCode;

        public static CreateBlockRequestScopesBlockScopeProductRelations build(java.util.Map<String, ?> map) throws Exception {
            CreateBlockRequestScopesBlockScopeProductRelations self = new CreateBlockRequestScopesBlockScopeProductRelations();
            return TeaModel.build(map, self);
        }

        public CreateBlockRequestScopesBlockScopeProductRelations setAppCodes(java.util.List<String> appCodes) {
            this.appCodes = appCodes;
            return this;
        }
        public java.util.List<String> getAppCodes() {
            return this.appCodes;
        }

        public CreateBlockRequestScopesBlockScopeProductRelations setLabelCodes(java.util.List<String> labelCodes) {
            this.labelCodes = labelCodes;
            return this;
        }
        public java.util.List<String> getLabelCodes() {
            return this.labelCodes;
        }

        public CreateBlockRequestScopesBlockScopeProductRelations setRelateCodes(java.util.List<String> relateCodes) {
            this.relateCodes = relateCodes;
            return this;
        }
        public java.util.List<String> getRelateCodes() {
            return this.relateCodes;
        }

        public CreateBlockRequestScopesBlockScopeProductRelations setSelfCode(String selfCode) {
            this.selfCode = selfCode;
            return this;
        }
        public String getSelfCode() {
            return this.selfCode;
        }

    }

    public static class CreateBlockRequestScopesBlockScopeProduct extends TeaModel {
        @NameInMap("CodeNames")
        public java.util.List<String> codeNames;

        @NameInMap("Key")
        public String key;

        @NameInMap("Relations")
        public java.util.List<CreateBlockRequestScopesBlockScopeProductRelations> relations;

        @NameInMap("ViewCode")
        public java.util.List<String> viewCode;

        public static CreateBlockRequestScopesBlockScopeProduct build(java.util.Map<String, ?> map) throws Exception {
            CreateBlockRequestScopesBlockScopeProduct self = new CreateBlockRequestScopesBlockScopeProduct();
            return TeaModel.build(map, self);
        }

        public CreateBlockRequestScopesBlockScopeProduct setCodeNames(java.util.List<String> codeNames) {
            this.codeNames = codeNames;
            return this;
        }
        public java.util.List<String> getCodeNames() {
            return this.codeNames;
        }

        public CreateBlockRequestScopesBlockScopeProduct setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateBlockRequestScopesBlockScopeProduct setRelations(java.util.List<CreateBlockRequestScopesBlockScopeProductRelations> relations) {
            this.relations = relations;
            return this;
        }
        public java.util.List<CreateBlockRequestScopesBlockScopeProductRelations> getRelations() {
            return this.relations;
        }

        public CreateBlockRequestScopesBlockScopeProduct setViewCode(java.util.List<String> viewCode) {
            this.viewCode = viewCode;
            return this;
        }
        public java.util.List<String> getViewCode() {
            return this.viewCode;
        }

    }

    public static class CreateBlockRequestScopesBlockScope extends TeaModel {
        @NameInMap("App")
        public CreateBlockRequestScopesBlockScopeApp app;

        @NameInMap("BgSystem")
        public java.util.List<CreateBlockRequestScopesBlockScopeBgSystem> bgSystem;

        @NameInMap("Cluster")
        public CreateBlockRequestScopesBlockScopeCluster cluster;

        @NameInMap("Customer")
        public java.util.List<CreateBlockRequestScopesBlockScopeCustomer> customer;

        @NameInMap("Dept")
        public java.util.List<String> dept;

        @NameInMap("Express")
        public String express;

        @NameInMap("Infrastructure")
        public java.util.List<String> infrastructure;

        @NameInMap("Product")
        public java.util.List<CreateBlockRequestScopesBlockScopeProduct> product;

        public static CreateBlockRequestScopesBlockScope build(java.util.Map<String, ?> map) throws Exception {
            CreateBlockRequestScopesBlockScope self = new CreateBlockRequestScopesBlockScope();
            return TeaModel.build(map, self);
        }

        public CreateBlockRequestScopesBlockScope setApp(CreateBlockRequestScopesBlockScopeApp app) {
            this.app = app;
            return this;
        }
        public CreateBlockRequestScopesBlockScopeApp getApp() {
            return this.app;
        }

        public CreateBlockRequestScopesBlockScope setBgSystem(java.util.List<CreateBlockRequestScopesBlockScopeBgSystem> bgSystem) {
            this.bgSystem = bgSystem;
            return this;
        }
        public java.util.List<CreateBlockRequestScopesBlockScopeBgSystem> getBgSystem() {
            return this.bgSystem;
        }

        public CreateBlockRequestScopesBlockScope setCluster(CreateBlockRequestScopesBlockScopeCluster cluster) {
            this.cluster = cluster;
            return this;
        }
        public CreateBlockRequestScopesBlockScopeCluster getCluster() {
            return this.cluster;
        }

        public CreateBlockRequestScopesBlockScope setCustomer(java.util.List<CreateBlockRequestScopesBlockScopeCustomer> customer) {
            this.customer = customer;
            return this;
        }
        public java.util.List<CreateBlockRequestScopesBlockScopeCustomer> getCustomer() {
            return this.customer;
        }

        public CreateBlockRequestScopesBlockScope setDept(java.util.List<String> dept) {
            this.dept = dept;
            return this;
        }
        public java.util.List<String> getDept() {
            return this.dept;
        }

        public CreateBlockRequestScopesBlockScope setExpress(String express) {
            this.express = express;
            return this;
        }
        public String getExpress() {
            return this.express;
        }

        public CreateBlockRequestScopesBlockScope setInfrastructure(java.util.List<String> infrastructure) {
            this.infrastructure = infrastructure;
            return this;
        }
        public java.util.List<String> getInfrastructure() {
            return this.infrastructure;
        }

        public CreateBlockRequestScopesBlockScope setProduct(java.util.List<CreateBlockRequestScopesBlockScopeProduct> product) {
            this.product = product;
            return this;
        }
        public java.util.List<CreateBlockRequestScopesBlockScopeProduct> getProduct() {
            return this.product;
        }

    }

    public static class CreateBlockRequestScopes extends TeaModel {
        @NameInMap("BlockHarm")
        public java.util.List<Integer> blockHarm;

        @NameInMap("BlockScope")
        public CreateBlockRequestScopesBlockScope blockScope;

        @NameInMap("EffectTime")
        public java.util.List<Long> effectTime;

        @NameInMap("ScopeRule")
        public String scopeRule;

        @NameInMap("changeObjectRegex")
        public String changeObjectRegex;

        @NameInMap("riskLevels")
        public java.util.List<Integer> riskLevels;

        public static CreateBlockRequestScopes build(java.util.Map<String, ?> map) throws Exception {
            CreateBlockRequestScopes self = new CreateBlockRequestScopes();
            return TeaModel.build(map, self);
        }

        public CreateBlockRequestScopes setBlockHarm(java.util.List<Integer> blockHarm) {
            this.blockHarm = blockHarm;
            return this;
        }
        public java.util.List<Integer> getBlockHarm() {
            return this.blockHarm;
        }

        public CreateBlockRequestScopes setBlockScope(CreateBlockRequestScopesBlockScope blockScope) {
            this.blockScope = blockScope;
            return this;
        }
        public CreateBlockRequestScopesBlockScope getBlockScope() {
            return this.blockScope;
        }

        public CreateBlockRequestScopes setEffectTime(java.util.List<Long> effectTime) {
            this.effectTime = effectTime;
            return this;
        }
        public java.util.List<Long> getEffectTime() {
            return this.effectTime;
        }

        public CreateBlockRequestScopes setScopeRule(String scopeRule) {
            this.scopeRule = scopeRule;
            return this;
        }
        public String getScopeRule() {
            return this.scopeRule;
        }

        public CreateBlockRequestScopes setChangeObjectRegex(String changeObjectRegex) {
            this.changeObjectRegex = changeObjectRegex;
            return this;
        }
        public String getChangeObjectRegex() {
            return this.changeObjectRegex;
        }

        public CreateBlockRequestScopes setRiskLevels(java.util.List<Integer> riskLevels) {
            this.riskLevels = riskLevels;
            return this;
        }
        public java.util.List<Integer> getRiskLevels() {
            return this.riskLevels;
        }

    }

}
