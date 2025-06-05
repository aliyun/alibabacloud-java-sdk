// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetSchemeTaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSchemeTaskConfigResponseBody body;

    public static GetSchemeTaskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSchemeTaskConfigResponse self = new GetSchemeTaskConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetSchemeTaskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSchemeTaskConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSchemeTaskConfigResponse setBody(GetSchemeTaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSchemeTaskConfigResponseBody getBody() {
        return this.body;
    }

}
