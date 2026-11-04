// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisableDBClusterCTableRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static DisableDBClusterCTableRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDBClusterCTableRequest self = new DisableDBClusterCTableRequest();
        return TeaModel.build(map, self);
    }

    public DisableDBClusterCTableRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
