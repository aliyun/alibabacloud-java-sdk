// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeDialogMessagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDialogMessagesResponseBody body;

    public static DescribeDialogMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDialogMessagesResponse self = new DescribeDialogMessagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDialogMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDialogMessagesResponse setBody(DescribeDialogMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDialogMessagesResponseBody getBody() {
        return this.body;
    }

}
