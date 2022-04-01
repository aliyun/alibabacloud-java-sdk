// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListComponentInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListComponentInstancesResponseBody body;

    public static ListComponentInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListComponentInstancesResponse self = new ListComponentInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListComponentInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListComponentInstancesResponse setBody(ListComponentInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListComponentInstancesResponseBody getBody() {
        return this.body;
    }

}
