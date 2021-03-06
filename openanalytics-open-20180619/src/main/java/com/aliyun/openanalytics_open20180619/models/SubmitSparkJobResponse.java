// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class SubmitSparkJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitSparkJobResponseBody body;

    public static SubmitSparkJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkJobResponse self = new SubmitSparkJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSparkJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSparkJobResponse setBody(SubmitSparkJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSparkJobResponseBody getBody() {
        return this.body;
    }

}
