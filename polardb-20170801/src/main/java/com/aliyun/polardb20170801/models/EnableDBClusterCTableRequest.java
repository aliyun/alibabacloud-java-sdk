// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableDBClusterCTableRequest extends TeaModel {
    /**
     * <p>The ID of the database cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static EnableDBClusterCTableRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableDBClusterCTableRequest self = new EnableDBClusterCTableRequest();
        return TeaModel.build(map, self);
    }

    public EnableDBClusterCTableRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
