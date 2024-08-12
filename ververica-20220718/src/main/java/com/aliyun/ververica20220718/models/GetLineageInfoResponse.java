// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetLineageInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLineageInfoResponseBody body;

    public static GetLineageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLineageInfoResponse self = new GetLineageInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLineageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLineageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLineageInfoResponse setBody(GetLineageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLineageInfoResponseBody getBody() {
        return this.body;
    }

}
