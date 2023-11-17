// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordInOutputResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSoarRecordInOutputResponseBody body;

    public static DescribeSoarRecordInOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarRecordInOutputResponse self = new DescribeSoarRecordInOutputResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSoarRecordInOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSoarRecordInOutputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSoarRecordInOutputResponse setBody(DescribeSoarRecordInOutputResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSoarRecordInOutputResponseBody getBody() {
        return this.body;
    }

}
