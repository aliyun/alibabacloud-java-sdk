// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogListRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DbId")
    public Integer dbId;

    @NameInMap("BeginDate")
    public String beginDate;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SqlId")
    public String sqlId;

    @NameInMap("SqlKey")
    public String sqlKey;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("IsSuccess")
    public String isSuccess;

    @NameInMap("MinAffectRows")
    public Integer minAffectRows;

    @NameInMap("MaxAffectRows")
    public Integer maxAffectRows;

    @NameInMap("MinExecCostUS")
    public Integer minExecCostUS;

    @NameInMap("MaxExecCostUS")
    public Integer maxExecCostUS;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("ClientIpList")
    public java.util.List<String> clientIpList;

    @NameInMap("DbUserList")
    public java.util.List<String> dbUserList;

    @NameInMap("DbHostList")
    public java.util.List<String> dbHostList;

    @NameInMap("RiskLevelList")
    public java.util.List<String> riskLevelList;

    @NameInMap("RuleTypeList")
    public java.util.List<String> ruleTypeList;

    @NameInMap("SqlTypeList")
    public java.util.List<String> sqlTypeList;

    @NameInMap("ClientProgramList")
    public java.util.List<String> clientProgramList;

    public static GetLogListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogListRequest self = new GetLogListRequest();
        return TeaModel.build(map, self);
    }

    public GetLogListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLogListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLogListRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public GetLogListRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public GetLogListRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetLogListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetLogListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetLogListRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public GetLogListRequest setSqlKey(String sqlKey) {
        this.sqlKey = sqlKey;
        return this;
    }
    public String getSqlKey() {
        return this.sqlKey;
    }

    public GetLogListRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetLogListRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetLogListRequest setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public String getIsSuccess() {
        return this.isSuccess;
    }

    public GetLogListRequest setMinAffectRows(Integer minAffectRows) {
        this.minAffectRows = minAffectRows;
        return this;
    }
    public Integer getMinAffectRows() {
        return this.minAffectRows;
    }

    public GetLogListRequest setMaxAffectRows(Integer maxAffectRows) {
        this.maxAffectRows = maxAffectRows;
        return this;
    }
    public Integer getMaxAffectRows() {
        return this.maxAffectRows;
    }

    public GetLogListRequest setMinExecCostUS(Integer minExecCostUS) {
        this.minExecCostUS = minExecCostUS;
        return this;
    }
    public Integer getMinExecCostUS() {
        return this.minExecCostUS;
    }

    public GetLogListRequest setMaxExecCostUS(Integer maxExecCostUS) {
        this.maxExecCostUS = maxExecCostUS;
        return this;
    }
    public Integer getMaxExecCostUS() {
        return this.maxExecCostUS;
    }

    public GetLogListRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetLogListRequest setClientIpList(java.util.List<String> clientIpList) {
        this.clientIpList = clientIpList;
        return this;
    }
    public java.util.List<String> getClientIpList() {
        return this.clientIpList;
    }

    public GetLogListRequest setDbUserList(java.util.List<String> dbUserList) {
        this.dbUserList = dbUserList;
        return this;
    }
    public java.util.List<String> getDbUserList() {
        return this.dbUserList;
    }

    public GetLogListRequest setDbHostList(java.util.List<String> dbHostList) {
        this.dbHostList = dbHostList;
        return this;
    }
    public java.util.List<String> getDbHostList() {
        return this.dbHostList;
    }

    public GetLogListRequest setRiskLevelList(java.util.List<String> riskLevelList) {
        this.riskLevelList = riskLevelList;
        return this;
    }
    public java.util.List<String> getRiskLevelList() {
        return this.riskLevelList;
    }

    public GetLogListRequest setRuleTypeList(java.util.List<String> ruleTypeList) {
        this.ruleTypeList = ruleTypeList;
        return this;
    }
    public java.util.List<String> getRuleTypeList() {
        return this.ruleTypeList;
    }

    public GetLogListRequest setSqlTypeList(java.util.List<String> sqlTypeList) {
        this.sqlTypeList = sqlTypeList;
        return this;
    }
    public java.util.List<String> getSqlTypeList() {
        return this.sqlTypeList;
    }

    public GetLogListRequest setClientProgramList(java.util.List<String> clientProgramList) {
        this.clientProgramList = clientProgramList;
        return this;
    }
    public java.util.List<String> getClientProgramList() {
        return this.clientProgramList;
    }

}
