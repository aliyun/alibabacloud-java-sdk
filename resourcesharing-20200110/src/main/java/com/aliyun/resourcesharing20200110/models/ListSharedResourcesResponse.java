// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class ListSharedResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSharedResourcesResponseBody body;

    public static ListSharedResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSharedResourcesResponse self = new ListSharedResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListSharedResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSharedResourcesResponse setBody(ListSharedResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSharedResourcesResponseBody getBody() {
        return this.body;
    }

}
