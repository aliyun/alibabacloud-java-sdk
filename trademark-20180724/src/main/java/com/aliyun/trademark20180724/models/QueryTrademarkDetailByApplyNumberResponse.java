// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkDetailByApplyNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTrademarkDetailByApplyNumberResponseBody body;

    public static QueryTrademarkDetailByApplyNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkDetailByApplyNumberResponse self = new QueryTrademarkDetailByApplyNumberResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkDetailByApplyNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrademarkDetailByApplyNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTrademarkDetailByApplyNumberResponse setBody(QueryTrademarkDetailByApplyNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrademarkDetailByApplyNumberResponseBody getBody() {
        return this.body;
    }

}
