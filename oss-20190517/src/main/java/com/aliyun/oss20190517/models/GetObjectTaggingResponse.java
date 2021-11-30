// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetObjectTaggingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetObjectTaggingResponseBody body;

    public static GetObjectTaggingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetObjectTaggingResponse self = new GetObjectTaggingResponse();
        return TeaModel.build(map, self);
    }

    public GetObjectTaggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetObjectTaggingResponse setBody(GetObjectTaggingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetObjectTaggingResponseBody getBody() {
        return this.body;
    }

}
