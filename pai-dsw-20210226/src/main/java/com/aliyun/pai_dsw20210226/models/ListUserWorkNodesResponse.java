// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListUserWorkNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserWorkNodesResponseBody body;

    public static ListUserWorkNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserWorkNodesResponse self = new ListUserWorkNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserWorkNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserWorkNodesResponse setBody(ListUserWorkNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserWorkNodesResponseBody getBody() {
        return this.body;
    }

}
