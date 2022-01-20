// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DeleteInstanceSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInstanceSnapshotResponseBody body;

    public static DeleteInstanceSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceSnapshotResponse self = new DeleteInstanceSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceSnapshotResponse setBody(DeleteInstanceSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceSnapshotResponseBody getBody() {
        return this.body;
    }

}
