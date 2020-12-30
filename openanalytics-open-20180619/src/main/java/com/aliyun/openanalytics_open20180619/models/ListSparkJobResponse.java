// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ListSparkJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSparkJobResponseBody body;

    public static ListSparkJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSparkJobResponse self = new ListSparkJobResponse();
        return TeaModel.build(map, self);
    }

    public ListSparkJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSparkJobResponse setBody(ListSparkJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSparkJobResponseBody getBody() {
        return this.body;
    }

}
