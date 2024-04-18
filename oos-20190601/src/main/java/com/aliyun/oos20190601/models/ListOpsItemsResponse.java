// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListOpsItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOpsItemsResponseBody body;

    public static ListOpsItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOpsItemsResponse self = new ListOpsItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListOpsItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOpsItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOpsItemsResponse setBody(ListOpsItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOpsItemsResponseBody getBody() {
        return this.body;
    }

}
