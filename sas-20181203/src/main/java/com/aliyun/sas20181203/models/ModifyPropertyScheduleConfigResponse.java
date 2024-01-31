// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyPropertyScheduleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPropertyScheduleConfigResponseBody body;

    public static ModifyPropertyScheduleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPropertyScheduleConfigResponse self = new ModifyPropertyScheduleConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPropertyScheduleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPropertyScheduleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPropertyScheduleConfigResponse setBody(ModifyPropertyScheduleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPropertyScheduleConfigResponseBody getBody() {
        return this.body;
    }

}
