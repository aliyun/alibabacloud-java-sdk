// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListClassificationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClassificationsResponseBody body;

    public static ListClassificationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClassificationsResponse self = new ListClassificationsResponse();
        return TeaModel.build(map, self);
    }

    public ListClassificationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClassificationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClassificationsResponse setBody(ListClassificationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClassificationsResponseBody getBody() {
        return this.body;
    }

}
