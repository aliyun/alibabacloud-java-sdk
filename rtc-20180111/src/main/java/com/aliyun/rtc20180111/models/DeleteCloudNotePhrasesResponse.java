// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteCloudNotePhrasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudNotePhrasesResponseBody body;

    public static DeleteCloudNotePhrasesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudNotePhrasesResponse self = new DeleteCloudNotePhrasesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudNotePhrasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudNotePhrasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudNotePhrasesResponse setBody(DeleteCloudNotePhrasesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudNotePhrasesResponseBody getBody() {
        return this.body;
    }

}
