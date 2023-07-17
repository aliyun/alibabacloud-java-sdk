// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class FindRiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FindRiskResponseBody body;

    public static FindRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        FindRiskResponse self = new FindRiskResponse();
        return TeaModel.build(map, self);
    }

    public FindRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindRiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindRiskResponse setBody(FindRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public FindRiskResponseBody getBody() {
        return this.body;
    }

}
