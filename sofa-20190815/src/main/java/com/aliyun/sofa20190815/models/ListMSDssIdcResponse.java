// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMSDssIdcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMSDssIdcResponseBody body;

    public static ListMSDssIdcResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMSDssIdcResponse self = new ListMSDssIdcResponse();
        return TeaModel.build(map, self);
    }

    public ListMSDssIdcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMSDssIdcResponse setBody(ListMSDssIdcResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMSDssIdcResponseBody getBody() {
        return this.body;
    }

}
