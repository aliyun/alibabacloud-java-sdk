// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class BatchStopVodDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchStopVodDomainResponseBody body;

    public static BatchStopVodDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchStopVodDomainResponse self = new BatchStopVodDomainResponse();
        return TeaModel.build(map, self);
    }

    public BatchStopVodDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchStopVodDomainResponse setBody(BatchStopVodDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchStopVodDomainResponseBody getBody() {
        return this.body;
    }

}
