// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserConfigResponseBody body;

    public static GetUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserConfigResponse self = new GetUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserConfigResponse setBody(GetUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserConfigResponseBody getBody() {
        return this.body;
    }

}
