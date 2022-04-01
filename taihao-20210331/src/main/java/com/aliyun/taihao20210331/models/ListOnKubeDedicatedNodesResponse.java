// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListOnKubeDedicatedNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOnKubeDedicatedNodesResponseBody body;

    public static ListOnKubeDedicatedNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOnKubeDedicatedNodesResponse self = new ListOnKubeDedicatedNodesResponse();
        return TeaModel.build(map, self);
    }

    public ListOnKubeDedicatedNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOnKubeDedicatedNodesResponse setBody(ListOnKubeDedicatedNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOnKubeDedicatedNodesResponseBody getBody() {
        return this.body;
    }

}
