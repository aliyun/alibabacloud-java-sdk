// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSChunksResponseBody extends TeaModel {
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
    public java.util.List<QueryTSChunksResponseBodyList> list;

    public static QueryTSChunksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSChunksResponseBody self = new QueryTSChunksResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSChunksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSChunksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSChunksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSChunksResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryTSChunksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSChunksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryTSChunksResponseBody setList(java.util.List<QueryTSChunksResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<QueryTSChunksResponseBodyList> getList() {
        return this.list;
    }

    public static class QueryTSChunksResponseBodyList extends TeaModel {
        @NameInMap("AllNum")
        public Long allNum;

        @NameInMap("ChunkData")
        public String chunkData;

        @NameInMap("Consume")
        public Long consume;

        @NameInMap("Digest")
        public String digest;

        @NameInMap("ExecuteClient")
        public String executeClient;

        @NameInMap("ExecuteId")
        public String executeId;

        @NameInMap("GenerateClient")
        public String generateClient;

        @NameInMap("GmtBegin")
        public String gmtBegin;

        @NameInMap("GmtEnd")
        public String gmtEnd;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("ShardingRule")
        public String shardingRule;

        @NameInMap("Status")
        public String status;

        @NameInMap("SuccessNum")
        public Long successNum;

        @NameInMap("Type")
        public String type;

        public static QueryTSChunksResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            QueryTSChunksResponseBodyList self = new QueryTSChunksResponseBodyList();
            return TeaModel.build(map, self);
        }

        public QueryTSChunksResponseBodyList setAllNum(Long allNum) {
            this.allNum = allNum;
            return this;
        }
        public Long getAllNum() {
            return this.allNum;
        }

        public QueryTSChunksResponseBodyList setChunkData(String chunkData) {
            this.chunkData = chunkData;
            return this;
        }
        public String getChunkData() {
            return this.chunkData;
        }

        public QueryTSChunksResponseBodyList setConsume(Long consume) {
            this.consume = consume;
            return this;
        }
        public Long getConsume() {
            return this.consume;
        }

        public QueryTSChunksResponseBodyList setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public QueryTSChunksResponseBodyList setExecuteClient(String executeClient) {
            this.executeClient = executeClient;
            return this;
        }
        public String getExecuteClient() {
            return this.executeClient;
        }

        public QueryTSChunksResponseBodyList setExecuteId(String executeId) {
            this.executeId = executeId;
            return this;
        }
        public String getExecuteId() {
            return this.executeId;
        }

        public QueryTSChunksResponseBodyList setGenerateClient(String generateClient) {
            this.generateClient = generateClient;
            return this;
        }
        public String getGenerateClient() {
            return this.generateClient;
        }

        public QueryTSChunksResponseBodyList setGmtBegin(String gmtBegin) {
            this.gmtBegin = gmtBegin;
            return this;
        }
        public String getGmtBegin() {
            return this.gmtBegin;
        }

        public QueryTSChunksResponseBodyList setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public QueryTSChunksResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSChunksResponseBodyList setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public QueryTSChunksResponseBodyList setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public QueryTSChunksResponseBodyList setShardingRule(String shardingRule) {
            this.shardingRule = shardingRule;
            return this;
        }
        public String getShardingRule() {
            return this.shardingRule;
        }

        public QueryTSChunksResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSChunksResponseBodyList setSuccessNum(Long successNum) {
            this.successNum = successNum;
            return this;
        }
        public Long getSuccessNum() {
            return this.successNum;
        }

        public QueryTSChunksResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
