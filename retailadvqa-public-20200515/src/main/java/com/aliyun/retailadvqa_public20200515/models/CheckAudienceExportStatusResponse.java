// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CheckAudienceExportStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckAudienceExportStatusResponseBody body;

    public static CheckAudienceExportStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAudienceExportStatusResponse self = new CheckAudienceExportStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckAudienceExportStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAudienceExportStatusResponse setBody(CheckAudienceExportStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAudienceExportStatusResponseBody getBody() {
        return this.body;
    }

}
