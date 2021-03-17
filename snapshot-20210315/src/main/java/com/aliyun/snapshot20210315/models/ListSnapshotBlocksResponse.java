// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snapshot20210315.models;

import com.aliyun.tea.*;

public class ListSnapshotBlocksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSnapshotBlocksResponseBody body;

    public static ListSnapshotBlocksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSnapshotBlocksResponse self = new ListSnapshotBlocksResponse();
        return TeaModel.build(map, self);
    }

    public ListSnapshotBlocksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSnapshotBlocksResponse setBody(ListSnapshotBlocksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSnapshotBlocksResponseBody getBody() {
        return this.body;
    }

}
