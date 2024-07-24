// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRulesCountListRequest extends TeaModel {
    /**
     * <p>baseMeAgentId</p>
     */
    @NameInMap("BaseMeAgentId")
    public Long baseMeAgentId;

    @NameInMap("BusinessName")
    public String businessName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BusinessRange")
    public Integer businessRange;

    @NameInMap("CategoryName")
    public String categoryName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CountTotal")
    public Boolean countTotal;

    /**
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("CreateEmpid")
    public String createEmpid;

    /**
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("CreateUserId")
    public Long createUserId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>2022-10-08 23:59:59</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("LastUpdateEmpid")
    public String lastUpdateEmpid;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequireInfos")
    public java.util.List<String> requireInfos;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Rid")
    public Long rid;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RuleIdOrRuleName")
    public String ruleIdOrRuleName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleScoreSingleType")
    public Integer ruleScoreSingleType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("SchemeId")
    public Long schemeId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SourceType")
    public Integer sourceType;

    /**
     * <strong>example:</strong>
     * <p>2022-10-07 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    @NameInMap("TypeName")
    public String typeName;

    /**
     * <strong>example:</strong>
     * <p>2022-10-08 23:59:59</p>
     */
    @NameInMap("UpdateEndTime")
    public String updateEndTime;

    /**
     * <strong>example:</strong>
     * <p>2022-10-07 00:00:00</p>
     */
    @NameInMap("UpdateStartTime")
    public String updateStartTime;

    /**
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
