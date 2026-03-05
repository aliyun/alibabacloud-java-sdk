// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryInspirationAccountDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInspirationAccountDetailsResponseBody body;

    public static QueryInspirationAccountDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInspirationAccountDetailsResponse self = new QueryInspirationAccountDetailsResponse();
        return TeaModel.build(map, self);
    }

    public QueryInspirationAccountDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInspirationAccountDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInspirationAccountDetailsResponse setBody(QueryInspirationAccountDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInspirationAccountDetailsResponseBody getBody() {
        return this.body;
    }

}
