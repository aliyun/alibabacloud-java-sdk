// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class GetVirtualHumanStatusesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVirtualHumanStatusesResponseBody body;

    public static GetVirtualHumanStatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVirtualHumanStatusesResponse self = new GetVirtualHumanStatusesResponse();
        return TeaModel.build(map, self);
    }

    public GetVirtualHumanStatusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVirtualHumanStatusesResponse setBody(GetVirtualHumanStatusesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVirtualHumanStatusesResponseBody getBody() {
        return this.body;
    }

}
