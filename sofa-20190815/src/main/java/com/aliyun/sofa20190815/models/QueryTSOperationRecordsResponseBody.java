// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSOperationRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("List")
    public java.util.List<QueryTSOperationRecordsResponseBodyList> list;

    public static QueryTSOperationRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSOperationRecordsResponseBody self = new QueryTSOperationRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSOperationRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSOperationRecordsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSOperationRecordsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSOperationRecordsResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryTSOperationRecordsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSOperationRecordsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public QueryTSOperationRecordsResponseBody setList(java.util.List<QueryTSOperationRecordsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryTSOperationRecordsResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryTSOperationRecordsResponseBodyList extends TeaModel {
        @NameInMap("GmtOperate")
        public String gmtOperate;

        @NameInMap("Id")
        public String id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("OperateTime")
        public String operateTime;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("OperationResult")
        public Boolean operationResult;

        @NameInMap("OperationTarget")
        public String operationTarget;

        @NameInMap("OperationValue")
        public String operationValue;

        @NameInMap("Operator")
        public String operator;

        public static QueryTSOperationRecordsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryTSOperationRecordsResponseBodyList self = new QueryTSOperationRecordsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryTSOperationRecordsResponseBodyList setGmtOperate(String gmtOperate) {
            this.gmtOperate = gmtOperate;
            return this;
        }
        public String getGmtOperate() {
            return this.gmtOperate;
        }

        public QueryTSOperationRecordsResponseBodyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTSOperationRecordsResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryTSOperationRecordsResponseBodyList setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public QueryTSOperationRecordsResponseBodyList setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public QueryTSOperationRecordsResponseBodyList setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public QueryTSOperationRecordsResponseBodyList setOperationResult(Boolean operationResult) {
            this.operationResult = operationResult;
            return this;
        }
        public Boolean getOperationResult() {
            return this.operationResult;
        }

        public QueryTSOperationRecordsResponseBodyList setOperationTarget(String operationTarget) {
            this.operationTarget = operationTarget;
            return this;
        }
        public String getOperationTarget() {
            return this.operationTarget;
        }

        public QueryTSOperationRecordsResponseBodyList setOperationValue(String operationValue) {
            this.operationValue = operationValue;
            return this;
        }
        public String getOperationValue() {
            return this.operationValue;
        }

        public QueryTSOperationRecordsResponseBodyList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

}
