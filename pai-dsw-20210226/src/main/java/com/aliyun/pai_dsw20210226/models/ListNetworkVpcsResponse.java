// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListNetworkVpcsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNetworkVpcsResponseBody body;

    public static ListNetworkVpcsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkVpcsResponse self = new ListNetworkVpcsResponse();
        return TeaModel.build(map, self);
    }

    public ListNetworkVpcsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNetworkVpcsResponse setBody(ListNetworkVpcsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNetworkVpcsResponseBody getBody() {
        return this.body;
    }

}
