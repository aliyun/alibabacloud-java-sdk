// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktReqchangesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinktReqchangesResponseBody body;

    public static GetLinkeLinktReqchangesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktReqchangesResponse self = new GetLinkeLinktReqchangesResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktReqchangesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinktReqchangesResponse setBody(GetLinkeLinktReqchangesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinktReqchangesResponseBody getBody() {
        return this.body;
    }

}
