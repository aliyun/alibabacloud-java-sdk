// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisableDBClusterDynamoDBRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static DisableDBClusterDynamoDBRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDBClusterDynamoDBRequest self = new DisableDBClusterDynamoDBRequest();
        return TeaModel.build(map, self);
    }

    public DisableDBClusterDynamoDBRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
