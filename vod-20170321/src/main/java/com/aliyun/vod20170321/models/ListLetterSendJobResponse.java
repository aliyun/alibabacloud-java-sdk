// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListLetterSendJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLetterSendJobResponseBody body;

    public static ListLetterSendJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLetterSendJobResponse self = new ListLetterSendJobResponse();
        return TeaModel.build(map, self);
    }

    public ListLetterSendJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLetterSendJobResponse setBody(ListLetterSendJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLetterSendJobResponseBody getBody() {
        return this.body;
    }

}
