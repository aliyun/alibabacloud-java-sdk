// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHostGroupsResponseBody body;

    public static ListHostGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupsResponse self = new ListHostGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListHostGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHostGroupsResponse setBody(ListHostGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostGroupsResponseBody getBody() {
        return this.body;
    }

}
