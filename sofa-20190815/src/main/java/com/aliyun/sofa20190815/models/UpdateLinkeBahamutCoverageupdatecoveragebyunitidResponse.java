// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponseBody body;

    public static UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse self = new UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse setBody(UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponseBody getBody() {
        return this.body;
    }

}
