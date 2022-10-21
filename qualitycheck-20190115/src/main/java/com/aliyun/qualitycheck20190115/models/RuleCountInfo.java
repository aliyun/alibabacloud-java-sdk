// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RuleCountInfo extends TeaModel {
    @NameInMap("AutoReview")
    public Integer autoReview;

    @NameInMap("BusinessCategoryBasicInfoList")
    public java.util.List<BusinessCategoryBasicInfo> businessCategoryBasicInfoList;

    @NameInMap("BusinessCategoryNameList")
    public java.util.List<String> businessCategoryNameList;

    @NameInMap("BusinessRange")
    public java.util.List<Integer> businessRange;

    @NameInMap("CheckNumber")
    public Long checkNumber;

    @NameInMap("Comments")
    public String comments;

    @NameInMap("CreateEmpName")
    public String createEmpName;

    @NameInMap("CreateEmpid")
    public String createEmpid;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Deny")
    public Integer deny;

    @NameInMap("Effective")
    public Integer effective;

    @NameInMap("EffectiveEndTime")
    public String effectiveEndTime;

    @NameInMap("EffectiveStartTime")
    public String effectiveStartTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("FullCycle")
    public Integer fullCycle;

    @NameInMap("GraphFlow")
    public Object graphFlow;

    @NameInMap("HitNumber")
    public Long hitNumber;

    @NameInMap("HitRate")
    public Float hitRate;

    @NameInMap("HitRealViolationRate")
    public Float hitRealViolationRate;

    @NameInMap("IsDelete")
    public Integer isDelete;

    @NameInMap("IsSelect")
    public Boolean isSelect;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("LastUpdateEmpName")
    public String lastUpdateEmpName;

    @NameInMap("LastUpdateEmpid")
    public String lastUpdateEmpid;

    @NameInMap("LastUpdateTime")
    public String lastUpdateTime;

    @NameInMap("Name")
    public String name;

    @NameInMap("OperationMode")
    public Integer operationMode;

    @NameInMap("PreReviewNumber")
    public Long preReviewNumber;

    @NameInMap("ProblemNumber")
    public Long problemNumber;

    @NameInMap("QualityCheckType")
    public Integer qualityCheckType;

    @NameInMap("RealViolationNumber")
    public Integer realViolationNumber;

    @NameInMap("ReviewAccuracyRate")
    public Float reviewAccuracyRate;

    @NameInMap("ReviewNumber")
    public Long reviewNumber;

    @NameInMap("ReviewRate")
    public Float reviewRate;

    @NameInMap("ReviewStatusName")
    public String reviewStatusName;

    @NameInMap("Rid")
    public Long rid;

    @NameInMap("RuleScoreSingleType")
    public Integer ruleScoreSingleType;

    @NameInMap("RuleScoreType")
    public Integer ruleScoreType;

    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("ScoreSubId")
    public Long scoreSubId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TargetType")
    public Integer targetType;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("TypeName")
    public String typeName;

    @NameInMap("UnReviewNumber")
    public Long unReviewNumber;

    @NameInMap("UserGroup")
    public String userGroup;

    public static RuleCountInfo build(java.util.Map<String, ?> map) throws Exception {
        RuleCountInfo self = new RuleCountInfo();
        return TeaModel.build(map, self);
    }

    public RuleCountInfo setAutoReview(Integer autoReview) {
        this.autoReview = autoReview;
        return this;
    }
    public Integer getAutoReview() {
        return this.autoReview;
    }

    public RuleCountInfo setBusinessCategoryBasicInfoList(java.util.List<BusinessCategoryBasicInfo> businessCategoryBasicInfoList) {
        this.businessCategoryBasicInfoList = businessCategoryBasicInfoList;
        return this;
    }
    public java.util.List<BusinessCategoryBasicInfo> getBusinessCategoryBasicInfoList() {
        return this.businessCategoryBasicInfoList;
    }

    public RuleCountInfo setBusinessCategoryNameList(java.util.List<String> businessCategoryNameList) {
        this.businessCategoryNameList = businessCategoryNameList;
        return this;
    }
    public java.util.List<String> getBusinessCategoryNameList() {
        return this.businessCategoryNameList;
    }

    public RuleCountInfo setBusinessRange(java.util.List<Integer> businessRange) {
        this.businessRange = businessRange;
        return this;
    }
    public java.util.List<Integer> getBusinessRange() {
        return this.businessRange;
    }

    public RuleCountInfo setCheckNumber(Long checkNumber) {
        this.checkNumber = checkNumber;
        return this;
    }
    public Long getCheckNumber() {
        return this.checkNumber;
    }

    public RuleCountInfo setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public RuleCountInfo setCreateEmpName(String createEmpName) {
        this.createEmpName = createEmpName;
        return this;
    }
    public String getCreateEmpName() {
        return this.createEmpName;
    }

    public RuleCountInfo setCreateEmpid(String createEmpid) {
        this.createEmpid = createEmpid;
        return this;
    }
    public String getCreateEmpid() {
        return this.createEmpid;
    }

    public RuleCountInfo setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public RuleCountInfo setDeny(Integer deny) {
        this.deny = deny;
        return this;
    }
    public Integer getDeny() {
        return this.deny;
    }

    public RuleCountInfo setEffective(Integer effective) {
        this.effective = effective;
        return this;
    }
    public Integer getEffective() {
        return this.effective;
    }

    public RuleCountInfo setEffectiveEndTime(String effectiveEndTime) {
        this.effectiveEndTime = effectiveEndTime;
        return this;
    }
    public String getEffectiveEndTime() {
        return this.effectiveEndTime;
    }

    public RuleCountInfo setEffectiveStartTime(String effectiveStartTime) {
        this.effectiveStartTime = effectiveStartTime;
        return this;
    }
    public String getEffectiveStartTime() {
        return this.effectiveStartTime;
    }

    public RuleCountInfo setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public RuleCountInfo setFullCycle(Integer fullCycle) {
        this.fullCycle = fullCycle;
        return this;
    }
    public Integer getFullCycle() {
        return this.fullCycle;
    }

    public RuleCountInfo setGraphFlow(Object graphFlow) {
        this.graphFlow = graphFlow;
        return this;
    }
    public Object getGraphFlow() {
        return this.graphFlow;
    }

    public RuleCountInfo setHitNumber(Long hitNumber) {
        this.hitNumber = hitNumber;
        return this;
    }
    public Long getHitNumber() {
        return this.hitNumber;
    }

    public RuleCountInfo setHitRate(Float hitRate) {
        this.hitRate = hitRate;
        return this;
    }
    public Float getHitRate() {
        return this.hitRate;
    }

    public RuleCountInfo setHitRealViolationRate(Float hitRealViolationRate) {
        this.hitRealViolationRate = hitRealViolationRate;
        return this;
    }
    public Float getHitRealViolationRate() {
        return this.hitRealViolationRate;
    }

    public RuleCountInfo setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
        return this;
    }
    public Integer getIsDelete() {
        return this.isDelete;
    }

    public RuleCountInfo setIsSelect(Boolean isSelect) {
        this.isSelect = isSelect;
        return this;
    }
    public Boolean getIsSelect() {
        return this.isSelect;
    }

    public RuleCountInfo setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public RuleCountInfo setLastUpdateEmpName(String lastUpdateEmpName) {
        this.lastUpdateEmpName = lastUpdateEmpName;
        return this;
    }
    public String getLastUpdateEmpName() {
        return this.lastUpdateEmpName;
    }

    public RuleCountInfo setLastUpdateEmpid(String lastUpdateEmpid) {
        this.lastUpdateEmpid = lastUpdateEmpid;
        return this;
    }
    public String getLastUpdateEmpid() {
        return this.lastUpdateEmpid;
    }

    public RuleCountInfo setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public RuleCountInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RuleCountInfo setOperationMode(Integer operationMode) {
        this.operationMode = operationMode;
        return this;
    }
    public Integer getOperationMode() {
        return this.operationMode;
    }

    public RuleCountInfo setPreReviewNumber(Long preReviewNumber) {
        this.preReviewNumber = preReviewNumber;
        return this;
    }
    public Long getPreReviewNumber() {
        return this.preReviewNumber;
    }

    public RuleCountInfo setProblemNumber(Long problemNumber) {
        this.problemNumber = problemNumber;
        return this;
    }
    public Long getProblemNumber() {
        return this.problemNumber;
    }

    public RuleCountInfo setQualityCheckType(Integer qualityCheckType) {
        this.qualityCheckType = qualityCheckType;
        return this;
    }
    public Integer getQualityCheckType() {
        return this.qualityCheckType;
    }

    public RuleCountInfo setRealViolationNumber(Integer realViolationNumber) {
        this.realViolationNumber = realViolationNumber;
        return this;
    }
    public Integer getRealViolationNumber() {
        return this.realViolationNumber;
    }

    public RuleCountInfo setReviewAccuracyRate(Float reviewAccuracyRate) {
        this.reviewAccuracyRate = reviewAccuracyRate;
        return this;
    }
    public Float getReviewAccuracyRate() {
        return this.reviewAccuracyRate;
    }

    public RuleCountInfo setReviewNumber(Long reviewNumber) {
        this.reviewNumber = reviewNumber;
        return this;
    }
    public Long getReviewNumber() {
        return this.reviewNumber;
    }

    public RuleCountInfo setReviewRate(Float reviewRate) {
        this.reviewRate = reviewRate;
        return this;
    }
    public Float getReviewRate() {
        return this.reviewRate;
    }

    public RuleCountInfo setReviewStatusName(String reviewStatusName) {
        this.reviewStatusName = reviewStatusName;
        return this;
    }
    public String getReviewStatusName() {
        return this.reviewStatusName;
    }

    public RuleCountInfo setRid(Long rid) {
        this.rid = rid;
        return this;
    }
    public Long getRid() {
        return this.rid;
    }

    public RuleCountInfo setRuleScoreSingleType(Integer ruleScoreSingleType) {
        this.ruleScoreSingleType = ruleScoreSingleType;
        return this;
    }
    public Integer getRuleScoreSingleType() {
        return this.ruleScoreSingleType;
    }

    public RuleCountInfo setRuleScoreType(Integer ruleScoreType) {
        this.ruleScoreType = ruleScoreType;
        return this;
    }
    public Integer getRuleScoreType() {
        return this.ruleScoreType;
    }

    public RuleCountInfo setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public RuleCountInfo setScoreSubId(Long scoreSubId) {
        this.scoreSubId = scoreSubId;
        return this;
    }
    public Long getScoreSubId() {
        return this.scoreSubId;
    }

    public RuleCountInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public RuleCountInfo setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public RuleCountInfo setTargetType(Integer targetType) {
        this.targetType = targetType;
        return this;
    }
    public Integer getTargetType() {
        return this.targetType;
    }

    public RuleCountInfo setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public RuleCountInfo setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public RuleCountInfo setUnReviewNumber(Long unReviewNumber) {
        this.unReviewNumber = unReviewNumber;
        return this;
    }
    public Long getUnReviewNumber() {
        return this.unReviewNumber;
    }

    public RuleCountInfo setUserGroup(String userGroup) {
        this.userGroup = userGroup;
        return this;
    }
    public String getUserGroup() {
        return this.userGroup;
    }

}
