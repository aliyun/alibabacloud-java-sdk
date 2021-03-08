// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVodDomainLogResponseBody body;

    public static DescribeVodDomainLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainLogResponse self = new DescribeVodDomainLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainLogResponse setBody(DescribeVodDomainLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainLogResponseBody getBody() {
        return this.body;
    }

}
