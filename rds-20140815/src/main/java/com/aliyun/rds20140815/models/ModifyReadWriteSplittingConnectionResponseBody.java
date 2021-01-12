// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyReadWriteSplittingConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyReadWriteSplittingConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyReadWriteSplittingConnectionResponseBody self = new ModifyReadWriteSplittingConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyReadWriteSplittingConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
