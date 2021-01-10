// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadLinkeLinkaSinglecoverageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadLinkeLinkaSinglecoverageResponseBody body;

    public static UploadLinkeLinkaSinglecoverageResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadLinkeLinkaSinglecoverageResponse self = new UploadLinkeLinkaSinglecoverageResponse();
        return TeaModel.build(map, self);
    }

    public UploadLinkeLinkaSinglecoverageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadLinkeLinkaSinglecoverageResponse setBody(UploadLinkeLinkaSinglecoverageResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadLinkeLinkaSinglecoverageResponseBody getBody() {
        return this.body;
    }

}
