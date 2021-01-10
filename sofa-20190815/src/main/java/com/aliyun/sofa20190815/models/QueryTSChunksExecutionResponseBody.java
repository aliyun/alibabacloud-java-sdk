// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSChunksExecutionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryTSChunksExecutionResponseBodyData data;

    public static QueryTSChunksExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTSChunksExecutionResponseBody self = new QueryTSChunksExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTSChunksExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTSChunksExecutionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTSChunksExecutionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryTSChunksExecutionResponseBody setData(QueryTSChunksExecutionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTSChunksExecutionResponseBodyData getData() {
        return this.data;
    }

    public static class QueryTSChunksExecutionResponseBodyDataList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Status")
        public String status;

        public static QueryTSChunksExecutionResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryTSChunksExecutionResponseBodyDataList self = new QueryTSChunksExecutionResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryTSChunksExecutionResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTSChunksExecutionResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class QueryTSChunksExecutionResponseBodyData extends TeaModel {
        @NameInMap("Consume")
        public Long consume;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("List")
        public java.util.List<QueryTSChunksExecutionResponseBodyDataList> list;

        public static QueryTSChunksExecutionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTSChunksExecutionResponseBodyData self = new QueryTSChunksExecutionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTSChunksExecutionResponseBodyData setConsume(Long consume) {
            this.consume = consume;
            return this;
        }
        public Long getConsume() {
            return this.consume;
        }

        public QueryTSChunksExecutionResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public QueryTSChunksExecutionResponseBodyData setList(java.util.List<QueryTSChunksExecutionResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryTSChunksExecutionResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
