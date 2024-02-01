// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CopyNetworkAclEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyNetworkAclEntriesResponseBody body;

    public static CopyNetworkAclEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyNetworkAclEntriesResponse self = new CopyNetworkAclEntriesResponse();
        return TeaModel.build(map, self);
    }

    public CopyNetworkAclEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyNetworkAclEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyNetworkAclEntriesResponse setBody(CopyNetworkAclEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyNetworkAclEntriesResponseBody getBody() {
        return this.body;
    }

}
