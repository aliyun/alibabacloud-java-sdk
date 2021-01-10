// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktCurrentuserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinktCurrentuserResponseBody body;

    public static GetLinkeLinktCurrentuserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktCurrentuserResponse self = new GetLinkeLinktCurrentuserResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktCurrentuserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinktCurrentuserResponse setBody(GetLinkeLinktCurrentuserResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinktCurrentuserResponseBody getBody() {
        return this.body;
    }

}
