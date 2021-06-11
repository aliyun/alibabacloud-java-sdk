// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeAiotVehicleTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAiotVehicleTablesResponseBody body;

    public static DescribeAiotVehicleTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAiotVehicleTablesResponse self = new DescribeAiotVehicleTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAiotVehicleTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAiotVehicleTablesResponse setBody(DescribeAiotVehicleTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAiotVehicleTablesResponseBody getBody() {
        return this.body;
    }

}
