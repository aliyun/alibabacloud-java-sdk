// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyLogDeliveryConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLogDeliveryConfigResponseBody body;

    public static ModifyLogDeliveryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogDeliveryConfigResponse self = new ModifyLogDeliveryConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLogDeliveryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLogDeliveryConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLogDeliveryConfigResponse setBody(ModifyLogDeliveryConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLogDeliveryConfigResponseBody getBody() {
        return this.body;
    }

}
