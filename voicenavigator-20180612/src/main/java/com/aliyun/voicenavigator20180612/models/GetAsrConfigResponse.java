// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class GetAsrConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAsrConfigResponseBody body;

    public static GetAsrConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAsrConfigResponse self = new GetAsrConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAsrConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAsrConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAsrConfigResponse setBody(GetAsrConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAsrConfigResponseBody getBody() {
        return this.body;
    }

}
