// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySecurityCheckScheduleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifySecurityCheckScheduleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySecurityCheckScheduleConfigResponse setBody(ModifySecurityCheckScheduleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySecurityCheckScheduleConfigResponseBody getBody() {
        return this.body;
    }

}
