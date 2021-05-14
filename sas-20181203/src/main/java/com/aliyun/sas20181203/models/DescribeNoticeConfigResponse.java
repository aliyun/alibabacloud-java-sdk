// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeNoticeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNoticeConfigResponseBody body;

    public static DescribeNoticeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNoticeConfigResponse self = new DescribeNoticeConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNoticeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNoticeConfigResponse setBody(DescribeNoticeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNoticeConfigResponseBody getBody() {
        return this.body;
    }

}
