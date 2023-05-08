// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListUserCollectionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserCollectionsResponseBody body;

    public static ListUserCollectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserCollectionsResponse self = new ListUserCollectionsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserCollectionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserCollectionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserCollectionsResponse setBody(ListUserCollectionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserCollectionsResponseBody getBody() {
        return this.body;
    }

}
