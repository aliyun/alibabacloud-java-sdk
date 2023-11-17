// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordActionOutputListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSoarRecordActionOutputListResponseBody body;

    public static DescribeSoarRecordActionOutputListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarRecordActionOutputListResponse self = new DescribeSoarRecordActionOutputListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSoarRecordActionOutputListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSoarRecordActionOutputListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSoarRecordActionOutputListResponse setBody(DescribeSoarRecordActionOutputListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSoarRecordActionOutputListResponseBody getBody() {
        return this.body;
    }

}
