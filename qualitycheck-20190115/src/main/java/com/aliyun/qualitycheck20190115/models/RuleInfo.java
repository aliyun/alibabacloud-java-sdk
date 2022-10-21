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

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents extends TeaModel {
        @NameInMap("Agent")
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent> agent;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgents setAgent(java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent> agent) {
            this.agent = agent;
            return this;
        }
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoAgentsAgent> getAgent() {
            return this.agent;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer extends TeaModel {
        @NameInMap("ReviewerId")
        public String reviewerId;

        @NameInMap("ReviewerName")
        public String reviewerName;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer setReviewerId(String reviewerId) {
            this.reviewerId = reviewerId;
            return this;
        }
        public String getReviewerId() {
            return this.reviewerId;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer setReviewerName(String reviewerName) {
            this.reviewerName = reviewerName;
            return this;
        }
        public String getReviewerName() {
            return this.reviewerName;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers extends TeaModel {
        @NameInMap("Reviewer")
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer> reviewer;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewers setReviewer(java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer> reviewer) {
            this.reviewer = reviewer;
            return this;
        }
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoReviewersReviewer> getReviewer() {
            return this.reviewer;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Rid")
        public String rid;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules extends TeaModel {
        @NameInMap("RuleBasicInfo")
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo> ruleBasicInfo;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRules setRuleBasicInfo(java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo> ruleBasicInfo) {
            this.ruleBasicInfo = ruleBasicInfo;
            return this;
        }
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoRulesRuleBasicInfo> getRuleBasicInfo() {
            return this.ruleBasicInfo;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents extends TeaModel {
        @NameInMap("SamplingModeAgent")
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent> samplingModeAgent;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents setSamplingModeAgent(java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent> samplingModeAgent) {
            this.samplingModeAgent = samplingModeAgent;
            return this;
        }
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgentsSamplingModeAgent> getSamplingModeAgent() {
            return this.samplingModeAgent;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode extends TeaModel {
        @NameInMap("AnyNumberOfDraws")
        public Integer anyNumberOfDraws;

        @NameInMap("Designated")
        public Boolean designated;

        @NameInMap("Dimension")
        public Integer dimension;

        @NameInMap("Limit")
        public Integer limit;

        @NameInMap("NumberOfDraws")
        public Integer numberOfDraws;

        @NameInMap("Proportion")
        public Float proportion;

        @NameInMap("RandomInspectionNumber")
        public Integer randomInspectionNumber;

        @NameInMap("SamplingModeAgents")
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents samplingModeAgents;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setAnyNumberOfDraws(Integer anyNumberOfDraws) {
            this.anyNumberOfDraws = anyNumberOfDraws;
            return this;
        }
        public Integer getAnyNumberOfDraws() {
            return this.anyNumberOfDraws;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setDesignated(Boolean designated) {
            this.designated = designated;
            return this;
        }
        public Boolean getDesignated() {
            return this.designated;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setDimension(Integer dimension) {
            this.dimension = dimension;
            return this;
        }
        public Integer getDimension() {
            return this.dimension;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setNumberOfDraws(Integer numberOfDraws) {
            this.numberOfDraws = numberOfDraws;
            return this;
        }
        public Integer getNumberOfDraws() {
            return this.numberOfDraws;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setProportion(Float proportion) {
            this.proportion = proportion;
            return this;
        }
        public Float getProportion() {
            return this.proportion;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setRandomInspectionNumber(Integer randomInspectionNumber) {
            this.randomInspectionNumber = randomInspectionNumber;
            return this;
        }
        public Integer getRandomInspectionNumber() {
            return this.randomInspectionNumber;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingMode setSamplingModeAgents(ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents samplingModeAgents) {
            this.samplingModeAgents = samplingModeAgents;
            return this;
        }
        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSamplingModeSamplingModeAgents getSamplingModeAgents() {
            return this.samplingModeAgents;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup extends TeaModel {
        @NameInMap("SkillId")
        public String skillId;

        @NameInMap("SkillName")
        public String skillName;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

    }

    public static class ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups extends TeaModel {
        @NameInMap("SkillGroup")
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup> skillGroup;

        public static ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups build(java.util.Map<String, ?> map) throws Exception {
            ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups self = new ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups();
            return TeaModel.build(map, self);
        }

        public ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroups setSkillGroup(java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup> skillGroup) {
            this.skillGroup = skillGroup;
            return this;
        }
        public java.util.List<ListTaskAssignRulesResponseBodyDataTaskAssignRuleInfoSkillGroupsSkillGroup> getSkillGroup() {
            return this.skillGroup;
        }

    }

}
