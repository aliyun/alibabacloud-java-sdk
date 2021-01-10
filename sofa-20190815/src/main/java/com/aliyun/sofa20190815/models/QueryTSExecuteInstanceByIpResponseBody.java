// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSExecuteInstanceByIpResponseBody extends TeaModel {
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
    public java.util.List<QueryTSExecuteInstanceByIpResponseBodyList> list;

    public static QueryTSExecuteInstanceByIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSExecuteInstanceByIpResponseBody self = new QueryTSExecuteInstanceByIpResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSExecuteInstanceByIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSExecuteInstanceByIpResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSExecuteInstanceByIpResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSExecuteInstanceByIpResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryTSExecuteInstanceByIpResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSExecuteInstanceByIpResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryTSExecuteInstanceByIpResponseBody setList(java.util.List<QueryTSExecuteInstanceByIpResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryTSExecuteInstanceByIpResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryTSExecuteInstanceByIpResponseBodyList extends TeaModel {
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

        public static QueryTSExecuteInstanceByIpResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryTSExecuteInstanceByIpResponseBodyList self = new QueryTSExecuteInstanceByIpResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryTSExecuteInstanceByIpResponseBodyList setConsume(Long consume) {
            this.consume = consume;
            return this;
        }
        public Long getConsume() {
            return this.consume;
        }

        public QueryTSExecuteInstanceByIpResponseBodyList setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public QueryTSExecuteInstanceByIpResponseBodyList setExecuteId(String executeId) {
            this.executeId = executeId;
            return this;
        }
        public String getExecuteId() {
            return this.executeId;
        }

        public QueryTSExecuteInstanceByIpResponseBodyList setGmtBegin(String gmtBegin) {
            this.gmtBegin = gmtBegin;
            return this;
        }
        public String getGmtBegin() {
            return this.gmtBegin;
        }

        public QueryTSExecuteInstanceByIpResponseBodyList setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public QueryTSExecuteInstanceByIpResponseBodyList setHandler(String handler) {
            this.handler = handler;
            return this;
        }
        public String getHandler() {
            return this.handler;
        }

        public QueryTSExecuteInstanceByIpResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSExecuteInstanceByIpResponseBodyList setJobItemId(Long jobItemId) {
            this.jobItemId = jobItemId;
            return this;
        }
        public Long getJobItemId() {
            return this.jobItemId;
        }

        public QueryTSExecuteInstanceByIpResponseBodyList setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public QueryTSExecuteInstanceByIpResponseBodyList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryTSExecuteInstanceByIpResponseBodyList setSharding(Long sharding) {
            this.sharding = sharding;
            return this;
        }
        public Long getSharding() {
            return this.sharding;
        }

        public QueryTSExecuteInstanceByIpResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSExecuteInstanceByIpResponseBodyList setTargerServer(String targerServer) {
            this.targerServer = targerServer;
            return this;
        }
        public String getTargerServer() {
            return this.targerServer;
        }

        public QueryTSExecuteInstanceByIpResponseBodyList setTriggerServer(String triggerServer) {
            this.triggerServer = triggerServer;
            return this;
        }
        public String getTriggerServer() {
            return this.triggerServer;
        }

        public QueryTSExecuteInstanceByIpResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
