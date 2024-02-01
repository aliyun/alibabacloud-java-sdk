// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateFailoverTestJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFailoverTestJobResponseBody body;

    public static UpdateFailoverTestJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFailoverTestJobResponse self = new UpdateFailoverTestJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFailoverTestJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFailoverTestJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFailoverTestJobResponse setBody(UpdateFailoverTestJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFailoverTestJobResponseBody getBody() {
        return this.body;
    }

}
