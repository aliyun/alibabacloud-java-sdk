// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class ExportExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportExperimentResponseBody body;

    public static ExportExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportExperimentResponse self = new ExportExperimentResponse();
        return TeaModel.build(map, self);
    }

    public ExportExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportExperimentResponse setBody(ExportExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportExperimentResponseBody getBody() {
        return this.body;
    }

}
