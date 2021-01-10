// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskDataNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskDataNodesResponseBody body;

    public static ListClriskDataNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskDataNodesResponse self = new ListClriskDataNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskDataNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskDataNodesResponse setBody(ListClriskDataNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskDataNodesResponseBody getBody() {
        return this.body;
    }

}
