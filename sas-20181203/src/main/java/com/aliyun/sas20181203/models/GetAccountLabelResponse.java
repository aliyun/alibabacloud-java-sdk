// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAccountLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAccountLabelResponseBody body;

    public static GetAccountLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountLabelResponse self = new GetAccountLabelResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccountLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAccountLabelResponse setBody(GetAccountLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccountLabelResponseBody getBody() {
        return this.body;
    }

}
