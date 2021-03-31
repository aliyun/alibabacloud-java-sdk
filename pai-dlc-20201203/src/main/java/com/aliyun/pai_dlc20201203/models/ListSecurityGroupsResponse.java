// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListSecurityGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSecurityGroupsResponseBody body;

    public static ListSecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupsResponse self = new ListSecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecurityGroupsResponse setBody(ListSecurityGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecurityGroupsResponseBody getBody() {
        return this.body;
    }

}
