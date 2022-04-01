// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CancelClusterOrdersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelClusterOrdersResponseBody body;

    public static CancelClusterOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelClusterOrdersResponse self = new CancelClusterOrdersResponse();
        return TeaModel.build(map, self);
    }

    public CancelClusterOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelClusterOrdersResponse setBody(CancelClusterOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelClusterOrdersResponseBody getBody() {
        return this.body;
    }

}
