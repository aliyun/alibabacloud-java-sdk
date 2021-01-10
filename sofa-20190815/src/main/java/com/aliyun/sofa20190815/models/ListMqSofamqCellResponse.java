// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqCellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMqSofamqCellResponseBody body;

    public static ListMqSofamqCellResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqCellResponse self = new ListMqSofamqCellResponse();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqCellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqSofamqCellResponse setBody(ListMqSofamqCellResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMqSofamqCellResponseBody getBody() {
        return this.body;
    }

}
