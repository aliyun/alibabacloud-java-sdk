// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataSyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadDataSyncResponseBody body;

    public static UploadDataSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadDataSyncResponse self = new UploadDataSyncResponse();
        return TeaModel.build(map, self);
    }

    public UploadDataSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadDataSyncResponse setBody(UploadDataSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadDataSyncResponseBody getBody() {
        return this.body;
    }

}
