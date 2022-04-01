// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class SkipClusterOperationTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public NoneResponse body;

    public static SkipClusterOperationTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipClusterOperationTaskResponse self = new SkipClusterOperationTaskResponse();
        return TeaModel.build(map, self);
    }

    public SkipClusterOperationTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipClusterOperationTaskResponse setBody(NoneResponse body) {
        this.body = body;
        return this;
    }
    public NoneResponse getBody() {
        return this.body;
    }

}
