// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListControlPolicyAttachmentsForTargetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListControlPolicyAttachmentsForTargetResponseBody body;

    public static ListControlPolicyAttachmentsForTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListControlPolicyAttachmentsForTargetResponse self = new ListControlPolicyAttachmentsForTargetResponse();
        return TeaModel.build(map, self);
    }

    public ListControlPolicyAttachmentsForTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListControlPolicyAttachmentsForTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListControlPolicyAttachmentsForTargetResponse setBody(ListControlPolicyAttachmentsForTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListControlPolicyAttachmentsForTargetResponseBody getBody() {
        return this.body;
    }

}
