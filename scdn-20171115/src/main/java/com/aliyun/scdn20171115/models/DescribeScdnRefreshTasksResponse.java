// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnRefreshTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnRefreshTasksResponseBody body;

    public static DescribeScdnRefreshTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnRefreshTasksResponse self = new DescribeScdnRefreshTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnRefreshTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnRefreshTasksResponse setBody(DescribeScdnRefreshTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnRefreshTasksResponseBody getBody() {
        return this.body;
    }

}
