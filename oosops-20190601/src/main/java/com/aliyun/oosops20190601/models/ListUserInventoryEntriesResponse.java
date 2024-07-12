// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserInventoryEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUserInventoryEntriesResponseBody body;

    public static ListUserInventoryEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserInventoryEntriesResponse self = new ListUserInventoryEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserInventoryEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserInventoryEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserInventoryEntriesResponse setBody(ListUserInventoryEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserInventoryEntriesResponseBody getBody() {
        return this.body;
    }

}
