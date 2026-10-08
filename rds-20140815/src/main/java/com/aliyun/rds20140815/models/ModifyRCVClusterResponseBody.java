// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCVClusterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRCVClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCVClusterResponseBody self = new ModifyRCVClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRCVClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
