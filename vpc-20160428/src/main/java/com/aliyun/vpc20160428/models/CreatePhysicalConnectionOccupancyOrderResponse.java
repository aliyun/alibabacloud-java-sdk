// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionOccupancyOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePhysicalConnectionOccupancyOrderResponseBody body;

    public static CreatePhysicalConnectionOccupancyOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionOccupancyOrderResponse self = new CreatePhysicalConnectionOccupancyOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionOccupancyOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePhysicalConnectionOccupancyOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePhysicalConnectionOccupancyOrderResponse setBody(CreatePhysicalConnectionOccupancyOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePhysicalConnectionOccupancyOrderResponseBody getBody() {
        return this.body;
    }

}
