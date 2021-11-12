// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class ListVpcInfoByInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVpcInfoByInstanceResponseBody body;

    public static ListVpcInfoByInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcInfoByInstanceResponse self = new ListVpcInfoByInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcInfoByInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcInfoByInstanceResponse setBody(ListVpcInfoByInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcInfoByInstanceResponseBody getBody() {
        return this.body;
    }

}
