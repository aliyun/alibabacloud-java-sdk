// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyPendingMaintenanceActionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPendingMaintenanceActionResponseBody body;

    public static ModifyPendingMaintenanceActionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPendingMaintenanceActionResponse self = new ModifyPendingMaintenanceActionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPendingMaintenanceActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPendingMaintenanceActionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPendingMaintenanceActionResponse setBody(ModifyPendingMaintenanceActionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPendingMaintenanceActionResponseBody getBody() {
        return this.body;
    }

}
