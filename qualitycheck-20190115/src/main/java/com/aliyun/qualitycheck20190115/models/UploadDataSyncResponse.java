// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataSyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UploadDataSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadDataSyncResponse setBody(UploadDataSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadDataSyncResponseBody getBody() {
        return this.body;
    }

}
