// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecLogDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApisecLogDeliveryResponseBody body;

    public static ModifyApisecLogDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecLogDeliveryResponse self = new ModifyApisecLogDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApisecLogDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApisecLogDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApisecLogDeliveryResponse setBody(ModifyApisecLogDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApisecLogDeliveryResponseBody getBody() {
        return this.body;
    }

}
