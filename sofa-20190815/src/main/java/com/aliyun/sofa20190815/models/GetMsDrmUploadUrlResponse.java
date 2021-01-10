// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsDrmUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMsDrmUploadUrlResponseBody body;

    public static GetMsDrmUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMsDrmUploadUrlResponse self = new GetMsDrmUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetMsDrmUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMsDrmUploadUrlResponse setBody(GetMsDrmUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMsDrmUploadUrlResponseBody getBody() {
        return this.body;
    }

}
