// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterParametersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterParametersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterParametersResponseBody self = new ModifyDBClusterParametersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterParametersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
