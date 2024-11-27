// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetExportConfigJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExportConfigJobResponseBody body;

    public static GetExportConfigJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExportConfigJobResponse self = new GetExportConfigJobResponse();
        return TeaModel.build(map, self);
    }

    public GetExportConfigJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExportConfigJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExportConfigJobResponse setBody(GetExportConfigJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExportConfigJobResponseBody getBody() {
        return this.body;
    }

}
