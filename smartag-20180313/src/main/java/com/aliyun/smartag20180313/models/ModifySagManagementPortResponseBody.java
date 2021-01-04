// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagManagementPortResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySagManagementPortResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySagManagementPortResponseBody self = new ModifySagManagementPortResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySagManagementPortResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
