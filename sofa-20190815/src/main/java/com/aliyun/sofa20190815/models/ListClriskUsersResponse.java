// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskUsersResponseBody body;

    public static ListClriskUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskUsersResponse self = new ListClriskUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskUsersResponse setBody(ListClriskUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskUsersResponseBody getBody() {
        return this.body;
    }

}
