// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMqSofamqNodeResponseBody body;

    public static ListMqSofamqNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqNodeResponse self = new ListMqSofamqNodeResponse();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqSofamqNodeResponse setBody(ListMqSofamqNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMqSofamqNodeResponseBody getBody() {
        return this.body;
    }

}
