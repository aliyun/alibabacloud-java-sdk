// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetGWApiGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetGWApiGroupResponseBody body;

    public static GetGWApiGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGWApiGroupResponse self = new GetGWApiGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetGWApiGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGWApiGroupResponse setBody(GetGWApiGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGWApiGroupResponseBody getBody() {
        return this.body;
    }

}
