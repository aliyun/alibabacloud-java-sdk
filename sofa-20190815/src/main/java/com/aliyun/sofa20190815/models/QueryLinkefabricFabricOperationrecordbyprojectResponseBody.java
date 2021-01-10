// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricOperationrecordbyprojectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryLinkefabricFabricOperationrecordbyprojectResponseBodyData data;

    public static QueryLinkefabricFabricOperationrecordbyprojectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricOperationrecordbyprojectResponseBody self = new QueryLinkefabricFabricOperationrecordbyprojectResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricOperationrecordbyprojectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricOperationrecordbyprojectResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricOperationrecordbyprojectResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricOperationrecordbyprojectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricOperationrecordbyprojectResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricOperationrecordbyprojectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricOperationrecordbyprojectResponseBody setData(QueryLinkefabricFabricOperationrecordbyprojectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkefabricFabricOperationrecordbyprojectResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricOperationrecordbyprojectResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Start")
        public Long start;

        @NameInMap("Total")
        public Long total;

        @NameInMap("OperationRecordDoList")
        public java.util.List<String> operationRecordDoList;

        public static QueryLinkefabricFabricOperationrecordbyprojectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricOperationrecordbyprojectResponseBodyData self = new QueryLinkefabricFabricOperationrecordbyprojectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricOperationrecordbyprojectResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public QueryLinkefabricFabricOperationrecordbyprojectResponseBodyData setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public QueryLinkefabricFabricOperationrecordbyprojectResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryLinkefabricFabricOperationrecordbyprojectResponseBodyData setOperationRecordDoList(java.util.List<String> operationRecordDoList) {
            this.operationRecordDoList = operationRecordDoList;
            return this;
        }
        public java.util.List<String> getOperationRecordDoList() {
            return this.operationRecordDoList;
        }

    }

}
