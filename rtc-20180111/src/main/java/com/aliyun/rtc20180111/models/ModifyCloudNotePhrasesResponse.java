// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyCloudNotePhrasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCloudNotePhrasesResponseBody body;

    public static ModifyCloudNotePhrasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudNotePhrasesResponse self = new ModifyCloudNotePhrasesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCloudNotePhrasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCloudNotePhrasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCloudNotePhrasesResponse setBody(ModifyCloudNotePhrasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCloudNotePhrasesResponseBody getBody() {
        return this.body;
    }

}
