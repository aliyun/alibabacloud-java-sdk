// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class DescribeWhiteBoardsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWhiteBoardsResponseBody body;

    public static DescribeWhiteBoardsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteBoardsResponse self = new DescribeWhiteBoardsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteBoardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhiteBoardsResponse setBody(DescribeWhiteBoardsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhiteBoardsResponseBody getBody() {
        return this.body;
    }

}
