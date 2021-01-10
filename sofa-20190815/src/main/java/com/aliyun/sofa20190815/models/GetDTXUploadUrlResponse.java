// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDTXUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDTXUploadUrlResponseBody body;

    public static GetDTXUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDTXUploadUrlResponse self = new GetDTXUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetDTXUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDTXUploadUrlResponse setBody(GetDTXUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDTXUploadUrlResponseBody getBody() {
        return this.body;
    }

}
