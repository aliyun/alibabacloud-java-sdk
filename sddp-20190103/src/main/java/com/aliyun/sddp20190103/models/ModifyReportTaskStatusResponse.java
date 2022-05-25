// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyReportTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyReportTaskStatusResponseBody body;

    public static ModifyReportTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyReportTaskStatusResponse self = new ModifyReportTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyReportTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyReportTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyReportTaskStatusResponse setBody(ModifyReportTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyReportTaskStatusResponseBody getBody() {
        return this.body;
    }

}
