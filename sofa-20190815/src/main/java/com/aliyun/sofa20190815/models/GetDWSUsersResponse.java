// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSUsersResponseBody body;

    public static GetDWSUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSUsersResponse self = new GetDWSUsersResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSUsersResponse setBody(GetDWSUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSUsersResponseBody getBody() {
        return this.body;
    }

}
