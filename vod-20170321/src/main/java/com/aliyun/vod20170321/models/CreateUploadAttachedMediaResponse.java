// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateUploadAttachedMediaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUploadAttachedMediaResponseBody body;

    public static CreateUploadAttachedMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadAttachedMediaResponse self = new CreateUploadAttachedMediaResponse();
        return TeaModel.build(map, self);
    }

    public CreateUploadAttachedMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUploadAttachedMediaResponse setBody(CreateUploadAttachedMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUploadAttachedMediaResponseBody getBody() {
        return this.body;
    }

}
