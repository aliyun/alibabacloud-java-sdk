// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamPoolCidrsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIpamPoolCidrsResponseBody body;

    public static ListIpamPoolCidrsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpamPoolCidrsResponse self = new ListIpamPoolCidrsResponse();
        return TeaModel.build(map, self);
    }

    public ListIpamPoolCidrsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpamPoolCidrsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIpamPoolCidrsResponse setBody(ListIpamPoolCidrsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpamPoolCidrsResponseBody getBody() {
        return this.body;
    }

}
