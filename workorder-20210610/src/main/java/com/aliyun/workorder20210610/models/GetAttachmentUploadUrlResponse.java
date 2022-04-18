// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class GetAttachmentUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAttachmentUploadUrlResponseBody body;

    public static GetAttachmentUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAttachmentUploadUrlResponse self = new GetAttachmentUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAttachmentUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAttachmentUploadUrlResponse setBody(GetAttachmentUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAttachmentUploadUrlResponseBody getBody() {
        return this.body;
    }

}
