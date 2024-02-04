// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class GetSupportPrincipalNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSupportPrincipalNameResponseBody body;

    public static GetSupportPrincipalNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSupportPrincipalNameResponse self = new GetSupportPrincipalNameResponse();
        return TeaModel.build(map, self);
    }

    public GetSupportPrincipalNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSupportPrincipalNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSupportPrincipalNameResponse setBody(GetSupportPrincipalNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSupportPrincipalNameResponseBody getBody() {
        return this.body;
    }

}
