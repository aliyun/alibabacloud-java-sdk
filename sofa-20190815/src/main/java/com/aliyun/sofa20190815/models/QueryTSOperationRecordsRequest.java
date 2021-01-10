// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSOperationRecordsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("OperationResult")
    public String operationResult;

    @NameInMap("OperationTarget")
    public String operationTarget;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("StartTime")
    public String startTime;

    public static QueryTSOperationRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSOperationRecordsRequest self = new QueryTSOperationRecordsRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSOperationRecordsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryTSOperationRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryTSOperationRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSOperationRecordsRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public QueryTSOperationRecordsRequest setOperationResult(String operationResult) {
        this.operationResult = operationResult;
        return this;
    }
    public String getOperationResult() {
        return this.operationResult;
    }

    public QueryTSOperationRecordsRequest setOperationTarget(String operationTarget) {
        this.operationTarget = operationTarget;
        return this;
    }
    public String getOperationTarget() {
        return this.operationTarget;
    }

    public QueryTSOperationRecordsRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public QueryTSOperationRecordsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSOperationRecordsRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public QueryTSOperationRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
