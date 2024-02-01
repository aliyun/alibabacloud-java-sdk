// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPrefixListsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPrefixListsResponseBody body;

    public static ListPrefixListsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrefixListsResponse self = new ListPrefixListsResponse();
        return TeaModel.build(map, self);
    }

    public ListPrefixListsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrefixListsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrefixListsResponse setBody(ListPrefixListsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrefixListsResponseBody getBody() {
        return this.body;
    }

}
