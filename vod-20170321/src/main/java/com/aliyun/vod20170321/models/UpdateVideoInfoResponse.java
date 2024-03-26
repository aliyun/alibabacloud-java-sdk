// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVideoInfoResponseBody body;

    public static UpdateVideoInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoInfoResponse self = new UpdateVideoInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVideoInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVideoInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVideoInfoResponse setBody(UpdateVideoInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVideoInfoResponseBody getBody() {
        return this.body;
    }

}
