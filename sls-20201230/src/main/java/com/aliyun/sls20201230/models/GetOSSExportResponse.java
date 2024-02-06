// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetOSSExportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OSSExport body;

    public static GetOSSExportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOSSExportResponse self = new GetOSSExportResponse();
        return TeaModel.build(map, self);
    }

    public GetOSSExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOSSExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOSSExportResponse setBody(OSSExport body) {
        this.body = body;
        return this;
    }
    public OSSExport getBody() {
        return this.body;
    }

}
