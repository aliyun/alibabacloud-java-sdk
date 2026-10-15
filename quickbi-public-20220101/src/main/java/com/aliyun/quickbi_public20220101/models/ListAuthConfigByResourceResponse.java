// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListAuthConfigByResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthConfigByResourceResponseBody body;

    public static ListAuthConfigByResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthConfigByResourceResponse self = new ListAuthConfigByResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthConfigByResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthConfigByResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthConfigByResourceResponse setBody(ListAuthConfigByResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthConfigByResourceResponseBody getBody() {
        return this.body;
    }

}
