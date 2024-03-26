// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVideoInfosResponseBody body;

    public static UpdateVideoInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoInfosResponse self = new UpdateVideoInfosResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVideoInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVideoInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVideoInfosResponse setBody(UpdateVideoInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVideoInfosResponseBody getBody() {
        return this.body;
    }

}
