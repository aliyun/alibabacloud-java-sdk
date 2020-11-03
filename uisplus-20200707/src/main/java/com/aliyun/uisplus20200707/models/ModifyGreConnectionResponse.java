// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class ModifyGreConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyGreConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGreConnectionResponse self = new ModifyGreConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGreConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
