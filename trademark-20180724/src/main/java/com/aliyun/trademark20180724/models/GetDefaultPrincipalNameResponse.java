// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GetDefaultPrincipalNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDefaultPrincipalNameResponseBody body;

    public static GetDefaultPrincipalNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultPrincipalNameResponse self = new GetDefaultPrincipalNameResponse();
        return TeaModel.build(map, self);
    }

    public GetDefaultPrincipalNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDefaultPrincipalNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDefaultPrincipalNameResponse setBody(GetDefaultPrincipalNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDefaultPrincipalNameResponseBody getBody() {
        return this.body;
    }

}
