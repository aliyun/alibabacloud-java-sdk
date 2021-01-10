// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class GetDroppedIpListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDroppedIpListResponseBody body;

    public static GetDroppedIpListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDroppedIpListResponse self = new GetDroppedIpListResponse();
        return TeaModel.build(map, self);
    }

    public GetDroppedIpListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDroppedIpListResponse setBody(GetDroppedIpListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDroppedIpListResponseBody getBody() {
        return this.body;
    }

}
