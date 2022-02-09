// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ValidateOmsMigrationObjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateOmsMigrationObjectsResponseBody body;

    public static ValidateOmsMigrationObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateOmsMigrationObjectsResponse self = new ValidateOmsMigrationObjectsResponse();
        return TeaModel.build(map, self);
    }

    public ValidateOmsMigrationObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateOmsMigrationObjectsResponse setBody(ValidateOmsMigrationObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateOmsMigrationObjectsResponseBody getBody() {
        return this.body;
    }

}
