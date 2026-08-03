// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateInspectionScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInspectionScheduleResponseBody body;

    public static CreateInspectionScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInspectionScheduleResponse self = new CreateInspectionScheduleResponse();
        return TeaModel.build(map, self);
    }

    public CreateInspectionScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInspectionScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInspectionScheduleResponse setBody(CreateInspectionScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInspectionScheduleResponseBody getBody() {
        return this.body;
    }

}
