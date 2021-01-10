// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskProductScenesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskProductScenesResponseBody body;

    public static ListClriskProductScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskProductScenesResponse self = new ListClriskProductScenesResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskProductScenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskProductScenesResponse setBody(ListClriskProductScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskProductScenesResponseBody getBody() {
        return this.body;
    }

}
