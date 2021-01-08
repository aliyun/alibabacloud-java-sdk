// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetJoinCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetJoinCodeResponseBody body;

    public static GetJoinCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJoinCodeResponse self = new GetJoinCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetJoinCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJoinCodeResponse setBody(GetJoinCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJoinCodeResponseBody getBody() {
        return this.body;
    }

}
