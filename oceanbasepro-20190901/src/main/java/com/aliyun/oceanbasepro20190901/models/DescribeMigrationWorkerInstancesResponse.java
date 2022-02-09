// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeMigrationWorkerInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMigrationWorkerInstancesResponseBody body;

    public static DescribeMigrationWorkerInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationWorkerInstancesResponse self = new DescribeMigrationWorkerInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationWorkerInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMigrationWorkerInstancesResponse setBody(DescribeMigrationWorkerInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrationWorkerInstancesResponseBody getBody() {
        return this.body;
    }

}
