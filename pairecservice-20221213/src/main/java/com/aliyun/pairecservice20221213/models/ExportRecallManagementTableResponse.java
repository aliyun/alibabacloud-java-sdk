// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ExportRecallManagementTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportRecallManagementTableResponseBody body;

    public static ExportRecallManagementTableResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportRecallManagementTableResponse self = new ExportRecallManagementTableResponse();
        return TeaModel.build(map, self);
    }

    public ExportRecallManagementTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportRecallManagementTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportRecallManagementTableResponse setBody(ExportRecallManagementTableResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportRecallManagementTableResponseBody getBody() {
        return this.body;
    }

}
