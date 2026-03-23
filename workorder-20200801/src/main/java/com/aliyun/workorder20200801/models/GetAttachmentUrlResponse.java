// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200801.models;

import com.aliyun.tea.*;

public class GetAttachmentUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAttachmentUrlResponseBody body;

    public static GetAttachmentUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAttachmentUrlResponse self = new GetAttachmentUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetAttachmentUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAttachmentUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAttachmentUrlResponse setBody(GetAttachmentUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAttachmentUrlResponseBody getBody() {
        return this.body;
    }

}
