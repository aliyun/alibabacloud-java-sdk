// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqDatacenterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMqSofamqDatacenterResponseBody body;

    public static ListMqSofamqDatacenterResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqDatacenterResponse self = new ListMqSofamqDatacenterResponse();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqDatacenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqSofamqDatacenterResponse setBody(ListMqSofamqDatacenterResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMqSofamqDatacenterResponseBody getBody() {
        return this.body;
    }

}
