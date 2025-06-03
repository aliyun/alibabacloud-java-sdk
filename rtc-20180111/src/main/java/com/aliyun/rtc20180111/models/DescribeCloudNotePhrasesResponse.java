// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCloudNotePhrasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudNotePhrasesResponseBody body;

    public static DescribeCloudNotePhrasesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudNotePhrasesResponse self = new DescribeCloudNotePhrasesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudNotePhrasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudNotePhrasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudNotePhrasesResponse setBody(DescribeCloudNotePhrasesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudNotePhrasesResponseBody getBody() {
        return this.body;
    }

}
