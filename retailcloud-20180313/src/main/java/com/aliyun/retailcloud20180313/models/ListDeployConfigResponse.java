// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListDeployConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeployConfigResponseBody body;

    public static ListDeployConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeployConfigResponse self = new ListDeployConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListDeployConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeployConfigResponse setBody(ListDeployConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeployConfigResponseBody getBody() {
        return this.body;
    }

}
