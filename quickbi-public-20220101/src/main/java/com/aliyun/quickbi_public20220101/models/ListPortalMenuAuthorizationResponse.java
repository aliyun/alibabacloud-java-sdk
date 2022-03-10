// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListPortalMenuAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListPortalMenuAuthorizationResponse setBody(ListPortalMenuAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPortalMenuAuthorizationResponseBody getBody() {
        return this.body;
    }

}
