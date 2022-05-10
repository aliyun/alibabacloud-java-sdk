// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventQuaraFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSuspEventQuaraFilesResponseBody body;

    public static DescribeSuspEventQuaraFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventQuaraFilesResponse self = new DescribeSuspEventQuaraFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventQuaraFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSuspEventQuaraFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSuspEventQuaraFilesResponse setBody(DescribeSuspEventQuaraFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSuspEventQuaraFilesResponseBody getBody() {
        return this.body;
    }

}
