// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllIspResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAllIspResponseBody body;

    public static GetAllIspResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllIspResponse self = new GetAllIspResponse();
        return TeaModel.build(map, self);
    }

    public GetAllIspResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllIspResponse setBody(GetAllIspResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllIspResponseBody getBody() {
        return this.body;
    }

}
