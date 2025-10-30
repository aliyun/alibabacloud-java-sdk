// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyResourceLogDeliveryStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyResourceLogDeliveryStatusResponseBody body;

    public static ModifyResourceLogDeliveryStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyResourceLogDeliveryStatusResponse self = new ModifyResourceLogDeliveryStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyResourceLogDeliveryStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyResourceLogDeliveryStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyResourceLogDeliveryStatusResponse setBody(ModifyResourceLogDeliveryStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyResourceLogDeliveryStatusResponseBody getBody() {
        return this.body;
    }

}
