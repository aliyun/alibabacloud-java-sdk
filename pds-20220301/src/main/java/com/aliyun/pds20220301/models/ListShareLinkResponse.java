// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListShareLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListShareLinkResponseBody body;

    public static ListShareLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        ListShareLinkResponse self = new ListShareLinkResponse();
        return TeaModel.build(map, self);
    }

    public ListShareLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListShareLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListShareLinkResponse setBody(ListShareLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public ListShareLinkResponseBody getBody() {
        return this.body;
    }

}
