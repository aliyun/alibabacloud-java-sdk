// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeletionProtectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletionProtectionResponseBody body;

    public static DeletionProtectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletionProtectionResponse self = new DeletionProtectionResponse();
        return TeaModel.build(map, self);
    }

    public DeletionProtectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletionProtectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletionProtectionResponse setBody(DeletionProtectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletionProtectionResponseBody getBody() {
        return this.body;
    }

}
