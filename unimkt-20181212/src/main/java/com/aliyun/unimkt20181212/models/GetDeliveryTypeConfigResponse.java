// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetDeliveryTypeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeliveryTypeConfigResponseBody body;

    public static GetDeliveryTypeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryTypeConfigResponse self = new GetDeliveryTypeConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDeliveryTypeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeliveryTypeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeliveryTypeConfigResponse setBody(GetDeliveryTypeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeliveryTypeConfigResponseBody getBody() {
        return this.body;
    }

}
