// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePendingMaintenanceActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribePendingMaintenanceActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePendingMaintenanceActionResponse setBody(DescribePendingMaintenanceActionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePendingMaintenanceActionResponseBody getBody() {
        return this.body;
    }

}
