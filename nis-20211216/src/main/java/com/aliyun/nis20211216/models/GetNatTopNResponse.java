// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNatTopNResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNatTopNResponseBody body;

    public static GetNatTopNResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNatTopNResponse self = new GetNatTopNResponse();
        return TeaModel.build(map, self);
    }

    public GetNatTopNResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNatTopNResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNatTopNResponse setBody(GetNatTopNResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNatTopNResponseBody getBody() {
        return this.body;
    }

}
