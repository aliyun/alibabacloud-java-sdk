// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class RestoreOssImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestoreOssImageResponseBody body;

    public static RestoreOssImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreOssImageResponse self = new RestoreOssImageResponse();
        return TeaModel.build(map, self);
    }

    public RestoreOssImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreOssImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreOssImageResponse setBody(RestoreOssImageResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreOssImageResponseBody getBody() {
        return this.body;
    }

}
