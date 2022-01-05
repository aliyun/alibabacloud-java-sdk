// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class ExportExperimentTreeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportExperimentTreeResponseBody body;

    public static ExportExperimentTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportExperimentTreeResponse self = new ExportExperimentTreeResponse();
        return TeaModel.build(map, self);
    }

    public ExportExperimentTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportExperimentTreeResponse setBody(ExportExperimentTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportExperimentTreeResponseBody getBody() {
        return this.body;
    }

}
