// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskSubscribeUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClriskSubscribeUserInfoResponseBody body;

    public static GetClriskSubscribeUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClriskSubscribeUserInfoResponse self = new GetClriskSubscribeUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetClriskSubscribeUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClriskSubscribeUserInfoResponse setBody(GetClriskSubscribeUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClriskSubscribeUserInfoResponseBody getBody() {
        return this.body;
    }

}
