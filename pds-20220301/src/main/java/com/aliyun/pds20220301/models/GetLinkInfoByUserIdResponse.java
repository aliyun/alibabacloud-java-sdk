// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetLinkInfoByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkInfoByUserIdResponseBody body;

    public static GetLinkInfoByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkInfoByUserIdResponse self = new GetLinkInfoByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkInfoByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkInfoByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLinkInfoByUserIdResponse setBody(GetLinkInfoByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkInfoByUserIdResponseBody getBody() {
        return this.body;
    }

}
