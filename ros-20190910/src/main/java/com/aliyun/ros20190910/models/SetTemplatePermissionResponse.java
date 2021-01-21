// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SetTemplatePermissionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetTemplatePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        SetTemplatePermissionResponse self = new SetTemplatePermissionResponse();
        return TeaModel.build(map, self);
    }

    public SetTemplatePermissionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
