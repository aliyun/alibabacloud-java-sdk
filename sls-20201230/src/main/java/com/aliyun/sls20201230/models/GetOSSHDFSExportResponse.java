// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetOSSHDFSExportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OSSExport body;

    public static GetOSSHDFSExportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOSSHDFSExportResponse self = new GetOSSHDFSExportResponse();
        return TeaModel.build(map, self);
    }

    public GetOSSHDFSExportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOSSHDFSExportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOSSHDFSExportResponse setBody(OSSExport body) {
        this.body = body;
        return this;
    }
    public OSSExport getBody() {
        return this.body;
    }

}
