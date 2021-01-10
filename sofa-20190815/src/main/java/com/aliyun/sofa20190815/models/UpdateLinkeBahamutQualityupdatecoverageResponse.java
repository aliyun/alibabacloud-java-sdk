// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutQualityupdatecoverageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutQualityupdatecoverageResponseBody body;

    public static UpdateLinkeBahamutQualityupdatecoverageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutQualityupdatecoverageResponse self = new UpdateLinkeBahamutQualityupdatecoverageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutQualityupdatecoverageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutQualityupdatecoverageResponse setBody(UpdateLinkeBahamutQualityupdatecoverageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutQualityupdatecoverageResponseBody getBody() {
        return this.body;
    }

}
