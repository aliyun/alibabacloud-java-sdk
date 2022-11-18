// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSagWanSnatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSagWanSnatResponseBody body;

    public static DescribeSagWanSnatResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSagWanSnatResponse self = new DescribeSagWanSnatResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSagWanSnatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSagWanSnatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSagWanSnatResponse setBody(DescribeSagWanSnatResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSagWanSnatResponseBody getBody() {
        return this.body;
    }

}
