// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeExportProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExportProgressResponseBody body;

    public static DescribeExportProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportProgressResponse self = new DescribeExportProgressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExportProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExportProgressResponse setBody(DescribeExportProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExportProgressResponseBody getBody() {
        return this.body;
    }

}
