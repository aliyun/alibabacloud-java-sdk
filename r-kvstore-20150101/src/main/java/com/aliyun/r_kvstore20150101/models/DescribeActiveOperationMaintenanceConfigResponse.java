// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationMaintenanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeActiveOperationMaintenanceConfigResponseBody body;

    public static DescribeActiveOperationMaintenanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationMaintenanceConfigResponse self = new DescribeActiveOperationMaintenanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationMaintenanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActiveOperationMaintenanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeActiveOperationMaintenanceConfigResponse setBody(DescribeActiveOperationMaintenanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActiveOperationMaintenanceConfigResponseBody getBody() {
        return this.body;
    }

}
