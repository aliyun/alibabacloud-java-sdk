// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateNetworkAclEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNetworkAclEntriesResponseBody body;

    public static UpdateNetworkAclEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkAclEntriesResponse self = new UpdateNetworkAclEntriesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNetworkAclEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNetworkAclEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNetworkAclEntriesResponse setBody(UpdateNetworkAclEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNetworkAclEntriesResponseBody getBody() {
        return this.body;
    }

}
