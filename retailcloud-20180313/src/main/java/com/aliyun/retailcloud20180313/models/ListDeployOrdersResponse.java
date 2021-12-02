// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListDeployOrdersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeployOrdersResponseBody body;

    public static ListDeployOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeployOrdersResponse self = new ListDeployOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ListDeployOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeployOrdersResponse setBody(ListDeployOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeployOrdersResponseBody getBody() {
        return this.body;
    }

}
