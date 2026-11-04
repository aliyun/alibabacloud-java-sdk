// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableAIDBClusterDatasetServiceResponseBody extends TeaModel {
    /**
     * <p>The instance ID of the dataset management service.</p>
     * 
     * <strong>example:</strong>
     * <p>pcs-2ze26***</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C890995A-CF06-4F4D-8DB8-DD26C2******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableAIDBClusterDatasetServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableAIDBClusterDatasetServiceResponseBody self = new EnableAIDBClusterDatasetServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableAIDBClusterDatasetServiceResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public EnableAIDBClusterDatasetServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
