// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePendingMaintenanceActionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePendingMaintenanceActionsResponseBody body;

    public static DescribePendingMaintenanceActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePendingMaintenanceActionsResponse self = new DescribePendingMaintenanceActionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePendingMaintenanceActionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePendingMaintenanceActionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePendingMaintenanceActionsResponse setBody(DescribePendingMaintenanceActionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePendingMaintenanceActionsResponseBody getBody() {
        return this.body;
    }

}
