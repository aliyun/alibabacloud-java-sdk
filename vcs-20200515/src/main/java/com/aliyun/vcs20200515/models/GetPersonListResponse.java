// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetPersonListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPersonListResponseBody body;

    public static GetPersonListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPersonListResponse self = new GetPersonListResponse();
        return TeaModel.build(map, self);
    }

    public GetPersonListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPersonListResponse setBody(GetPersonListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPersonListResponseBody getBody() {
        return this.body;
    }

}
