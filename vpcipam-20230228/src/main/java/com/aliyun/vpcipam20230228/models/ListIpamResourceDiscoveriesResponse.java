// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamResourceDiscoveriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIpamResourceDiscoveriesResponseBody body;

    public static ListIpamResourceDiscoveriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIpamResourceDiscoveriesResponse self = new ListIpamResourceDiscoveriesResponse();
        return TeaModel.build(map, self);
    }

    public ListIpamResourceDiscoveriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIpamResourceDiscoveriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIpamResourceDiscoveriesResponse setBody(ListIpamResourceDiscoveriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIpamResourceDiscoveriesResponseBody getBody() {
        return this.body;
    }

}
