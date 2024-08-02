// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetDownloadJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDownloadJobResponseBody body;

    public static GetDownloadJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadJobResponse self = new GetDownloadJobResponse();
        return TeaModel.build(map, self);
    }

    public GetDownloadJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDownloadJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDownloadJobResponse setBody(GetDownloadJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDownloadJobResponseBody getBody() {
        return this.body;
    }

}
