// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class ListVpcInfoByVpcResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVpcInfoByVpcResponseBody body;

    public static ListVpcInfoByVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVpcInfoByVpcResponse self = new ListVpcInfoByVpcResponse();
        return TeaModel.build(map, self);
    }

    public ListVpcInfoByVpcResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVpcInfoByVpcResponse setBody(ListVpcInfoByVpcResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVpcInfoByVpcResponseBody getBody() {
        return this.body;
    }

}
