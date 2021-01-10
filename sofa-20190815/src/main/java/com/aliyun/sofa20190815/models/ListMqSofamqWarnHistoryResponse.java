// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqWarnHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMqSofamqWarnHistoryResponseBody body;

    public static ListMqSofamqWarnHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqWarnHistoryResponse self = new ListMqSofamqWarnHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqWarnHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqSofamqWarnHistoryResponse setBody(ListMqSofamqWarnHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMqSofamqWarnHistoryResponseBody getBody() {
        return this.body;
    }

}
