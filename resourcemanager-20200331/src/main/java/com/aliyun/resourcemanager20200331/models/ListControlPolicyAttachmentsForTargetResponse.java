// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListControlPolicyAttachmentsForTargetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
