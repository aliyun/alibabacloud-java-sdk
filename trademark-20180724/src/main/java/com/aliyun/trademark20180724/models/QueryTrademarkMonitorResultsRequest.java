// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkMonitorResultsRequest extends TeaModel {
    @NameInMap("RuleId")
    public Long ruleId;

    @NameInMap("ActionType")
    public Integer actionType;

    @NameInMap("ProcedureStatus")
    public Integer procedureStatus;

    @NameInMap("TmName")
    public String tmName;

    @NameInMap("ApplyYear")
    public String applyYear;

    @NameInMap("RegistrationNumber")
    public String registrationNumber;

    @NameInMap("Classification")
    public String classification;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryTrademarkMonitorResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkMonitorResultsRequest self = new QueryTrademarkMonitorResultsRequest();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkMonitorResultsRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public QueryTrademarkMonitorResultsRequest setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }
    public Integer getActionType() {
        return this.actionType;
    }

    public QueryTrademarkMonitorResultsRequest setProcedureStatus(Integer procedureStatus) {
        this.procedureStatus = procedureStatus;
        return this;
    }
    public Integer getProcedureStatus() {
        return this.procedureStatus;
    }

    public QueryTrademarkMonitorResultsRequest setTmName(String tmName) {
        this.tmName = tmName;
        return this;
    }
    public String getTmName() {
        return this.tmName;
    }

    public QueryTrademarkMonitorResultsRequest setApplyYear(String applyYear) {
        this.applyYear = applyYear;
        return this;
    }
    public String getApplyYear() {
        return this.applyYear;
    }

    public QueryTrademarkMonitorResultsRequest setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public QueryTrademarkMonitorResultsRequest setClassification(String classification) {
        this.classification = classification;
        return this;
    }
    public String getClassification() {
        return this.classification;
    }

    public QueryTrademarkMonitorResultsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryTrademarkMonitorResultsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
