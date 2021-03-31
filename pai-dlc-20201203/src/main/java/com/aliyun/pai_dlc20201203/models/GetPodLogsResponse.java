// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetPodLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetPodLogsResponse setBody(GetPodLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPodLogsResponseBody getBody() {
        return this.body;
    }

}
