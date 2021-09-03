// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class CheckMarketingAudienceExportStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckMarketingAudienceExportStatusResponseBody body;

    public static CheckMarketingAudienceExportStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckMarketingAudienceExportStatusResponse self = new CheckMarketingAudienceExportStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckMarketingAudienceExportStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckMarketingAudienceExportStatusResponse setBody(CheckMarketingAudienceExportStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckMarketingAudienceExportStatusResponseBody getBody() {
        return this.body;
    }

}
