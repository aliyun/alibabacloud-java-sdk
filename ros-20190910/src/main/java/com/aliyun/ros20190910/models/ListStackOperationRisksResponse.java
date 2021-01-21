// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackOperationRisksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListStackOperationRisksResponseBody body;

    public static ListStackOperationRisksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackOperationRisksResponse self = new ListStackOperationRisksResponse();
        return TeaModel.build(map, self);
    }

    public ListStackOperationRisksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStackOperationRisksResponse setBody(ListStackOperationRisksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStackOperationRisksResponseBody getBody() {
        return this.body;
    }

}
