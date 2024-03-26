// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshUploadVideoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshUploadVideoResponseBody body;

    public static RefreshUploadVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshUploadVideoResponse self = new RefreshUploadVideoResponse();
        return TeaModel.build(map, self);
    }

    public RefreshUploadVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshUploadVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshUploadVideoResponse setBody(RefreshUploadVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshUploadVideoResponseBody getBody() {
        return this.body;
    }

}
