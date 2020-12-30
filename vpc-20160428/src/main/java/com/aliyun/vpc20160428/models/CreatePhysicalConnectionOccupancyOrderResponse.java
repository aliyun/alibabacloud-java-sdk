// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionOccupancyOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreatePhysicalConnectionOccupancyOrderResponse setBody(CreatePhysicalConnectionOccupancyOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePhysicalConnectionOccupancyOrderResponseBody getBody() {
        return this.body;
    }

}
