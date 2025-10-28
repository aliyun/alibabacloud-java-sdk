// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class EnableServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableServicesResponseBody body;

    public static EnableServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableServicesResponse self = new EnableServicesResponse();
        return TeaModel.build(map, self);
    }

    public EnableServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableServicesResponse setBody(EnableServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableServicesResponseBody getBody() {
        return this.body;
    }

}
