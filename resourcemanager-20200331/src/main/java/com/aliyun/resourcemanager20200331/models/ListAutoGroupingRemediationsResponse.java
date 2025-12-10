// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAutoGroupingRemediationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAutoGroupingRemediationsResponseBody body;

    public static ListAutoGroupingRemediationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutoGroupingRemediationsResponse self = new ListAutoGroupingRemediationsResponse();
        return TeaModel.build(map, self);
    }

    public ListAutoGroupingRemediationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutoGroupingRemediationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAutoGroupingRemediationsResponse setBody(ListAutoGroupingRemediationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutoGroupingRemediationsResponseBody getBody() {
        return this.body;
    }

}
