// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class SwitchOverGlobalDatabaseNetworkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchOverGlobalDatabaseNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchOverGlobalDatabaseNetworkResponseBody self = new SwitchOverGlobalDatabaseNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchOverGlobalDatabaseNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
