// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class ListYuqingMessagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListYuqingMessagesResponseBody body;

    public static ListYuqingMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListYuqingMessagesResponse self = new ListYuqingMessagesResponse();
        return TeaModel.build(map, self);
    }

    public ListYuqingMessagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListYuqingMessagesResponse setBody(ListYuqingMessagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListYuqingMessagesResponseBody getBody() {
        return this.body;
    }

}
