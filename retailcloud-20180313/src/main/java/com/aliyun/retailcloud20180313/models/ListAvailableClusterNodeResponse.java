// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListAvailableClusterNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAvailableClusterNodeResponseBody body;

    public static ListAvailableClusterNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableClusterNodeResponse self = new ListAvailableClusterNodeResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableClusterNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableClusterNodeResponse setBody(ListAvailableClusterNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableClusterNodeResponseBody getBody() {
        return this.body;
    }

}
