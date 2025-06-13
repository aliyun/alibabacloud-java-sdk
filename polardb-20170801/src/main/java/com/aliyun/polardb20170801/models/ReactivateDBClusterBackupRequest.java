// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ReactivateDBClusterBackupRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static ReactivateDBClusterBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        ReactivateDBClusterBackupRequest self = new ReactivateDBClusterBackupRequest();
        return TeaModel.build(map, self);
    }

    public ReactivateDBClusterBackupRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
