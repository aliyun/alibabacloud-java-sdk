// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListMediaExportJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMediaExportJobsResponseBody body;

    public static ListMediaExportJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaExportJobsResponse self = new ListMediaExportJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaExportJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaExportJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMediaExportJobsResponse setBody(ListMediaExportJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaExportJobsResponseBody getBody() {
        return this.body;
    }

}
