// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class DeletePublicTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePublicTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePublicTemplateResponseBody self = new DeletePublicTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePublicTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
