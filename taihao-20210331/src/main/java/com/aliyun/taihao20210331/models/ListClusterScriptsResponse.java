// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterScriptsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterScriptsResponseBody body;

    public static ListClusterScriptsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterScriptsResponse self = new ListClusterScriptsResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterScriptsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterScriptsResponse setBody(ListClusterScriptsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterScriptsResponseBody getBody() {
        return this.body;
    }

}
