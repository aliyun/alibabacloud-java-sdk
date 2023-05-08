// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class QueryConfigurationOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryConfigurationOrderResponseBody body;

    public static QueryConfigurationOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigurationOrderResponse self = new QueryConfigurationOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryConfigurationOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryConfigurationOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryConfigurationOrderResponse setBody(QueryConfigurationOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryConfigurationOrderResponseBody getBody() {
        return this.body;
    }

}
