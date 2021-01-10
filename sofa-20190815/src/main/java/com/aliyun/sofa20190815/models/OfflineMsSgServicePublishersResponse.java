// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OfflineMsSgServicePublishersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OfflineMsSgServicePublishersResponseBody body;

    public static OfflineMsSgServicePublishersResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineMsSgServicePublishersResponse self = new OfflineMsSgServicePublishersResponse();
        return TeaModel.build(map, self);
    }

    public OfflineMsSgServicePublishersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineMsSgServicePublishersResponse setBody(OfflineMsSgServicePublishersResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineMsSgServicePublishersResponseBody getBody() {
        return this.body;
    }

}
