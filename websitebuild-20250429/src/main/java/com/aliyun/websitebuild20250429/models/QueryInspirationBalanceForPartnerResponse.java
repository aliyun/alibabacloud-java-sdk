// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class QueryInspirationBalanceForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInspirationBalanceForPartnerResponseBody body;

    public static QueryInspirationBalanceForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInspirationBalanceForPartnerResponse self = new QueryInspirationBalanceForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public QueryInspirationBalanceForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInspirationBalanceForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInspirationBalanceForPartnerResponse setBody(QueryInspirationBalanceForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInspirationBalanceForPartnerResponseBody getBody() {
        return this.body;
    }

}
