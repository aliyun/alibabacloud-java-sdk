// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListStateConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStateConfigurationsResponseBody body;

    public static ListStateConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStateConfigurationsResponse self = new ListStateConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public ListStateConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStateConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStateConfigurationsResponse setBody(ListStateConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStateConfigurationsResponseBody getBody() {
        return this.body;
    }

}
