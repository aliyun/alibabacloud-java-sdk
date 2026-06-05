// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListSpecificationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSpecificationsResponseBody body;

    public static ListSpecificationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSpecificationsResponse self = new ListSpecificationsResponse();
        return TeaModel.build(map, self);
    }

    public ListSpecificationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSpecificationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSpecificationsResponse setBody(ListSpecificationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSpecificationsResponseBody getBody() {
        return this.body;
    }

}
