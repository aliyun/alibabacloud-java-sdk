// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListMessageContactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMessageContactsResponseBody body;

    public static ListMessageContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMessageContactsResponse self = new ListMessageContactsResponse();
        return TeaModel.build(map, self);
    }

    public ListMessageContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMessageContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMessageContactsResponse setBody(ListMessageContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMessageContactsResponseBody getBody() {
        return this.body;
    }

}
