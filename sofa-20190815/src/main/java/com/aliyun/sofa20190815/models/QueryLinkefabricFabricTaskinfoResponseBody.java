// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricTaskinfoResponseBody extends TeaModel {
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
    public QueryLinkefabricFabricTaskinfoResponseBodyData data;

    public static QueryLinkefabricFabricTaskinfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricTaskinfoResponseBody self = new QueryLinkefabricFabricTaskinfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricTaskinfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricTaskinfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricTaskinfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricTaskinfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricTaskinfoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricTaskinfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricTaskinfoResponseBody setData(QueryLinkefabricFabricTaskinfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkefabricFabricTaskinfoResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricTaskinfoResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Start")
        public Long start;

        @NameInMap("Total")
        public Long total;

        @NameInMap("TaskDoList")
        public java.util.List<String> taskDoList;

        public static QueryLinkefabricFabricTaskinfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricTaskinfoResponseBodyData self = new QueryLinkefabricFabricTaskinfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricTaskinfoResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public QueryLinkefabricFabricTaskinfoResponseBodyData setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public QueryLinkefabricFabricTaskinfoResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryLinkefabricFabricTaskinfoResponseBodyData setTaskDoList(java.util.List<String> taskDoList) {
            this.taskDoList = taskDoList;
            return this;
        }
        public java.util.List<String> getTaskDoList() {
            return this.taskDoList;
        }

    }

}
