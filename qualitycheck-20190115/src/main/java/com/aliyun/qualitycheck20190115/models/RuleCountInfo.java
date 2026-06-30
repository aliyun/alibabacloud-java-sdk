// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RuleCountInfo extends TeaModel {
    /**
     * <p>The review option.</p>
     * <ul>
     * <li><p>1: Manual review</p>
     * </li>
     * <li><p>3: Automatic review</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoReview")
    public Integer autoReview;

    /**
     * <p>A list of basic information about business categories.</p>
     */
    @NameInMap("BusinessCategoryBasicInfoList")
    public java.util.List<BusinessCategoryBasicInfo> businessCategoryBasicInfoList;

    /**
     * <p>A list of business category names.</p>
     */
    @NameInMap("BusinessCategoryNameList")
    public java.util.List<String> businessCategoryNameList;

    /**
     * <p>The business scope.</p>
     */
    @NameInMap("BusinessRange")
    public java.util.List<Integer> businessRange;

    /**
     * <p>The number of checked sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CheckNumber")
    public Long checkNumber;

    /**
     * <p>The comments.</p>
     * 
     * <strong>example:</strong>
     * <p>测试</p>
     */
    @NameInMap("Comments")
    public String comments;

    /**
     * <p>The name of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
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
     * <p>1615133575000</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>You can set this parameter to 1 to reject rule edits, or to 0 or null to allow rule edits.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Deny")
    public Integer deny;

    /**
     * <p>Indicates if the rule is active. \<code>0\\</code>: No. \<code>1\\</code>: Yes.</p>
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
     * <p>1662685868850</p>
     */
    @NameInMap("EffectiveEndTime")
    public String effectiveEndTime;

    /**
     * <p>The effective start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1662685868850</p>
     */
    @NameInMap("EffectiveStartTime")
    public String effectiveStartTime;

    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>1650092585176</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Indicates if the rule is active for the entire lifecycle. \<code>0\\</code>: No. \<code>1\\</code>: Yes.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FullCycle")
    public Integer fullCycle;

    /**
     * <p>The flow canvas, in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>较复杂，忽略</p>
     */
    @NameInMap("GraphFlow")
    public Object graphFlow;

    /**
     * <p>The number of hit sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HitNumber")
    public Long hitNumber;

    /**
     * <p>The hit rate.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HitRate")
    public Float hitRate;

    /**
     * <p>The hit rate of actual violations.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HitRealViolationRate")
    public Float hitRealViolationRate;

    /**
     * <p>Indicates if the rule is deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsDelete")
    public Integer isDelete;

    /**
     * <p>Indicates if the rule is selected.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSelect")
    public Boolean isSelect;

    /**
     * <p>The scheduled task name.</p>
     * 
     * <strong>example:</strong>
     * <p>job-1-20221012-105943</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The name of the user who last updated the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("LastUpdateEmpName")
    public String lastUpdateEmpName;

    /**
     * <p>The employee ID of the user who last updated the rule.</p>
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
     * <p>1648200901000</p>
     */
    @NameInMap("LastUpdateTime")
    public String lastUpdateTime;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>0801转封装测试</p>
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
     * <p>The number of items pending review.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PreReviewNumber")
    public Long preReviewNumber;

    /**
     * <p>The number of problems found.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ProblemNumber")
    public Long problemNumber;

    /**
     * <p>The quality check type.</p>
     * <ul>
     * <li><p>0: Offline</p>
     * </li>
     * <li><p>1: Real-time</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("QualityCheckType")
    public Integer qualityCheckType;

    /**
     * <p>The number of actual violations after review.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RealViolationNumber")
    public Integer realViolationNumber;

    /**
     * <p>The review accuracy rate.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReviewAccuracyRate")
    public Float reviewAccuracyRate;

    /**
     * <p>The number of reviewed items.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReviewNumber")
    public Long reviewNumber;

    /**
     * <p>The review rate.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReviewRate")
    public Float reviewRate;

    /**
     * <p>The review status name.</p>
     * 
     * <strong>example:</strong>
     * <p>通过</p>
     */
    @NameInMap("ReviewStatusName")
    public String reviewStatusName;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Rid")
    public Long rid;

    /**
     * <p>The scoring type. \<code>8\\</code>: No score is set.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleScoreSingleType")
    public Integer ruleScoreSingleType;

    /**
     * <p>Specifies if a score is calculated.</p>
     * <ul>
     * <li><p>1: No</p>
     * </li>
     * <li><p>3: Yes</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleScoreType")
    public Integer ruleScoreType;

    /**
     * <p>The rule origin. For example, a built-in rule or a user-created rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The sub-item ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ScoreSubId")
    public Long scoreSubId;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>1662685868850</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the rule.</p>
     * <ul>
     * <li><p>0: Pending</p>
     * </li>
     * <li><p>1: Active</p>
     * </li>
     * <li><p>2: Expired</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The rule category.</p>
     * <ul>
     * <li><p>10: Standard</p>
     * </li>
     * <li><p>11: Flow-based</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TargetType")
    public Integer targetType;

    /**
     * <p>The rule type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    /**
     * <p>The type name.</p>
     * 
     * <strong>example:</strong>
     * <p>全部类别</p>
     */
    @NameInMap("TypeName")
    public String typeName;

    /**
     * <p>The number of unreviewed items.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UnReviewNumber")
    public Long unReviewNumber;

    /**
     * <p>The user group.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
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
