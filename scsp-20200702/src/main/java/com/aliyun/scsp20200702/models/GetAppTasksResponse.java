// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetAppTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAppTasksResponseBody body;

    public static GetAppTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppTasksResponse self = new GetAppTasksResponse();
        return TeaModel.build(map, self);
    }

    public GetAppTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppTasksResponse setBody(GetAppTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppTasksResponseBody getBody() {
        return this.body;
    }

}
