// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetLinkInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AccountLinkInfo body;

    public static GetLinkInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkInfoResponse self = new GetLinkInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLinkInfoResponse setBody(AccountLinkInfo body) {
        this.body = body;
        return this;
    }
    public AccountLinkInfo getBody() {
        return this.body;
    }

}
