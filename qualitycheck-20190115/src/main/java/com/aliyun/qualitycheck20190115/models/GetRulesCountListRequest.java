// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRulesCountListRequest extends TeaModel {
    /**
     * <p>Workspace ID.</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    /**
     * <p>Business name to which the rule belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>电话业务</p>
     */
    @NameInMap("BusinessName")
    public String businessName;

    /**
     * <p>Broad business category.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BusinessRange")
    public Integer businessRange;

    /**
     * <p>Category name.</p>
     * 
     * <strong>example:</strong>
     * <p>分类名称A</p>
     */
    @NameInMap("CategoryName")
    public String categoryName;

    /**
     * <p>Whether to count the total number.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CountTotal")
    public Boolean countTotal;

    /**
     * <p>Rule creator ID. Same as CreateUserId. Use either one.</p>
     * 
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("CreateEmpid")
    public String createEmpid;

    /**
     * <p>Rule creator ID. Same as CreateEmpid. Use either one.</p>
     * 
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("CreateUserId")
    public Long createUserId;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Filter by creation time (start of range).</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-08 23:59:59</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Rule updater ID. Same as UpdateUserId. Use either one.</p>
     * 
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("LastUpdateEmpid")
    public String lastUpdateEmpid;

    /**
     * <p>Page number of the rule list.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Required fields.</p>
     */
    @NameInMap("RequireInfos")
    public java.util.List<String> requireInfos;

    /**
     * <p>Search by rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Rid")
    public Long rid;

    /**
     * <p>Search by rule ID or rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RuleIdOrRuleName")
    public String ruleIdOrRuleName;

    /**
     * <p>Scoring type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleScoreSingleType")
    public Integer ruleScoreSingleType;

    /**
     * <p>Rule category.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>Quality inspection scheme ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SchemeId")
    public Long schemeId;

    /**
     * <p>Source type.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SourceType")
    public Integer sourceType;

    /**
     * <p>Filter by creation time (end of range).</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-07 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Rule status:</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>Type value of the rule category to which the rule belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    /**
     * <p>Name of the rule category to which the rule belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>全部类别</p>
     */
    @NameInMap("TypeName")
    public String typeName;

    /**
     * <p>Filter by update time (end of range).</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-08 23:59:59</p>
     */
    @NameInMap("UpdateEndTime")
    public String updateEndTime;

    /**
     * <p>Filter by update time (start of range).</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-07 00:00:00</p>
     */
    @NameInMap("UpdateStartTime")
    public String updateStartTime;

    /**
     * <p>Rule updater ID. Same as LastUpdateEmpid. Use either one.</p>
     * 
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("UpdateUserId")
    public Long updateUserId;

    public static GetRulesCountListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRulesCountListRequest self = new GetRulesCountListRequest();
        return TeaModel.build(map, self);
    }

    public GetRulesCountListRequest setBaseMeAgentId(Long baseMeAgentId) {
        this.baseMeAgentId = baseMeAgentId;
        return this;
    }
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    public GetRulesCountListRequest setBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }
    public String getBusinessName() {
        return this.businessName;
    }

    public GetRulesCountListRequest setBusinessRange(Integer businessRange) {
        this.businessRange = businessRange;
        return this;
    }
    public Integer getBusinessRange() {
        return this.businessRange;
    }

    public GetRulesCountListRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public GetRulesCountListRequest setCountTotal(Boolean countTotal) {
        this.countTotal = countTotal;
        return this;
    }
    public Boolean getCountTotal() {
        return this.countTotal;
    }

    public GetRulesCountListRequest setCreateEmpid(String createEmpid) {
        this.createEmpid = createEmpid;
        return this;
    }
    public String getCreateEmpid() {
        return this.createEmpid;
    }

    public GetRulesCountListRequest setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public Long getCreateUserId() {
        return this.createUserId;
    }

    public GetRulesCountListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetRulesCountListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetRulesCountListRequest setLastUpdateEmpid(String lastUpdateEmpid) {
        this.lastUpdateEmpid = lastUpdateEmpid;
        return this;
    }
    public String getLastUpdateEmpid() {
        return this.lastUpdateEmpid;
    }

    public GetRulesCountListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetRulesCountListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetRulesCountListRequest setRequireInfos(java.util.List<String> requireInfos) {
        this.requireInfos = requireInfos;
        return this;
    }
    public java.util.List<String> getRequireInfos() {
        return this.requireInfos;
    }

    public GetRulesCountListRequest setRid(Long rid) {
        this.rid = rid;
        return this;
    }
    public Long getRid() {
        return this.rid;
    }

    public GetRulesCountListRequest setRuleIdOrRuleName(String ruleIdOrRuleName) {
        this.ruleIdOrRuleName = ruleIdOrRuleName;
        return this;
    }
    public String getRuleIdOrRuleName() {
        return this.ruleIdOrRuleName;
    }

    public GetRulesCountListRequest setRuleScoreSingleType(Integer ruleScoreSingleType) {
        this.ruleScoreSingleType = ruleScoreSingleType;
        return this;
    }
    public Integer getRuleScoreSingleType() {
        return this.ruleScoreSingleType;
    }

    public GetRulesCountListRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public GetRulesCountListRequest setSchemeId(Long schemeId) {
        this.schemeId = schemeId;
        return this;
    }
    public Long getSchemeId() {
        return this.schemeId;
    }

    public GetRulesCountListRequest setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public Integer getSourceType() {
        return this.sourceType;
    }

    public GetRulesCountListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetRulesCountListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetRulesCountListRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public GetRulesCountListRequest setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public GetRulesCountListRequest setUpdateEndTime(String updateEndTime) {
        this.updateEndTime = updateEndTime;
        return this;
    }
    public String getUpdateEndTime() {
        return this.updateEndTime;
    }

    public GetRulesCountListRequest setUpdateStartTime(String updateStartTime) {
        this.updateStartTime = updateStartTime;
        return this;
    }
    public String getUpdateStartTime() {
        return this.updateStartTime;
    }

    public GetRulesCountListRequest setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
        return this;
    }
    public Long getUpdateUserId() {
        return this.updateUserId;
    }

}
