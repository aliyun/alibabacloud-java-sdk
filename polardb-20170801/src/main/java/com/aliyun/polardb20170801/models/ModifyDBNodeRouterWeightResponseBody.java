// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeRouterWeightResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E2FDB684-751D-424D-98B9-704BEA******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBNodeRouterWeightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeRouterWeightResponseBody self = new ModifyDBNodeRouterWeightResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBNodeRouterWeightResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBNodeRouterWeightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
