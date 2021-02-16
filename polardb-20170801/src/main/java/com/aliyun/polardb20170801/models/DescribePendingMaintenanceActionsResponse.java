// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePendingMaintenanceActionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribePendingMaintenanceActionsResponse setBody(DescribePendingMaintenanceActionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePendingMaintenanceActionsResponseBody getBody() {
        return this.body;
    }

}
