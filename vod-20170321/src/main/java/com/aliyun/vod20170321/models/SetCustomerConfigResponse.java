// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetCustomerConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetCustomerConfigResponseBody body;

    public static SetCustomerConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCustomerConfigResponse self = new SetCustomerConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetCustomerConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCustomerConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCustomerConfigResponse setBody(SetCustomerConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCustomerConfigResponseBody getBody() {
        return this.body;
    }

}
