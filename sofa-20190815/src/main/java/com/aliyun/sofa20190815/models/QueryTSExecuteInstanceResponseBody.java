// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSExecuteInstanceResponseBody extends TeaModel {
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
    public Long totalCount;

    @NameInMap("List")
    public java.util.List<QueryTSExecuteInstanceResponseBodyList> list;

    public static QueryTSExecuteInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSExecuteInstanceResponseBody self = new QueryTSExecuteInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSExecuteInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSExecuteInstanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSExecuteInstanceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSExecuteInstanceResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryTSExecuteInstanceResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSExecuteInstanceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryTSExecuteInstanceResponseBody setList(java.util.List<QueryTSExecuteInstanceResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryTSExecuteInstanceResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryTSExecuteInstanceResponseBodyList extends TeaModel {
        @NameInMap("Consume")
        public Long consume;

        @NameInMap("Context")
        public String context;

        @NameInMap("ExecuteId")
        public String executeId;

        @NameInMap("GmtBegin")
        public String gmtBegin;

        @NameInMap("GmtEnd")
        public String gmtEnd;

        @NameInMap("Handler")
        public String handler;

        @NameInMap("Id")
        public Long id;

        @NameInMap("JobItemId")
        public Long jobItemId;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Sharding")
        public Long sharding;

        @NameInMap("Status")
        public String status;

        @NameInMap("TargerServer")
        public String targerServer;

        @NameInMap("TriggerServer")
        public String triggerServer;

        @NameInMap("Type")
        public String type;

        public static QueryTSExecuteInstanceResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryTSExecuteInstanceResponseBodyList self = new QueryTSExecuteInstanceResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryTSExecuteInstanceResponseBodyList setConsume(Long consume) {
            this.consume = consume;
            return this;
        }
        public Long getConsume() {
            return this.consume;
        }

        public QueryTSExecuteInstanceResponseBodyList setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public QueryTSExecuteInstanceResponseBodyList setExecuteId(String executeId) {
            this.executeId = executeId;
            return this;
        }
        public String getExecuteId() {
            return this.executeId;
        }

        public QueryTSExecuteInstanceResponseBodyList setGmtBegin(String gmtBegin) {
            this.gmtBegin = gmtBegin;
            return this;
        }
        public String getGmtBegin() {
            return this.gmtBegin;
        }

        public QueryTSExecuteInstanceResponseBodyList setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public QueryTSExecuteInstanceResponseBodyList setHandler(String handler) {
            this.handler = handler;
            return this;
        }
        public String getHandler() {
            return this.handler;
        }

        public QueryTSExecuteInstanceResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSExecuteInstanceResponseBodyList setJobItemId(Long jobItemId) {
            this.jobItemId = jobItemId;
            return this;
        }
        public Long getJobItemId() {
            return this.jobItemId;
        }

        public QueryTSExecuteInstanceResponseBodyList setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public QueryTSExecuteInstanceResponseBodyList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryTSExecuteInstanceResponseBodyList setSharding(Long sharding) {
            this.sharding = sharding;
            return this;
        }
        public Long getSharding() {
            return this.sharding;
        }

        public QueryTSExecuteInstanceResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSExecuteInstanceResponseBodyList setTargerServer(String targerServer) {
            this.targerServer = targerServer;
            return this;
        }
        public String getTargerServer() {
            return this.targerServer;
        }

        public QueryTSExecuteInstanceResponseBodyList setTriggerServer(String triggerServer) {
            this.triggerServer = triggerServer;
            return this;
        }
        public String getTriggerServer() {
            return this.triggerServer;
        }

        public QueryTSExecuteInstanceResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
