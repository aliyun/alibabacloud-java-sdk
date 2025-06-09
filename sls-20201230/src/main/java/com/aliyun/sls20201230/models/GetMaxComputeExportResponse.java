// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMaxComputeExportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MaxComputeExport body;

    public static GetMaxComputeExportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMaxComputeExportResponse self = new GetMaxComputeExportResponse();
        return TeaModel.build(map, self);
    }

    public GetMaxComputeExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMaxComputeExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMaxComputeExportResponse setBody(MaxComputeExport body) {
        this.body = body;
        return this;
    }
    public MaxComputeExport getBody() {
        return this.body;
    }

}
