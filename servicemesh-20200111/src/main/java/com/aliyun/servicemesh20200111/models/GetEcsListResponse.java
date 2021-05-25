// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetEcsListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetEcsListResponseBody body;

    public static GetEcsListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEcsListResponse self = new GetEcsListResponse();
        return TeaModel.build(map, self);
    }

    public GetEcsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEcsListResponse setBody(GetEcsListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEcsListResponseBody getBody() {
        return this.body;
    }

}
