// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ChangeVideoSizeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeVideoSizeResponseBody body;

    public static ChangeVideoSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeVideoSizeResponse self = new ChangeVideoSizeResponse();
        return TeaModel.build(map, self);
    }

    public ChangeVideoSizeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeVideoSizeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeVideoSizeResponse setBody(ChangeVideoSizeResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeVideoSizeResponseBody getBody() {
        return this.body;
    }

}
