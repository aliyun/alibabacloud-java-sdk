// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UnRegisterClusterAckResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BooleanResponse body;

    public static UnRegisterClusterAckResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnRegisterClusterAckResourceResponse self = new UnRegisterClusterAckResourceResponse();
        return TeaModel.build(map, self);
    }

    public UnRegisterClusterAckResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnRegisterClusterAckResourceResponse setBody(BooleanResponse body) {
        this.body = body;
        return this;
    }
    public BooleanResponse getBody() {
        return this.body;
    }

}
