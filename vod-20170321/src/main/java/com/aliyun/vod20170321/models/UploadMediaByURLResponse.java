// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UploadMediaByURLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadMediaByURLResponseBody body;

    public static UploadMediaByURLResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadMediaByURLResponse self = new UploadMediaByURLResponse();
        return TeaModel.build(map, self);
    }

    public UploadMediaByURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadMediaByURLResponse setBody(UploadMediaByURLResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadMediaByURLResponseBody getBody() {
        return this.body;
    }

}
