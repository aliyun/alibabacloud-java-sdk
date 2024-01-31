// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSimilarEventScenariosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSimilarEventScenariosResponseBody body;

    public static DescribeSimilarEventScenariosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimilarEventScenariosResponse self = new DescribeSimilarEventScenariosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSimilarEventScenariosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSimilarEventScenariosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSimilarEventScenariosResponse setBody(DescribeSimilarEventScenariosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSimilarEventScenariosResponseBody getBody() {
        return this.body;
    }

}
