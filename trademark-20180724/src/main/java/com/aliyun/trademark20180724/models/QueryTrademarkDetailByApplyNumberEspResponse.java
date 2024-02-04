// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTrademarkDetailByApplyNumberEspResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryTrademarkDetailByApplyNumberEspResponseBody body;

    public static QueryTrademarkDetailByApplyNumberEspResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTrademarkDetailByApplyNumberEspResponse self = new QueryTrademarkDetailByApplyNumberEspResponse();
        return TeaModel.build(map, self);
    }

    public QueryTrademarkDetailByApplyNumberEspResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTrademarkDetailByApplyNumberEspResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryTrademarkDetailByApplyNumberEspResponse setBody(QueryTrademarkDetailByApplyNumberEspResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTrademarkDetailByApplyNumberEspResponseBody getBody() {
        return this.body;
    }

}
