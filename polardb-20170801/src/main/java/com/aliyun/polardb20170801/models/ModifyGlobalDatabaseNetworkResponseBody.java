// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyGlobalDatabaseNetworkResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C61892A4-0850-4516-9E26-44D96C1782DE</p>
     */
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
