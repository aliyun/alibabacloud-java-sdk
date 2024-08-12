// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetDeviceConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeviceConfigsResponseBody body;

    public static GetDeviceConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceConfigsResponse self = new GetDeviceConfigsResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceConfigsResponse setBody(GetDeviceConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceConfigsResponseBody getBody() {
        return this.body;
    }

}
