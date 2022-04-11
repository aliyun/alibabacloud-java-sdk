// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetMediaRefreshJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetMediaRefreshJobsResponse setBody(GetMediaRefreshJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaRefreshJobsResponseBody getBody() {
        return this.body;
    }

}
