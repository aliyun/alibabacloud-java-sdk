// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ExportMarketingAudienceToOSSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportMarketingAudienceToOSSResponseBody body;

    public static ExportMarketingAudienceToOSSResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportMarketingAudienceToOSSResponse self = new ExportMarketingAudienceToOSSResponse();
        return TeaModel.build(map, self);
    }

    public ExportMarketingAudienceToOSSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportMarketingAudienceToOSSResponse setBody(ExportMarketingAudienceToOSSResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportMarketingAudienceToOSSResponseBody getBody() {
        return this.body;
    }

}
