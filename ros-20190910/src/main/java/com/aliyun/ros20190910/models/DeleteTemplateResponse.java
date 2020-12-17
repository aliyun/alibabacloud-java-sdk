// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteTemplateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateResponse self = new DeleteTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
