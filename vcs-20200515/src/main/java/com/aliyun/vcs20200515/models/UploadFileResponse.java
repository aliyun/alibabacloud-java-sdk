// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UploadFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadFileResponseBody body;

    public static UploadFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadFileResponse self = new UploadFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadFileResponse setBody(UploadFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadFileResponseBody getBody() {
        return this.body;
    }

}
