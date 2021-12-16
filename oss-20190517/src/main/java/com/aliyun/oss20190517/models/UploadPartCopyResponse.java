// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class UploadPartCopyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadPartCopyResponseBody body;

    public static UploadPartCopyResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadPartCopyResponse self = new UploadPartCopyResponse();
        return TeaModel.build(map, self);
    }

    public UploadPartCopyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadPartCopyResponse setBody(UploadPartCopyResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadPartCopyResponseBody getBody() {
        return this.body;
    }

}
