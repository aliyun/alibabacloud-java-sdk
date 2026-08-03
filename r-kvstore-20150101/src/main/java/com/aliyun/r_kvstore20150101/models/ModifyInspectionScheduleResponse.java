// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInspectionScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInspectionScheduleResponseBody body;

    public static ModifyInspectionScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInspectionScheduleResponse self = new ModifyInspectionScheduleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInspectionScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInspectionScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInspectionScheduleResponse setBody(ModifyInspectionScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInspectionScheduleResponseBody getBody() {
        return this.body;
    }

}
