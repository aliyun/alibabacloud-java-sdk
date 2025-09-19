// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAlertItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlertItemsResponseBody body;

    public static ListAlertItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlertItemsResponse self = new ListAlertItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListAlertItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlertItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlertItemsResponse setBody(ListAlertItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlertItemsResponseBody getBody() {
        return this.body;
    }

}
