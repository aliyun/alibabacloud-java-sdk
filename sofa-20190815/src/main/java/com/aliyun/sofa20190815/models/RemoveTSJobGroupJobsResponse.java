// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveTSJobGroupJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveTSJobGroupJobsResponseBody body;

    public static RemoveTSJobGroupJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveTSJobGroupJobsResponse self = new RemoveTSJobGroupJobsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveTSJobGroupJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveTSJobGroupJobsResponse setBody(RemoveTSJobGroupJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveTSJobGroupJobsResponseBody getBody() {
        return this.body;
    }

}
