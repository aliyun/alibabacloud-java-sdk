// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchSetVodDomainConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchSetVodDomainConfigsResponseBody body;

    public static BatchSetVodDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetVodDomainConfigsResponse self = new BatchSetVodDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetVodDomainConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSetVodDomainConfigsResponse setBody(BatchSetVodDomainConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetVodDomainConfigsResponseBody getBody() {
        return this.body;
    }

}
