// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInventoryEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInventoryEntriesResponseBody body;

    public static ListInventoryEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInventoryEntriesResponse self = new ListInventoryEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ListInventoryEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInventoryEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInventoryEntriesResponse setBody(ListInventoryEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInventoryEntriesResponseBody getBody() {
        return this.body;
    }

}
