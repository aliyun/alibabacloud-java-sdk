// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListPortalMenuAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPortalMenuAuthorizationResponseBody body;

    public static ListPortalMenuAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPortalMenuAuthorizationResponse self = new ListPortalMenuAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ListPortalMenuAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPortalMenuAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPortalMenuAuthorizationResponse setBody(ListPortalMenuAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPortalMenuAuthorizationResponseBody getBody() {
        return this.body;
    }

}
