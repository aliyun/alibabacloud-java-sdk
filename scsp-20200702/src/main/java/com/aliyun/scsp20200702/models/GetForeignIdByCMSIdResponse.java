// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetForeignIdByCMSIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetForeignIdByCMSIdResponseBody body;

    public static GetForeignIdByCMSIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetForeignIdByCMSIdResponse self = new GetForeignIdByCMSIdResponse();
        return TeaModel.build(map, self);
    }

    public GetForeignIdByCMSIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetForeignIdByCMSIdResponse setBody(GetForeignIdByCMSIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetForeignIdByCMSIdResponseBody getBody() {
        return this.body;
    }

}
