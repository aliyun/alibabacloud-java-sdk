// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class RemoveIpamMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveIpamMembersResponseBody body;

    public static RemoveIpamMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveIpamMembersResponse self = new RemoveIpamMembersResponse();
        return TeaModel.build(map, self);
    }

    public RemoveIpamMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveIpamMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveIpamMembersResponse setBody(RemoveIpamMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveIpamMembersResponseBody getBody() {
        return this.body;
    }

}
