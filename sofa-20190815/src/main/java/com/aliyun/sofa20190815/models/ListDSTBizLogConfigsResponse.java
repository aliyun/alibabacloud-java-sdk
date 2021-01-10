// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTBizLogConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDSTBizLogConfigsResponseBody body;

    public static ListDSTBizLogConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDSTBizLogConfigsResponse self = new ListDSTBizLogConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListDSTBizLogConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDSTBizLogConfigsResponse setBody(ListDSTBizLogConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDSTBizLogConfigsResponseBody getBody() {
        return this.body;
    }

}
