// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamResourceCidrsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIpamResourceCidrsResponseBody body;

    public static ListIpamResourceCidrsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpamResourceCidrsResponse self = new ListIpamResourceCidrsResponse();
        return TeaModel.build(map, self);
    }

    public ListIpamResourceCidrsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpamResourceCidrsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIpamResourceCidrsResponse setBody(ListIpamResourceCidrsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpamResourceCidrsResponseBody getBody() {
        return this.body;
    }

}
