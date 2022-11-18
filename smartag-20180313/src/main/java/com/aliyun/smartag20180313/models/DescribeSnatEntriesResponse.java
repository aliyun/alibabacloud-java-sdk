// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSnatEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSnatEntriesResponseBody body;

    public static DescribeSnatEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnatEntriesResponse self = new DescribeSnatEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSnatEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSnatEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSnatEntriesResponse setBody(DescribeSnatEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSnatEntriesResponseBody getBody() {
        return this.body;
    }

}
