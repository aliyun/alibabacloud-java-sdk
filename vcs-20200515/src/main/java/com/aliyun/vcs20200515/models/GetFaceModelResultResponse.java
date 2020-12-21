// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetFaceModelResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFaceModelResultResponseBody body;

    public static GetFaceModelResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFaceModelResultResponse self = new GetFaceModelResultResponse();
        return TeaModel.build(map, self);
    }

    public GetFaceModelResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFaceModelResultResponse setBody(GetFaceModelResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFaceModelResultResponseBody getBody() {
        return this.body;
    }

}
