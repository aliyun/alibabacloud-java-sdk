// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSChunkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryTSChunkResponseBodyData data;

    public static QueryTSChunkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSChunkResponseBody self = new QueryTSChunkResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSChunkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSChunkResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSChunkResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSChunkResponseBody setData(QueryTSChunkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTSChunkResponseBodyData getData() {
        return this.data;
    }

    public static class QueryTSChunkResponseBodyData extends TeaModel {
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

        public static QueryTSChunkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTSChunkResponseBodyData self = new QueryTSChunkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTSChunkResponseBodyData setAllNum(Long allNum) {
            this.allNum = allNum;
            return this;
        }
        public Long getAllNum() {
            return this.allNum;
        }

        public QueryTSChunkResponseBodyData setChunkData(String chunkData) {
            this.chunkData = chunkData;
            return this;
        }
        public String getChunkData() {
            return this.chunkData;
        }

        public QueryTSChunkResponseBodyData setConsume(Long consume) {
            this.consume = consume;
            return this;
        }
        public Long getConsume() {
            return this.consume;
        }

        public QueryTSChunkResponseBodyData setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public QueryTSChunkResponseBodyData setExecuteClient(String executeClient) {
            this.executeClient = executeClient;
            return this;
        }
        public String getExecuteClient() {
            return this.executeClient;
        }

        public QueryTSChunkResponseBodyData setExecuteId(String executeId) {
            this.executeId = executeId;
            return this;
        }
        public String getExecuteId() {
            return this.executeId;
        }

        public QueryTSChunkResponseBodyData setGenerateClient(String generateClient) {
            this.generateClient = generateClient;
            return this;
        }
        public String getGenerateClient() {
            return this.generateClient;
        }

        public QueryTSChunkResponseBodyData setGmtBegin(String gmtBegin) {
            this.gmtBegin = gmtBegin;
            return this;
        }
        public String getGmtBegin() {
            return this.gmtBegin;
        }

        public QueryTSChunkResponseBodyData setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public QueryTSChunkResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSChunkResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public QueryTSChunkResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public QueryTSChunkResponseBodyData setShardingRule(String shardingRule) {
            this.shardingRule = shardingRule;
            return this;
        }
        public String getShardingRule() {
            return this.shardingRule;
        }

        public QueryTSChunkResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryTSChunkResponseBodyData setSuccessNum(Long successNum) {
            this.successNum = successNum;
            return this;
        }
        public Long getSuccessNum() {
            return this.successNum;
        }

        public QueryTSChunkResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
