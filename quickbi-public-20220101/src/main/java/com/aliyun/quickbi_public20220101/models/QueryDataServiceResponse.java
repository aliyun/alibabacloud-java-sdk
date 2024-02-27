// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDataServiceResponseBody body;

    public static QueryDataServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataServiceResponse self = new QueryDataServiceResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDataServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDataServiceResponse setBody(QueryDataServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDataServiceResponseBody getBody() {
        return this.body;
    }

}
