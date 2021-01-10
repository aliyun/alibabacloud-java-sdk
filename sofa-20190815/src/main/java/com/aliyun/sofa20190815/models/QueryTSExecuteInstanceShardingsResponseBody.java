// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSExecuteInstanceShardingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("List")
    public java.util.List<QueryTSExecuteInstanceShardingsResponseBodyList> list;

    public static QueryTSExecuteInstanceShardingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSExecuteInstanceShardingsResponseBody self = new QueryTSExecuteInstanceShardingsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSExecuteInstanceShardingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSExecuteInstanceShardingsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSExecuteInstanceShardingsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSExecuteInstanceShardingsResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSExecuteInstanceShardingsResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryTSExecuteInstanceShardingsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSExecuteInstanceShardingsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryTSExecuteInstanceShardingsResponseBody setList(java.util.List<QueryTSExecuteInstanceShardingsResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryTSExecuteInstanceShardingsResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryTSExecuteInstanceShardingsResponseBodyList extends TeaModel {
        @NameInMap("Consume")
        public Long consume;

        @NameInMap("GmtBegin")
        public String gmtBegin;

        @NameInMap("GmtEnd")
        public String gmtEnd;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("Sharding")
        public Long sharding;

        @NameInMap("Status")
        public String status;

        public static QueryTSExecuteInstanceShardingsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryTSExecuteInstanceShardingsResponseBodyList self = new QueryTSExecuteInstanceShardingsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryTSExecuteInstanceShardingsResponseBodyList setConsume(Long consume) {
            this.consume = consume;
            return this;
        }
        public Long getConsume() {
            return this.consume;
        }

        public QueryTSExecuteInstanceShardingsResponseBodyList setGmtBegin(String gmtBegin) {
            this.gmtBegin = gmtBegin;
            return this;
        }
        public String getGmtBegin() {
            return this.gmtBegin;
        }

        public QueryTSExecuteInstanceShardingsResponseBodyList setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public QueryTSExecuteInstanceShardingsResponseBodyList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryTSExecuteInstanceShardingsResponseBodyList setSharding(Long sharding) {
            this.sharding = sharding;
            return this;
        }
        public Long getSharding() {
            return this.sharding;
        }

        public QueryTSExecuteInstanceShardingsResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
