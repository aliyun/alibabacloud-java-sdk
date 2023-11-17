// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarTaskAndActionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSoarTaskAndActionsResponseBody body;

    public static DescribeSoarTaskAndActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarTaskAndActionsResponse self = new DescribeSoarTaskAndActionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSoarTaskAndActionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSoarTaskAndActionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSoarTaskAndActionsResponse setBody(DescribeSoarTaskAndActionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSoarTaskAndActionsResponseBody getBody() {
        return this.body;
    }

}
