// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterServerlessConfResponseBody extends TeaModel {
    /**
     * <p>The ID of the serverless cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterServerlessConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterServerlessConfResponseBody self = new ModifyDBClusterServerlessConfResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterServerlessConfResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterServerlessConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
