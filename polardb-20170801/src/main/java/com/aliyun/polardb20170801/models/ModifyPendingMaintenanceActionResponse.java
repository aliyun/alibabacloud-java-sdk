// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyPendingMaintenanceActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyPendingMaintenanceActionResponse setBody(ModifyPendingMaintenanceActionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPendingMaintenanceActionResponseBody getBody() {
        return this.body;
    }

}
