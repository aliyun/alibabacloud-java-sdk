// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVodUserDomainsResponseBody body;

    public static DescribeVodUserDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserDomainsResponse self = new DescribeVodUserDomainsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodUserDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodUserDomainsResponse setBody(DescribeVodUserDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodUserDomainsResponseBody getBody() {
        return this.body;
    }

}
