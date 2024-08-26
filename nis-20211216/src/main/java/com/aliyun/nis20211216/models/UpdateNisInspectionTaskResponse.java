// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class UpdateNisInspectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNisInspectionTaskResponseBody body;

    public static UpdateNisInspectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNisInspectionTaskResponse self = new UpdateNisInspectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNisInspectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNisInspectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNisInspectionTaskResponse setBody(UpdateNisInspectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNisInspectionTaskResponseBody getBody() {
        return this.body;
    }

}
