// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class DescribeWhiteBoardRecordingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWhiteBoardRecordingsResponseBody body;

    public static DescribeWhiteBoardRecordingsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteBoardRecordingsResponse self = new DescribeWhiteBoardRecordingsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteBoardRecordingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWhiteBoardRecordingsResponse setBody(DescribeWhiteBoardRecordingsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWhiteBoardRecordingsResponseBody getBody() {
        return this.body;
    }

}
