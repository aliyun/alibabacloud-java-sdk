// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteFilterConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFilterConfigsResponseBody body;

    public static DeleteFilterConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilterConfigsResponse self = new DeleteFilterConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFilterConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFilterConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFilterConfigsResponse setBody(DeleteFilterConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFilterConfigsResponseBody getBody() {
        return this.body;
    }

}
