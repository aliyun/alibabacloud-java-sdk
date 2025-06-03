// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class CreateCloudNotePhrasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloudNotePhrasesResponseBody body;

    public static CreateCloudNotePhrasesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudNotePhrasesResponse self = new CreateCloudNotePhrasesResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloudNotePhrasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloudNotePhrasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloudNotePhrasesResponse setBody(CreateCloudNotePhrasesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloudNotePhrasesResponseBody getBody() {
        return this.body;
    }

}
