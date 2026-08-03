// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DeleteInspectionScheduleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInspectionScheduleResponseBody body;

    public static DeleteInspectionScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInspectionScheduleResponse self = new DeleteInspectionScheduleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInspectionScheduleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInspectionScheduleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInspectionScheduleResponse setBody(DeleteInspectionScheduleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInspectionScheduleResponseBody getBody() {
        return this.body;
    }

}
