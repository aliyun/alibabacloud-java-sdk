// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadDataResponseBody body;

    public static UploadDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadDataResponse self = new UploadDataResponse();
        return TeaModel.build(map, self);
    }

    public UploadDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadDataResponse setBody(UploadDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadDataResponseBody getBody() {
        return this.body;
    }

}
