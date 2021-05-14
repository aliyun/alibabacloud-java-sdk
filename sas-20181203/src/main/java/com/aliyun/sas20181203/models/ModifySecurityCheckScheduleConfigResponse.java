// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySecurityCheckScheduleConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySecurityCheckScheduleConfigResponseBody body;

    public static ModifySecurityCheckScheduleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityCheckScheduleConfigResponse self = new ModifySecurityCheckScheduleConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifySecurityCheckScheduleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySecurityCheckScheduleConfigResponse setBody(ModifySecurityCheckScheduleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityCheckScheduleConfigResponseBody getBody() {
        return this.body;
    }

}
