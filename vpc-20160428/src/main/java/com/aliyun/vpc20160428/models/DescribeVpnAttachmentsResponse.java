// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpnAttachmentsResponseBody body;

    public static DescribeVpnAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnAttachmentsResponse self = new DescribeVpnAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpnAttachmentsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpnAttachmentsResponse setBody(DescribeVpnAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpnAttachmentsResponseBody getBody() {
        return this.body;
    }

}
