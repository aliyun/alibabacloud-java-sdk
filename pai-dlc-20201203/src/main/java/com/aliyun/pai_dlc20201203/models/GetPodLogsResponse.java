// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetPodLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPodLogsResponseBody body;

    public static GetPodLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPodLogsResponse self = new GetPodLogsResponse();
        return TeaModel.build(map, self);
    }

    public GetPodLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPodLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPodLogsResponse setBody(GetPodLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPodLogsResponseBody getBody() {
        return this.body;
    }

}
