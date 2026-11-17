// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UploadChatFileByBase64Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadChatFileByBase64ResponseBody body;

    public static UploadChatFileByBase64Response build(java.util.Map<String, ?> map) throws Exception {
        UploadChatFileByBase64Response self = new UploadChatFileByBase64Response();
        return TeaModel.build(map, self);
    }

    public UploadChatFileByBase64Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadChatFileByBase64Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadChatFileByBase64Response setBody(UploadChatFileByBase64ResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadChatFileByBase64ResponseBody getBody() {
        return this.body;
    }

}
