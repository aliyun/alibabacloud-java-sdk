// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatIpCidrsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListNatIpCidrsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNatIpCidrsResponse setBody(ListNatIpCidrsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNatIpCidrsResponseBody getBody() {
        return this.body;
    }

}
