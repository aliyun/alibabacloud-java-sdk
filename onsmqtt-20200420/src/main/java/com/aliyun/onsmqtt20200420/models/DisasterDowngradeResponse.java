// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DisasterDowngradeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisasterDowngradeResponseBody body;

    public static DisasterDowngradeResponse build(java.util.Map<String, ?> map) throws Exception {
        DisasterDowngradeResponse self = new DisasterDowngradeResponse();
        return TeaModel.build(map, self);
    }

    public DisasterDowngradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisasterDowngradeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisasterDowngradeResponse setBody(DisasterDowngradeResponseBody body) {
        this.body = body;
        return this;
    }
    public DisasterDowngradeResponseBody getBody() {
        return this.body;
    }

}
