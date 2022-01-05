// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class ExportExperimentTreeByProjectOwnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportExperimentTreeByProjectOwnerResponseBody body;

    public static ExportExperimentTreeByProjectOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportExperimentTreeByProjectOwnerResponse self = new ExportExperimentTreeByProjectOwnerResponse();
        return TeaModel.build(map, self);
    }

    public ExportExperimentTreeByProjectOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportExperimentTreeByProjectOwnerResponse setBody(ExportExperimentTreeByProjectOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportExperimentTreeByProjectOwnerResponseBody getBody() {
        return this.body;
    }

}
