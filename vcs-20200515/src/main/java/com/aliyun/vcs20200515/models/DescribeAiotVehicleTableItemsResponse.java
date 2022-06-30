// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotVehicleTableItemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAiotVehicleTableItemsResponseBody body;

    public static DescribeAiotVehicleTableItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotVehicleTableItemsResponse self = new DescribeAiotVehicleTableItemsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAiotVehicleTableItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAiotVehicleTableItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAiotVehicleTableItemsResponse setBody(DescribeAiotVehicleTableItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAiotVehicleTableItemsResponseBody getBody() {
        return this.body;
    }

}
