// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribePodLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePodLogResponseBody body;

    public static DescribePodLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePodLogResponse self = new DescribePodLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribePodLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePodLogResponse setBody(DescribePodLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePodLogResponseBody getBody() {
        return this.body;
    }

}
