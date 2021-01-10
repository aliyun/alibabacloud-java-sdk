// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSFaviconicoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSFaviconicoResponseBody body;

    public static GetDWSFaviconicoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSFaviconicoResponse self = new GetDWSFaviconicoResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSFaviconicoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSFaviconicoResponse setBody(GetDWSFaviconicoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSFaviconicoResponseBody getBody() {
        return this.body;
    }

}
