// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKBSyncLinksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKBSyncLinksResponseBody body;

    public static DescribeKBSyncLinksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKBSyncLinksResponse self = new DescribeKBSyncLinksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKBSyncLinksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKBSyncLinksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKBSyncLinksResponse setBody(DescribeKBSyncLinksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKBSyncLinksResponseBody getBody() {
        return this.body;
    }

}
