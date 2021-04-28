// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstanceSnapshotsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstanceSnapshotsResponseBody body;

    public static ListInstanceSnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceSnapshotsResponse self = new ListInstanceSnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceSnapshotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceSnapshotsResponse setBody(ListInstanceSnapshotsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceSnapshotsResponseBody getBody() {
        return this.body;
    }

}
