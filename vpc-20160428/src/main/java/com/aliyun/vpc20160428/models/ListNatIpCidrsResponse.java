// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatIpCidrsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNatIpCidrsResponseBody body;

    public static ListNatIpCidrsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNatIpCidrsResponse self = new ListNatIpCidrsResponse();
        return TeaModel.build(map, self);
    }

    public ListNatIpCidrsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNatIpCidrsResponse setBody(ListNatIpCidrsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNatIpCidrsResponseBody getBody() {
        return this.body;
    }

}
