// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAttachedMediaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAttachedMediaResponseBody body;

    public static DeleteAttachedMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAttachedMediaResponse self = new DeleteAttachedMediaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAttachedMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAttachedMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAttachedMediaResponse setBody(DeleteAttachedMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAttachedMediaResponseBody getBody() {
        return this.body;
    }

}
