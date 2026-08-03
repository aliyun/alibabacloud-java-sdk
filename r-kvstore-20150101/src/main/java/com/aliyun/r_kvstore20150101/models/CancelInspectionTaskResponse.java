// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CancelInspectionTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelInspectionTaskResponseBody body;

    public static CancelInspectionTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelInspectionTaskResponse self = new CancelInspectionTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelInspectionTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelInspectionTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelInspectionTaskResponse setBody(CancelInspectionTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelInspectionTaskResponseBody getBody() {
        return this.body;
    }

}
