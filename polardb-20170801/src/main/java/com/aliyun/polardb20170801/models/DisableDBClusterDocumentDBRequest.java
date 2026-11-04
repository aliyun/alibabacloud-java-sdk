// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisableDBClusterDocumentDBRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-******************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static DisableDBClusterDocumentDBRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDBClusterDocumentDBRequest self = new DisableDBClusterDocumentDBRequest();
        return TeaModel.build(map, self);
    }

    public DisableDBClusterDocumentDBRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
