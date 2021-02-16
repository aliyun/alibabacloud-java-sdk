// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePendingMaintenanceActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePendingMaintenanceActionResponseBody body;

    public static DescribePendingMaintenanceActionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePendingMaintenanceActionResponse self = new DescribePendingMaintenanceActionResponse();
        return TeaModel.build(map, self);
    }

    public DescribePendingMaintenanceActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePendingMaintenanceActionResponse setBody(DescribePendingMaintenanceActionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePendingMaintenanceActionResponseBody getBody() {
        return this.body;
    }

}
