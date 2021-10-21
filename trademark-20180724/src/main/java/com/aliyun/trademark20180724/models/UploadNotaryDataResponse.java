// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UploadNotaryDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadNotaryDataResponseBody body;

    public static UploadNotaryDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadNotaryDataResponse self = new UploadNotaryDataResponse();
        return TeaModel.build(map, self);
    }

    public UploadNotaryDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadNotaryDataResponse setBody(UploadNotaryDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadNotaryDataResponseBody getBody() {
        return this.body;
    }

}
