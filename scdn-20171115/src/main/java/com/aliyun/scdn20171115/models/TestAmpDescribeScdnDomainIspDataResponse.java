// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class TestAmpDescribeScdnDomainIspDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TestAmpDescribeScdnDomainIspDataResponseBody body;

    public static TestAmpDescribeScdnDomainIspDataResponse build(java.util.Map<String, ?> map) throws Exception {
        TestAmpDescribeScdnDomainIspDataResponse self = new TestAmpDescribeScdnDomainIspDataResponse();
        return TeaModel.build(map, self);
    }

    public TestAmpDescribeScdnDomainIspDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestAmpDescribeScdnDomainIspDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestAmpDescribeScdnDomainIspDataResponse setBody(TestAmpDescribeScdnDomainIspDataResponseBody body) {
        this.body = body;
        return this;
    }
    public TestAmpDescribeScdnDomainIspDataResponseBody getBody() {
        return this.body;
    }

}
