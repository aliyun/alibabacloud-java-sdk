// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRLLogContextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRLLogContextResponseBody body;

    public static GetRLLogContextResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRLLogContextResponse self = new GetRLLogContextResponse();
        return TeaModel.build(map, self);
    }

    public GetRLLogContextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRLLogContextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRLLogContextResponse setBody(GetRLLogContextResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRLLogContextResponseBody getBody() {
        return this.body;
    }

}
