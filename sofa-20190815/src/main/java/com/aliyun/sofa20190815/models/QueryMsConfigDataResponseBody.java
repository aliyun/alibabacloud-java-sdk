// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsConfigDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("QueryResult")
    public java.util.List<QueryMsConfigDataResponseBodyQueryResult> queryResult;

    public static QueryMsConfigDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsConfigDataResponseBody self = new QueryMsConfigDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsConfigDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsConfigDataResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsConfigDataResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsConfigDataResponseBody setQueryResult(java.util.List<QueryMsConfigDataResponseBodyQueryResult> queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public java.util.List<QueryMsConfigDataResponseBodyQueryResult> getQueryResult() {
        return this.queryResult;
    }

    public static class QueryMsConfigDataResponseBodyQueryResult extends TeaModel {
        @NameInMap("Cell")
        public String cell;

        @NameInMap("Data")
        public String data;

        public static QueryMsConfigDataResponseBodyQueryResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMsConfigDataResponseBodyQueryResult self = new QueryMsConfigDataResponseBodyQueryResult();
            return TeaModel.build(map, self);
        }

        public QueryMsConfigDataResponseBodyQueryResult setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public QueryMsConfigDataResponseBodyQueryResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

}
