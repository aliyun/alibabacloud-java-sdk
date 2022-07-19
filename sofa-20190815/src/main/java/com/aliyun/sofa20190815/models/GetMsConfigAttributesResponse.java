// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsConfigAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMsConfigAttributesResponseBody body;

    public static GetMsConfigAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMsConfigAttributesResponse self = new GetMsConfigAttributesResponse();
        return TeaModel.build(map, self);
    }

    public GetMsConfigAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMsConfigAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMsConfigAttributesResponse setBody(GetMsConfigAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMsConfigAttributesResponseBody getBody() {
        return this.body;
    }

}
