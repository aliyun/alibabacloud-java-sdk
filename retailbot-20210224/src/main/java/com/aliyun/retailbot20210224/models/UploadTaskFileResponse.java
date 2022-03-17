// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UploadTaskFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadTaskFileResponseBody body;

    public static UploadTaskFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadTaskFileResponse self = new UploadTaskFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadTaskFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadTaskFileResponse setBody(UploadTaskFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadTaskFileResponseBody getBody() {
        return this.body;
    }

}
