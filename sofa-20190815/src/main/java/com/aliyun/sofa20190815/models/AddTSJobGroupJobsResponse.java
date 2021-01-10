// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddTSJobGroupJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddTSJobGroupJobsResponseBody body;

    public static AddTSJobGroupJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddTSJobGroupJobsResponse self = new AddTSJobGroupJobsResponse();
        return TeaModel.build(map, self);
    }

    public AddTSJobGroupJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddTSJobGroupJobsResponse setBody(AddTSJobGroupJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddTSJobGroupJobsResponseBody getBody() {
        return this.body;
    }

}
