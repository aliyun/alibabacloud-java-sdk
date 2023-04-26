// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RestoreMediaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RestoreMediaResponseBody body;

    public static RestoreMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreMediaResponse self = new RestoreMediaResponse();
        return TeaModel.build(map, self);
    }

    public RestoreMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestoreMediaResponse setBody(RestoreMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreMediaResponseBody getBody() {
        return this.body;
    }

}
