// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqTraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMqSofamqTraceResponseBody body;

    public static ListMqSofamqTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqTraceResponse self = new ListMqSofamqTraceResponse();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqSofamqTraceResponse setBody(ListMqSofamqTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMqSofamqTraceResponseBody getBody() {
        return this.body;
    }

}
