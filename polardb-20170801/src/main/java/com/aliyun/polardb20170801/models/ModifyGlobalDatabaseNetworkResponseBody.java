// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyGlobalDatabaseNetworkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyGlobalDatabaseNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalDatabaseNetworkResponseBody self = new ModifyGlobalDatabaseNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalDatabaseNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
