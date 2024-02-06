// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogStoreMeteringModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLogStoreMeteringModeResponseBody body;

    public static GetLogStoreMeteringModeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogStoreMeteringModeResponse self = new GetLogStoreMeteringModeResponse();
        return TeaModel.build(map, self);
    }

    public GetLogStoreMeteringModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogStoreMeteringModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogStoreMeteringModeResponse setBody(GetLogStoreMeteringModeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogStoreMeteringModeResponseBody getBody() {
        return this.body;
    }

}
