// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterUsersResponseBody body;

    public static ListClusterUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterUsersResponse self = new ListClusterUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterUsersResponse setBody(ListClusterUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterUsersResponseBody getBody() {
        return this.body;
    }

}
