// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCheckProcessResponseBody body;

    public static GetCheckProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckProcessResponse self = new GetCheckProcessResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCheckProcessResponse setBody(GetCheckProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCheckProcessResponseBody getBody() {
        return this.body;
    }

}
