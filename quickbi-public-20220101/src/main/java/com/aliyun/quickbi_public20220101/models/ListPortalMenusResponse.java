// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListPortalMenusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListPortalMenusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPortalMenusResponse setBody(ListPortalMenusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPortalMenusResponseBody getBody() {
        return this.body;
    }

}
