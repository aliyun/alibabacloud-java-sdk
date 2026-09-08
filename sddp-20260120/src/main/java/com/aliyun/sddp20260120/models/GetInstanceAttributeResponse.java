// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class GetInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceAttributeResponseBody body;

    public static GetInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceAttributeResponse self = new GetInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceAttributeResponse setBody(GetInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
