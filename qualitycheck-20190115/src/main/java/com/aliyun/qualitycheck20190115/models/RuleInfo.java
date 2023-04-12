// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RuleInfo extends TeaModel {
    @NameInMap("AutoReview")
    public Integer autoReview;

    @NameInMap("BusinessCategoryNameList")
    public java.util.List<String> businessCategoryNameList;

    @NameInMap("CheckType")
    public Long checkType;

    @NameInMap("Comments")
    public String comments;

    @NameInMap("ConfigType")
    public Integer configType;

    @NameInMap("CreateEmpName")
    public String createEmpName;

    @NameInMap("CreateEmpid")
    public String createEmpid;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Deny")
    public Integer deny;

    @NameInMap("Dialogues")
    public java.util.List<RuleTestDialogue> dialogues;

    @NameInMap("Effective")
    public Integer effective;

    @NameInMap("EffectiveEndTime")
    public String effectiveEndTime;

    @NameInMap("EffectiveStartTime")
    public String effectiveStartTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ExternalProperty")
    public Integer externalProperty;

    @NameInMap("FullCycle")
    public Integer fullCycle;

    @NameInMap("GraphFlow")
    public Object graphFlow;

    @NameInMap("IsDelete")
    public Integer isDelete;

    @NameInMap("IsOnline")
    public Integer isOnline;

    @NameInMap("Lambda")
    public String lambda;

    @NameInMap("LastUpdateEmpName")
    public String lastUpdateEmpName;

    @NameInMap("LastUpdateEmpid")
    public String lastUpdateEmpid;

    @NameInMap("LastUpdateTime")
    public String lastUpdateTime;

    @NameInMap("Level")
    public Integer level;

    @NameInMap("Meet")
    public Integer meet;

    @NameInMap("ModifyType")
    public Integer modifyType;

    @NameInMap("Name")
    public String name;

    @NameInMap("OperationMode")
    public Integer operationMode;

    @NameInMap("QualityCheckType")
    public Integer qualityCheckType;

    @NameInMap("Rid")
    public String rid;

    @NameInMap("RuleCategoryName")
    public String ruleCategoryName;

    @NameInMap("RuleScoreType")
    public Integer ruleScoreType;

    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("SchemeCheckType")
    public SchemeCheckType schemeCheckType;

    @NameInMap("SchemeId")
    public Long schemeId;

    @NameInMap("SchemeName")
    public String schemeName;

    @NameInMap("SchemeRuleMappingId")
    public Long schemeRuleMappingId;

    @NameInMap("ScoreDeleted")
    public Boolean scoreDeleted;

    @NameInMap("ScoreId")
    public Long scoreId;

    @NameInMap("ScoreName")
    public String scoreName;

    @NameInMap("ScoreNum")
    public Integer scoreNum;

    @NameInMap("ScoreNumType")
    public Integer scoreNumType;

    @NameInMap("ScoreRuleHitType")
    public Integer scoreRuleHitType;

    @NameInMap("ScoreSubId")
    public Long scoreSubId;

    @NameInMap("ScoreSubName")
    public String scoreSubName;

    @NameInMap("ScoreType")
    public Integer scoreType;

    @NameInMap("SortIndex")
    public Integer sortIndex;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TargetType")
    public Integer targetType;

    @NameInMap("TaskFlowId")
    public Long taskFlowId;

    @NameInMap("TaskFlowType")
    public Integer taskFlowType;

    @NameInMap("Triggers")
    public java.util.List<String> triggers;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("Weight")
    public String weight;

    public static RuleInfo build(java.util.Map<String, ?> map) throws Exception {
        RuleInfo self = new RuleInfo();
        return TeaModel.build(map, self);
    }

    public RuleInfo setAutoReview(Integer autoReview) {
        this.autoReview = autoReview;
        return this;
    }
    public Integer getAutoReview() {
        return this.autoReview;
    }

    public RuleInfo setBusinessCategoryNameList(java.util.List<String> businessCategoryNameList) {
        this.businessCategoryNameList = businessCategoryNameList;
        return this;
    }
    public java.util.List<String> getBusinessCategoryNameList() {
        return this.businessCategoryNameList;
    }

    public RuleInfo setCheckType(Long checkType) {
        this.checkType = checkType;
        return this;
    }
    public Long getCheckType() {
        return this.checkType;
    }

    public RuleInfo setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public RuleInfo setConfigType(Integer configType) {
        this.configType = configType;
        return this;
    }
    public Integer getConfigType() {
        return this.configType;
    }

    public RuleInfo setCreateEmpName(String createEmpName) {
        this.createEmpName = createEmpName;
        return this;
    }
    public String getCreateEmpName() {
        return this.createEmpName;
    }

    public RuleInfo setCreateEmpid(String createEmpid) {
        this.createEmpid = createEmpid;
        return this;
    }
    public String getCreateEmpid() {
        return this.createEmpid;
    }

    public RuleInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public RuleInfo setDeny(Integer deny) {
        this.deny = deny;
        return this;
    }
    public Integer getDeny() {
        return this.deny;
    }

    public RuleInfo setDialogues(java.util.List<RuleTestDialogue> dialogues) {
        this.dialogues = dialogues;
        return this;
    }
    public java.util.List<RuleTestDialogue> getDialogues() {
        return this.dialogues;
    }

    public RuleInfo setEffective(Integer effective) {
        this.effective = effective;
        return this;
    }
    public Integer getEffective() {
        return this.effective;
    }

    public RuleInfo setEffectiveEndTime(String effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
        return this;
    }
    public String getEffectiveEndTime() {
        return this.effectiveEndTime;
    }

    public RuleInfo setEffectiveStartTime(String effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
        return this;
    }
    public String getEffectiveStartTime() {
        return this.effectiveStartTime;
    }

    public RuleInfo setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public RuleInfo setExternalProperty(Integer externalProperty) {
        this.externalProperty = externalProperty;
        return this;
    }
    public Integer getExternalProperty() {
        return this.externalProperty;
    }

    public RuleInfo setFullCycle(Integer fullCycle) {
        this.fullCycle = fullCycle;
        return this;
    }
    public Integer getFullCycle() {
        return this.fullCycle;
    }

    public RuleInfo setGraphFlow(Object graphFlow) {
        this.graphFlow = graphFlow;
        return this;
    }
    public Object getGraphFlow() {
        return this.graphFlow;
    }

    public RuleInfo setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
        return this;
    }
    public Integer getIsDelete() {
        return this.isDelete;
    }

    public RuleInfo setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
        return this;
    }
    public Integer getIsOnline() {
        return this.isOnline;
    }

    public RuleInfo setLambda(String lambda) {
        this.lambda = lambda;
        return this;
    }
    public String getLambda() {
        return this.lambda;
    }

    public RuleInfo setLastUpdateEmpName(String lastUpdateEmpName) {
        this.lastUpdateEmpName = lastUpdateEmpName;
        return this;
    }
    public String getLastUpdateEmpName() {
        return this.lastUpdateEmpName;
    }

    public RuleInfo setLastUpdateEmpid(String lastUpdateEmpid) {
        this.lastUpdateEmpid = lastUpdateEmpid;
        return this;
    }
    public String getLastUpdateEmpid() {
        return this.lastUpdateEmpid;
    }

    public RuleInfo setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public RuleInfo setLevel(Integer level) {
        this.level = level;
        return this;
    }
    public Integer getLevel() {
        return this.level;
    }

    public RuleInfo setMeet(Integer meet) {
        this.meet = meet;
        return this;
    }
    public Integer getMeet() {
        return this.meet;
    }

    public RuleInfo setModifyType(Integer modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public Integer getModifyType() {
        return this.modifyType;
    }

    public RuleInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RuleInfo setOperationMode(Integer operationMode) {
        this.operationMode = operationMode;
        return this;
    }
    public Integer getOperationMode() {
        return this.operationMode;
    }

    public RuleInfo setQualityCheckType(Integer qualityCheckType) {
        this.qualityCheckType = qualityCheckType;
        return this;
    }
    public Integer getQualityCheckType() {
        return this.qualityCheckType;
    }

    public RuleInfo setRid(String rid) {
        this.rid = rid;
        return this;
    }
    public String getRid() {
        return this.rid;
    }

    public RuleInfo setRuleCategoryName(String ruleCategoryName) {
        this.ruleCategoryName = ruleCategoryName;
        return this;
    }
    public String getRuleCategoryName() {
        return this.ruleCategoryName;
    }

    public RuleInfo setRuleScoreType(Integer ruleScoreType) {
        this.ruleScoreType = ruleScoreType;
        return this;
    }
    public Integer getRuleScoreType() {
        return this.ruleScoreType;
    }

    public RuleInfo setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public RuleInfo setSchemeCheckType(SchemeCheckType schemeCheckType) {
        this.schemeCheckType = schemeCheckType;
        return this;
    }
    public SchemeCheckType getSchemeCheckType() {
        return this.schemeCheckType;
    }

    public RuleInfo setSchemeId(Long schemeId) {
        this.schemeId = schemeId;
        return this;
    }
    public Long getSchemeId() {
        return this.schemeId;
    }

    public RuleInfo setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public RuleInfo setSchemeRuleMappingId(Long schemeRuleMappingId) {
        this.schemeRuleMappingId = schemeRuleMappingId;
        return this;
    }
    public Long getSchemeRuleMappingId() {
        return this.schemeRuleMappingId;
    }

    public RuleInfo setScoreDeleted(Boolean scoreDeleted) {
        this.scoreDeleted = scoreDeleted;
        return this;
    }
    public Boolean getScoreDeleted() {
        return this.scoreDeleted;
    }

    public RuleInfo setScoreId(Long scoreId) {
        this.scoreId = scoreId;
        return this;
    }
    public Long getScoreId() {
        return this.scoreId;
    }

    public RuleInfo setScoreName(String scoreName) {
        this.scoreName = scoreName;
        return this;
    }
    public String getScoreName() {
        return this.scoreName;
    }

    public RuleInfo setScoreNum(Integer scoreNum) {
        this.scoreNum = scoreNum;
        return this;
    }
    public Integer getScoreNum() {
        return this.scoreNum;
    }

    public RuleInfo setScoreNumType(Integer scoreNumType) {
        this.scoreNumType = scoreNumType;
        return this;
    }
    public Integer getScoreNumType() {
        return this.scoreNumType;
    }

    public RuleInfo setScoreRuleHitType(Integer scoreRuleHitType) {
        this.scoreRuleHitType = scoreRuleHitType;
        return this;
    }
    public Integer getScoreRuleHitType() {
        return this.scoreRuleHitType;
    }

    public RuleInfo setScoreSubId(Long scoreSubId) {
        this.scoreSubId = scoreSubId;
        return this;
    }
    public Long getScoreSubId() {
        return this.scoreSubId;
    }

    public RuleInfo setScoreSubName(String scoreSubName) {
        this.scoreSubName = scoreSubName;
        return this;
    }
    public String getScoreSubName() {
        return this.scoreSubName;
    }

    public RuleInfo setScoreType(Integer scoreType) {
        this.scoreType = scoreType;
        return this;
    }
    public Integer getScoreType() {
        return this.scoreType;
    }

    public RuleInfo setSortIndex(Integer sortIndex) {
        this.sortIndex = sortIndex;
        return this;
    }
    public Integer getSortIndex() {
        return this.sortIndex;
    }

    public RuleInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public RuleInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public RuleInfo setTargetType(Integer targetType) {
        this.targetType = targetType;
        return this;
    }
    public Integer getTargetType() {
        return this.targetType;
    }

    public RuleInfo setTaskFlowId(Long taskFlowId) {
        this.taskFlowId = taskFlowId;
        return this;
    }
    public Long getTaskFlowId() {
        return this.taskFlowId;
    }

    public RuleInfo setTaskFlowType(Integer taskFlowType) {
        this.taskFlowType = taskFlowType;
        return this;
    }
    public Integer getTaskFlowType() {
        return this.taskFlowType;
    }

    public RuleInfo setTriggers(java.util.List<String> triggers) {
        this.triggers = triggers;
        return this;
    }
    public java.util.List<String> getTriggers() {
        return this.triggers;
    }

    public RuleInfo setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public RuleInfo setWeight(String weight) {
        this.weight = weight;
        return this;
    }
    public String getWeight() {
        return this.weight;
    }

}
