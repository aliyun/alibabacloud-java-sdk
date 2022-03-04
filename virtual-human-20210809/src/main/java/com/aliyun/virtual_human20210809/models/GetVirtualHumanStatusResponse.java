// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class GetVirtualHumanStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVirtualHumanStatusResponseBody body;

    public static GetVirtualHumanStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVirtualHumanStatusResponse self = new GetVirtualHumanStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetVirtualHumanStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVirtualHumanStatusResponse setBody(GetVirtualHumanStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVirtualHumanStatusResponseBody getBody() {
        return this.body;
    }

}
