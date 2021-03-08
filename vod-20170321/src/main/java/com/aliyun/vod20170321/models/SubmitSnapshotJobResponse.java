// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitSnapshotJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitSnapshotJobResponseBody body;

    public static SubmitSnapshotJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSnapshotJobResponse self = new SubmitSnapshotJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSnapshotJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSnapshotJobResponse setBody(SubmitSnapshotJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSnapshotJobResponseBody getBody() {
        return this.body;
    }

}
