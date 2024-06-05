// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FilePutUserTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FilePutUserTagsResponseBody body;

    public static FilePutUserTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        FilePutUserTagsResponse self = new FilePutUserTagsResponse();
        return TeaModel.build(map, self);
    }

    public FilePutUserTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FilePutUserTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FilePutUserTagsResponse setBody(FilePutUserTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public FilePutUserTagsResponseBody getBody() {
        return this.body;
    }

}
