// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListClusterOperationTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClusterOperationTasksResponseBody body;

    public static ListClusterOperationTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterOperationTasksResponse self = new ListClusterOperationTasksResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterOperationTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterOperationTasksResponse setBody(ListClusterOperationTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterOperationTasksResponseBody getBody() {
        return this.body;
    }

}
