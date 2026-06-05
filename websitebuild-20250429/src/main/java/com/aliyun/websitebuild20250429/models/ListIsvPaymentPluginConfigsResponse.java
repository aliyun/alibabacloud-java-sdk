// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListIsvPaymentPluginConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIsvPaymentPluginConfigsResponseBody body;

    public static ListIsvPaymentPluginConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIsvPaymentPluginConfigsResponse self = new ListIsvPaymentPluginConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListIsvPaymentPluginConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIsvPaymentPluginConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIsvPaymentPluginConfigsResponse setBody(ListIsvPaymentPluginConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIsvPaymentPluginConfigsResponseBody getBody() {
        return this.body;
    }

}
