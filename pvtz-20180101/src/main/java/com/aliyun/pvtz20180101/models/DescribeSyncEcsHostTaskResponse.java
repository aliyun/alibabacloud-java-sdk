// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeSyncEcsHostTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSyncEcsHostTaskResponseBody body;

    public static DescribeSyncEcsHostTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncEcsHostTaskResponse self = new DescribeSyncEcsHostTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSyncEcsHostTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSyncEcsHostTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSyncEcsHostTaskResponse setBody(DescribeSyncEcsHostTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSyncEcsHostTaskResponseBody getBody() {
        return this.body;
    }

}
