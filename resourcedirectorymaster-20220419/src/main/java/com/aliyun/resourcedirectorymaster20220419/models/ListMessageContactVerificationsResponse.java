// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListMessageContactVerificationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMessageContactVerificationsResponseBody body;

    public static ListMessageContactVerificationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMessageContactVerificationsResponse self = new ListMessageContactVerificationsResponse();
        return TeaModel.build(map, self);
    }

    public ListMessageContactVerificationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMessageContactVerificationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMessageContactVerificationsResponse setBody(ListMessageContactVerificationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMessageContactVerificationsResponseBody getBody() {
        return this.body;
    }

}
