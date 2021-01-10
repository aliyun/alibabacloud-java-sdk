// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqNamespaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMqSofamqNamespaceResponseBody body;

    public static ListMqSofamqNamespaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqNamespaceResponse self = new ListMqSofamqNamespaceResponse();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqNamespaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqSofamqNamespaceResponse setBody(ListMqSofamqNamespaceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMqSofamqNamespaceResponseBody getBody() {
        return this.body;
    }

}
