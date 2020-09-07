// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBDescriptionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBDescriptionResponse self = new ModifyDBDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBDescriptionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
