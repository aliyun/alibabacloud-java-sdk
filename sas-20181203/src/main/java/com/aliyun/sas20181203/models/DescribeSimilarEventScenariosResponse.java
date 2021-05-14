// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSimilarEventScenariosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeSimilarEventScenariosResponse setBody(DescribeSimilarEventScenariosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSimilarEventScenariosResponseBody getBody() {
        return this.body;
    }

}
