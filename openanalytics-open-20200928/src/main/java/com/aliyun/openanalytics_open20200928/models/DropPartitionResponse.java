// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class DropPartitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DropPartitionResponseBody body;

    public static DropPartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        DropPartitionResponse self = new DropPartitionResponse();
        return TeaModel.build(map, self);
    }

    public DropPartitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DropPartitionResponse setBody(DropPartitionResponseBody body) {
        this.body = body;
        return this;
    }
    public DropPartitionResponseBody getBody() {
        return this.body;
    }

}
