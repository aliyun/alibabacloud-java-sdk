// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCanTrySasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCanTrySasResponseBody body;

    public static GetCanTrySasResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCanTrySasResponse self = new GetCanTrySasResponse();
        return TeaModel.build(map, self);
    }

    public GetCanTrySasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCanTrySasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCanTrySasResponse setBody(GetCanTrySasResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCanTrySasResponseBody getBody() {
        return this.body;
    }

}
