// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateLogDeliveryConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLogDeliveryConfigResponseBody body;

    public static CreateLogDeliveryConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLogDeliveryConfigResponse self = new CreateLogDeliveryConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateLogDeliveryConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLogDeliveryConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLogDeliveryConfigResponse setBody(CreateLogDeliveryConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLogDeliveryConfigResponseBody getBody() {
        return this.body;
    }

}
