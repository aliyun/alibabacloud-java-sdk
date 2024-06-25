// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableDBClusterServerlessResponseBody extends TeaModel {
    /**
     * <p>The ID of the serverless cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp10gr51qasnl****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5E71541A-6007-4DCC-A38A-F872C31FEB45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableDBClusterServerlessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableDBClusterServerlessResponseBody self = new EnableDBClusterServerlessResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableDBClusterServerlessResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public EnableDBClusterServerlessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
