// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DeleteNisInspectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNisInspectionTaskResponseBody body;

    public static DeleteNisInspectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNisInspectionTaskResponse self = new DeleteNisInspectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNisInspectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNisInspectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNisInspectionTaskResponse setBody(DeleteNisInspectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNisInspectionTaskResponseBody getBody() {
        return this.body;
    }

}
