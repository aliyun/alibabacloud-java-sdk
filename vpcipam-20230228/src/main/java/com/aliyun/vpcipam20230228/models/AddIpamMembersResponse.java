// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class AddIpamMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddIpamMembersResponseBody body;

    public static AddIpamMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddIpamMembersResponse self = new AddIpamMembersResponse();
        return TeaModel.build(map, self);
    }

    public AddIpamMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddIpamMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddIpamMembersResponse setBody(AddIpamMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddIpamMembersResponseBody getBody() {
        return this.body;
    }

}
