// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RuleInfo extends TeaModel {
    /**
     * <p>The review option. Valid values: 1: no automatic review. 3: automatic review. This field is used for 4.0 protocol compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoReview")
    public Integer autoReview;

    /**
     * <p>The list of business category names.</p>
     */
    @NameInMap("BusinessCategoryNameList")
    public java.util.List<String> businessCategoryNameList;

    /**
     * <p>The check type. Valid values: 0: Service standard check. 1: Service attitude check. 2: Service professionalism check. 3: Customer attitude check. 4: Service process correctness check.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CheckType")
    public Long checkType;

    /**
     * <p>The comments.</p>
     * 
     * <strong>example:</strong>
     * <p>Violation</p>
     */
    @NameInMap("Comments")
    public String comments;

    /**
     * <p>The configuration type. This parameter is dedicated to the version 4.0 protocol. Valid values: 1: Simple condition configuration. 2: Advanced configuration. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConfigType")
    public Integer configType;

    /**
     * <p>The name of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhang San</p>
     */
    @NameInMap("CreateEmpName")
    public String createEmpName;

    /**
     * <p>The employee ID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CreateEmpid")
    public String createEmpid;

    /**
     * <p>The creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1641277321000</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The edit permission. Valid values: 1: Editing is denied. 0 or null: Editing is allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Deny")
    public Integer deny;

    /**
     * <p>The test script.</p>
     */
    @NameInMap("Dialogues")
    public java.util.List<RuleTestDialogue> dialogues;

    /**
     * <p>The effective status. Valid values: 0: Not effective. 1: Effective.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Effective")
    public Integer effective;

    /**
     * <p>The effective end time.</p>
     * 
     * <strong>example:</strong>
     * <p>OperationMode</p>
     */
    @NameInMap("EffectiveEndTime")
    public String effectiveEndTime;

    /**
     * <p>The effective start time.</p>
     * 
     * <strong>example:</strong>
     * <p>OperationMode</p>
     */
    @NameInMap("EffectiveStartTime")
    public String effectiveStartTime;

    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1641277321000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The external property.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExternalProperty")
    public Integer externalProperty;

    /**
     * <p>The full lifecycle effective status. Valid values: 0: No. 1: Yes.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FullCycle")
    public Integer fullCycle;

    /**
     * <p>The graph flow canvas.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("GraphFlow")
    public Object graphFlow;

    /**
     * <p>The deletion status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsDelete")
    public Integer isDelete;

    /**
     * <p>The online status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsOnline")
    public Integer isOnline;

    /**
     * <p>The conditional expression, such as a&amp;&amp;b.</p>
     * 
     * <strong>example:</strong>
     * <p>a&amp;&amp;b</p>
     */
    @NameInMap("Lambda")
    public String lambda;

    /**
     * <p>The name of the last updater.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhang San</p>
     */
    @NameInMap("LastUpdateEmpName")
    public String lastUpdateEmpName;

    /**
     * <p>The employee ID of the last updater.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LastUpdateEmpid")
    public String lastUpdateEmpid;

    /**
     * <p>The last update time.</p>
     * 
     * <strong>example:</strong>
     * <p>1641277321000</p>
     */
    @NameInMap("LastUpdateTime")
    public String lastUpdateTime;

    /**
     * <p>The rule level. Valid values: 0: Severe violation. 1: Moderate violation. 2: Minor violation.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Level")
    public Integer level;

    /**
     * <p>The fulfillment status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Meet")
    public Integer meet;

    /**
     * <p>Specifies whether the rule is modified in the quality inspection scheme.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ModifyType")
    public Integer modifyType;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>Greeting rule</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The operation mode.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OperationMode")
    public Integer operationMode;

    /**
     * <p>The prerequisite rule.</p>
     */
    @NameInMap("PreqRule")
    public RuleInfoPreqRule preqRule;

    /**
     * <p>The quality check type. This parameter is used for compatibility with version 4.0 logic. Valid values: 0: Offline quality check. 1: Real-time quality check.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("QualityCheckType")
    public Integer qualityCheckType;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Rid")
    public String rid;

    /**
     * <p>The rule category name.</p>
     * 
     * <strong>example:</strong>
     * <p>Positive rule</p>
     */
    @NameInMap("RuleCategoryName")
    public String ruleCategoryName;

    /**
     * <p>Specifies whether to calculate the score. Valid values: 1: no scoring. 3: scoring. This field is used for 4.0 protocol compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RuleScoreType")
    public Integer ruleScoreType;

    /**
     * <p>The rule type. Valid values: 0: default. 1: user-created. This field is used for 4.0 logic compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The quality check dimension object.</p>
     */
    @NameInMap("SchemeCheckType")
    public SchemeCheckType schemeCheckType;

    /**
     * <p>The ID of the associated quality check scheme.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SchemeId")
    public Long schemeId;

    /**
     * <p>The name of the quality check scheme.</p>
     * 
     * <strong>example:</strong>
     * <p>General scheme</p>
     */
    @NameInMap("SchemeName")
    public String schemeName;

    /**
     * <p>The mapping ID between the quality check scheme and the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SchemeRuleMappingId")
    public Long schemeRuleMappingId;

    /**
     * <p>The deletion status of the scoring item, which is used to gray out the item when it is deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ScoreDeleted")
    public Boolean scoreDeleted;

    /**
     * <p>The score category ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScoreId")
    public Long scoreId;

    /**
     * <p>The name of the main scoring item.</p>
     * 
     * <strong>example:</strong>
     * <p>Violation</p>
     */
    @NameInMap("ScoreName")
    public String scoreName;

    /**
     * <p>The score value.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScoreNum")
    public Float scoreNum;

    /**
     * <p>The score calculation type. This parameter is dedicated to the version 4.0 protocol. Valid values: 0: Add or deduct points after the rule is triggered. 1: Award a one-time score after the rule is triggered.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScoreNumType")
    public Integer scoreNumType;

    /**
     * <p>The score rule hit type. Valid values: 0: Score is calculated when a node is hit.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ScoreRuleHitType")
    public Integer scoreRuleHitType;

    /**
     * <p>The sub-item ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScoreSubId")
    public Long scoreSubId;

    /**
     * <p>The sub-scoring item.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScoreSubName")
    public String scoreSubName;

    /**
     * <p>The score adjustment type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScoreType")
    public Integer scoreType;

    /**
     * <p>The sort order within the quality inspection dimension.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SortIndex")
    public Integer sortIndex;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1641277321000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The rule status.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The rule category. This parameter is dedicated to the version 4.0 protocol. Valid values: 10: General rule for quality check scheme. 11: Process rule for quality check scheme.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TargetType")
    public Integer targetType;

    /**
     * <p>The flow canvas ID.</p>
     * 
     * <strong>example:</strong>
     * <p>111111111</p>
     */
    @NameInMap("TaskFlowId")
    public Long taskFlowId;

    /**
     * <p><strong>[Deprecated]</strong> The task flow type. Default value: -1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskFlowType")
    public Integer taskFlowType;

    /**
     * <p>The list of trigger conditions.</p>
     */
    @NameInMap("Triggers")
    public java.util.List<String> triggers;

    /**
     * <p>The rule category. Valid values: 2: public opinion monitoring. 3: business. This field is used for 4.0 logic compatibility.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Type")
    public Integer type;

    /**
     * <p>The weight.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public RuleInfo setPreqRule(RuleInfoPreqRule preqRule) {
        this.preqRule = preqRule;
        return this;
    }
    public RuleInfoPreqRule getPreqRule() {
        return this.preqRule;
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

    public RuleInfo setScoreNum(Float scoreNum) {
        this.scoreNum = scoreNum;
        return this;
    }
    public Float getScoreNum() {
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

    public static class RuleInfoPreqRule extends TeaModel {
        /**
         * <p>The prerequisite rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rid")
        public String rid;

        public static RuleInfoPreqRule build(java.util.Map<String, ?> map) throws Exception {
            RuleInfoPreqRule self = new RuleInfoPreqRule();
            return TeaModel.build(map, self);
        }

        public RuleInfoPreqRule setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

    }

}
