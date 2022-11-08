// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class ExportDataReflowDataListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExportDataReflowDataListResponseBody body;

    public static ExportDataReflowDataListResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportDataReflowDataListResponse self = new ExportDataReflowDataListResponse();
        return TeaModel.build(map, self);
    }

    public ExportDataReflowDataListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportDataReflowDataListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportDataReflowDataListResponse setBody(ExportDataReflowDataListResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportDataReflowDataListResponseBody getBody() {
        return this.body;
    }

}
