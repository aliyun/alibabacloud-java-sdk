// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class TerminateClusterOperationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public NoneResponse body;

    public static TerminateClusterOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateClusterOperationResponse self = new TerminateClusterOperationResponse();
        return TeaModel.build(map, self);
    }

    public TerminateClusterOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateClusterOperationResponse setBody(NoneResponse body) {
        this.body = body;
        return this;
    }
    public NoneResponse getBody() {
        return this.body;
    }

}
