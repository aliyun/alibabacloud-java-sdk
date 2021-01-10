// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSSubsTasksResponseBody body;

    public static GetDWSSubsTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsTasksResponse self = new GetDWSSubsTasksResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSSubsTasksResponse setBody(GetDWSSubsTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSSubsTasksResponseBody getBody() {
        return this.body;
    }

}
