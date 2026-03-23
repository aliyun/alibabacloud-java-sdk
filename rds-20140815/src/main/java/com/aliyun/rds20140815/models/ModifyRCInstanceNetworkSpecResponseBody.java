// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceNetworkSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRCInstanceNetworkSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceNetworkSpecResponseBody self = new ModifyRCInstanceNetworkSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceNetworkSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
