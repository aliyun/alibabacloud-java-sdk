// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterOperationTaskLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClusterOperationTaskLogResponseBody body;

    public static GetClusterOperationTaskLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterOperationTaskLogResponse self = new GetClusterOperationTaskLogResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterOperationTaskLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterOperationTaskLogResponse setBody(GetClusterOperationTaskLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterOperationTaskLogResponseBody getBody() {
        return this.body;
    }

}
