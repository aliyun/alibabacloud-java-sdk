// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListPortalMenusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPortalMenusResponseBody body;

    public static ListPortalMenusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPortalMenusResponse self = new ListPortalMenusResponse();
        return TeaModel.build(map, self);
    }

    public ListPortalMenusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPortalMenusResponse setBody(ListPortalMenusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPortalMenusResponseBody getBody() {
        return this.body;
    }

}
