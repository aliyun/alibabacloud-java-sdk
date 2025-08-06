// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CancelMediaExportJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelMediaExportJobsResponseBody body;

    public static CancelMediaExportJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelMediaExportJobsResponse self = new CancelMediaExportJobsResponse();
        return TeaModel.build(map, self);
    }

    public CancelMediaExportJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelMediaExportJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelMediaExportJobsResponse setBody(CancelMediaExportJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelMediaExportJobsResponseBody getBody() {
        return this.body;
    }

}
