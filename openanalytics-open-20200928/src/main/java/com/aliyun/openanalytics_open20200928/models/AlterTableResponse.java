// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class AlterTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AlterTableResponseBody body;

    public static AlterTableResponse build(java.util.Map<String, ?> map) throws Exception {
        AlterTableResponse self = new AlterTableResponse();
        return TeaModel.build(map, self);
    }

    public AlterTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AlterTableResponse setBody(AlterTableResponseBody body) {
        this.body = body;
        return this;
    }
    public AlterTableResponseBody getBody() {
        return this.body;
    }

}
