// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class ListSubtaskItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSubtaskItemsResponseBody body;

    public static ListSubtaskItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubtaskItemsResponse self = new ListSubtaskItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListSubtaskItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubtaskItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubtaskItemsResponse setBody(ListSubtaskItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubtaskItemsResponseBody getBody() {
        return this.body;
    }

}
