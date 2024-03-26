// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListSnapshotsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSnapshotsResponseBody body;

    public static ListSnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotsResponse self = new ListSnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public ListSnapshotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSnapshotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSnapshotsResponse setBody(ListSnapshotsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSnapshotsResponseBody getBody() {
        return this.body;
    }

}
