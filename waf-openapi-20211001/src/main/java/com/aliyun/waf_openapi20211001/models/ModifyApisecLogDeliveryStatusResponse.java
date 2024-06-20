// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecLogDeliveryStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApisecLogDeliveryStatusResponseBody body;

    public static ModifyApisecLogDeliveryStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecLogDeliveryStatusResponse self = new ModifyApisecLogDeliveryStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApisecLogDeliveryStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApisecLogDeliveryStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApisecLogDeliveryStatusResponse setBody(ModifyApisecLogDeliveryStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApisecLogDeliveryStatusResponseBody getBody() {
        return this.body;
    }

}
