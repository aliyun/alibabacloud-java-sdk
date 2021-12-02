// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribePodEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePodEventsResponseBody body;

    public static DescribePodEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePodEventsResponse self = new DescribePodEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePodEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePodEventsResponse setBody(DescribePodEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePodEventsResponseBody getBody() {
        return this.body;
    }

}
