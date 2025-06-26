// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetVideoSnapshotTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoSnapshotTaskStatusResponseBody body;

    public static GetVideoSnapshotTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoSnapshotTaskStatusResponse self = new GetVideoSnapshotTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoSnapshotTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoSnapshotTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoSnapshotTaskStatusResponse setBody(GetVideoSnapshotTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoSnapshotTaskStatusResponseBody getBody() {
        return this.body;
    }

}
