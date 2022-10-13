// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetDeliveryTypeConfigListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeliveryTypeConfigListResponseBody body;

    public static GetDeliveryTypeConfigListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryTypeConfigListResponse self = new GetDeliveryTypeConfigListResponse();
        return TeaModel.build(map, self);
    }

    public GetDeliveryTypeConfigListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeliveryTypeConfigListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeliveryTypeConfigListResponse setBody(GetDeliveryTypeConfigListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeliveryTypeConfigListResponseBody getBody() {
        return this.body;
    }

}
