// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListWhitePortalMenuResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWhitePortalMenuResponseBody body;

    public static ListWhitePortalMenuResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWhitePortalMenuResponse self = new ListWhitePortalMenuResponse();
        return TeaModel.build(map, self);
    }

    public ListWhitePortalMenuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWhitePortalMenuResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWhitePortalMenuResponse setBody(ListWhitePortalMenuResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWhitePortalMenuResponseBody getBody() {
        return this.body;
    }

}
