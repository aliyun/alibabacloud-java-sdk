// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.um_test20211027.models;

import com.aliyun.tea.*;

public class UploadNotaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadNotaryResponseBody body;

    public static UploadNotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadNotaryResponse self = new UploadNotaryResponse();
        return TeaModel.build(map, self);
    }

    public UploadNotaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadNotaryResponse setBody(UploadNotaryResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadNotaryResponseBody getBody() {
        return this.body;
    }

}
