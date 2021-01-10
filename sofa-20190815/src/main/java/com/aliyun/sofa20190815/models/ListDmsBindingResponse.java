// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDmsBindingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDmsBindingResponseBody body;

    public static ListDmsBindingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDmsBindingResponse self = new ListDmsBindingResponse();
        return TeaModel.build(map, self);
    }

    public ListDmsBindingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDmsBindingResponse setBody(ListDmsBindingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDmsBindingResponseBody getBody() {
        return this.body;
    }

}
