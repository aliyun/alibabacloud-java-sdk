// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListABTestGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListABTestGroupsResponseBody body;

    public static ListABTestGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListABTestGroupsResponse self = new ListABTestGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListABTestGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListABTestGroupsResponse setBody(ListABTestGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListABTestGroupsResponseBody getBody() {
        return this.body;
    }

}
