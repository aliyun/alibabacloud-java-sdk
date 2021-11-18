// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstancesStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstancesStatusResponseBody body;

    public static ListInstancesStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesStatusResponse self = new ListInstancesStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancesStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancesStatusResponse setBody(ListInstancesStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancesStatusResponseBody getBody() {
        return this.body;
    }

}
