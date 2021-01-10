// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("QueryResult")
    public java.util.List<QueryMSDdcsDataResponseBodyQueryResult> queryResult;

    public static QueryMSDdcsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsDataResponseBody self = new QueryMSDdcsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMSDdcsDataResponseBody setQueryResult(java.util.List<QueryMSDdcsDataResponseBodyQueryResult> queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public java.util.List<QueryMSDdcsDataResponseBodyQueryResult> getQueryResult() {
        return this.queryResult;
    }

    public static class QueryMSDdcsDataResponseBodyQueryResult extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Data")
        public String data;

        public static QueryMSDdcsDataResponseBodyQueryResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMSDdcsDataResponseBodyQueryResult self = new QueryMSDdcsDataResponseBodyQueryResult();
            return TeaModel.build(map, self);
        }

        public QueryMSDdcsDataResponseBodyQueryResult setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public QueryMSDdcsDataResponseBodyQueryResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

}
