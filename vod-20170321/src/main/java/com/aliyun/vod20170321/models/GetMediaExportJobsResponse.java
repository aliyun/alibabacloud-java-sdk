// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaExportJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaExportJobsResponseBody body;

    public static GetMediaExportJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaExportJobsResponse self = new GetMediaExportJobsResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaExportJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaExportJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaExportJobsResponse setBody(GetMediaExportJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaExportJobsResponseBody getBody() {
        return this.body;
    }

}
