// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyReadWriteSplittingConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyReadWriteSplittingConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyReadWriteSplittingConnectionResponse self = new ModifyReadWriteSplittingConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyReadWriteSplittingConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
