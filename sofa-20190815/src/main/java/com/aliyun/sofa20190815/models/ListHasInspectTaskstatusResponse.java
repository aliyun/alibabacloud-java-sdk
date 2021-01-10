// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectTaskstatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectTaskstatusResponseBody body;

    public static ListHasInspectTaskstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectTaskstatusResponse self = new ListHasInspectTaskstatusResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectTaskstatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectTaskstatusResponse setBody(ListHasInspectTaskstatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectTaskstatusResponseBody getBody() {
        return this.body;
    }

}
