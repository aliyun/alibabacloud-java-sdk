// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaRefreshJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaRefreshJobsResponseBody body;

    public static GetMediaRefreshJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaRefreshJobsResponse self = new GetMediaRefreshJobsResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaRefreshJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaRefreshJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaRefreshJobsResponse setBody(GetMediaRefreshJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaRefreshJobsResponseBody getBody() {
        return this.body;
    }

}
