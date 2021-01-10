// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectTaskrunningstatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectTaskrunningstatusResponseBody body;

    public static ListHasInspectTaskrunningstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectTaskrunningstatusResponse self = new ListHasInspectTaskrunningstatusResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectTaskrunningstatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectTaskrunningstatusResponse setBody(ListHasInspectTaskrunningstatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectTaskrunningstatusResponseBody getBody() {
        return this.body;
    }

}
