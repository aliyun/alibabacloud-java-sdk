// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-06 00:00:00</p>
     */
    @NameInMap("BeginDate")
    public String beginDate;

    /**
     * <strong>example:</strong>
     * <p>111.164.XX.XX</p>
     */
    @NameInMap("ClientIpList")
    public java.util.List<String> clientIpList;

    /**
     * <strong>example:</strong>
     * <p>navicat</p>
     */
    @NameInMap("ClientProgramList")
    public java.util.List<String> clientProgramList;

    /**
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("DbHostList")
    public java.util.List<String> dbHostList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DbId")
    public Integer dbId;

    /**
     * <strong>example:</strong>
     * <p>root</p>
     */
    @NameInMap("DbUserList")
    public java.util.List<String> dbUserList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-06 23:59:59</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbaudit-cn-78v1gc****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public String isSuccess;

    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxAffectRows")
    public Integer maxAffectRows;

    /**
     * <strong>example:</strong>
     * <p>20000</p>
     */
    @NameInMap("MaxExecCostUS")
    public Integer maxExecCostUS;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MinAffectRows")
    public Integer minAffectRows;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MinExecCostUS")
    public Integer minExecCostUS;

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

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RiskLevelList")
    public java.util.List<String> riskLevelList;

    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("RuleTypeList")
    public java.util.List<String> ruleTypeList;

    /**
     * <strong>example:</strong>
     * <p>3011610850021000000</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>1907181552270011186</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <strong>example:</strong>
     * <p>select</p>
     */
    @NameInMap("SqlKey")
    public String sqlKey;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("SqlTypeList")
    public java.util.List<String> sqlTypeList;

    /**
     * <strong>example:</strong>
     * <p>1000****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetLogListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLogListRequest self = new GetLogListRequest();
        return TeaModel.build(map, self);
    }

    public GetLogListRequest setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }
    public String getBeginDate() {
        return this.beginDate;
    }

    public GetLogListRequest setClientIpList(java.util.List<String> clientIpList) {
        this.clientIpList = clientIpList;
        return this;
    }
    public java.util.List<String> getClientIpList() {
        return this.clientIpList;
    }

    public GetLogListRequest setClientProgramList(java.util.List<String> clientProgramList) {
        this.clientProgramList = clientProgramList;
        return this;
    }
    public java.util.List<String> getClientProgramList() {
        return this.clientProgramList;
    }

    public GetLogListRequest setDbHostList(java.util.List<String> dbHostList) {
        this.dbHostList = dbHostList;
        return this;
    }
    public java.util.List<String> getDbHostList() {
        return this.dbHostList;
    }

    public GetLogListRequest setDbId(Integer dbId) {
        this.dbId = dbId;
        return this;
    }
    public Integer getDbId() {
        return this.dbId;
    }

    public GetLogListRequest setDbUserList(java.util.List<String> dbUserList) {
        this.dbUserList = dbUserList;
        return this;
    }
    public java.util.List<String> getDbUserList() {
        return this.dbUserList;
    }

    public GetLogListRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetLogListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetLogListRequest setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public String getIsSuccess() {
        return this.isSuccess;
    }

    public GetLogListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetLogListRequest setMaxAffectRows(Integer maxAffectRows) {
        this.maxAffectRows = maxAffectRows;
        return this;
    }
    public Integer getMaxAffectRows() {
        return this.maxAffectRows;
    }

    public GetLogListRequest setMaxExecCostUS(Integer maxExecCostUS) {
        this.maxExecCostUS = maxExecCostUS;
        return this;
    }
    public Integer getMaxExecCostUS() {
        return this.maxExecCostUS;
    }

    public GetLogListRequest setMinAffectRows(Integer minAffectRows) {
        this.minAffectRows = minAffectRows;
        return this;
    }
    public Integer getMinAffectRows() {
        return this.minAffectRows;
    }

    public GetLogListRequest setMinExecCostUS(Integer minExecCostUS) {
        this.minExecCostUS = minExecCostUS;
        return this;
    }
    public Integer getMinExecCostUS() {
        return this.minExecCostUS;
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

    public GetLogListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLogListRequest setRiskLevelList(java.util.List<String> riskLevelList) {
        this.riskLevelList = riskLevelList;
        return this;
    }
    public java.util.List<String> getRiskLevelList() {
        return this.riskLevelList;
    }

    public GetLogListRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public GetLogListRequest setRuleTypeList(java.util.List<String> ruleTypeList) {
        this.ruleTypeList = ruleTypeList;
        return this;
    }
    public java.util.List<String> getRuleTypeList() {
        return this.ruleTypeList;
    }

    public GetLogListRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
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

    public GetLogListRequest setSqlTypeList(java.util.List<String> sqlTypeList) {
        this.sqlTypeList = sqlTypeList;
        return this;
    }
    public java.util.List<String> getSqlTypeList() {
        return this.sqlTypeList;
    }

    public GetLogListRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
