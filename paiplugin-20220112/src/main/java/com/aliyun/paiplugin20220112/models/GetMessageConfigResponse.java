// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetMessageConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMessageConfigResponseBody body;

    public static GetMessageConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageConfigResponse self = new GetMessageConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessageConfigResponse setBody(GetMessageConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageConfigResponseBody getBody() {
        return this.body;
    }

}
