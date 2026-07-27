// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestartAIDBClusterRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static RestartAIDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartAIDBClusterRequest self = new RestartAIDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public RestartAIDBClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
