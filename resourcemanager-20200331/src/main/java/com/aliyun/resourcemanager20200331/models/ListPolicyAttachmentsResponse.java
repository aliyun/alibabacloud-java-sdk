// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListPolicyAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPolicyAttachmentsResponseBody body;

    public static ListPolicyAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyAttachmentsResponse self = new ListPolicyAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListPolicyAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPolicyAttachmentsResponse setBody(ListPolicyAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPolicyAttachmentsResponseBody getBody() {
        return this.body;
    }

}
