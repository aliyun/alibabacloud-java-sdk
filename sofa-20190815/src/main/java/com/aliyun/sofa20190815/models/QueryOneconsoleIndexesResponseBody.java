// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryOneconsoleIndexesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryOneconsoleIndexesResponseBodyData> data;

    public static QueryOneconsoleIndexesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOneconsoleIndexesResponseBody self = new QueryOneconsoleIndexesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOneconsoleIndexesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOneconsoleIndexesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOneconsoleIndexesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryOneconsoleIndexesResponseBody setData(java.util.List<QueryOneconsoleIndexesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryOneconsoleIndexesResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryOneconsoleIndexesResponseBodyData extends TeaModel {
        @NameInMap("Match")
        public Long match;

        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public String path;

        @NameInMap("Hits")
        public java.util.List<String> hits;

        public static QueryOneconsoleIndexesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOneconsoleIndexesResponseBodyData self = new QueryOneconsoleIndexesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOneconsoleIndexesResponseBodyData setMatch(Long match) {
            this.match = match;
            return this;
        }
        public Long getMatch() {
            return this.match;
        }

        public QueryOneconsoleIndexesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOneconsoleIndexesResponseBodyData setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryOneconsoleIndexesResponseBodyData setHits(java.util.List<String> hits) {
            this.hits = hits;
            return this;
        }
        public java.util.List<String> getHits() {
            return this.hits;
        }

    }

}
