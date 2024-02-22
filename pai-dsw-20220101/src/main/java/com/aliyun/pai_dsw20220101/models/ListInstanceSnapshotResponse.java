// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListInstanceSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceSnapshotResponseBody body;

    public static ListInstanceSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceSnapshotResponse self = new ListInstanceSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceSnapshotResponse setBody(ListInstanceSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceSnapshotResponseBody getBody() {
        return this.body;
    }

}
