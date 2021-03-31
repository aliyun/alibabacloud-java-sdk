// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTaskLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskLogsResponseBody body;

    public static GetTaskLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskLogsResponse self = new GetTaskLogsResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskLogsResponse setBody(GetTaskLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskLogsResponseBody getBody() {
        return this.body;
    }

}
