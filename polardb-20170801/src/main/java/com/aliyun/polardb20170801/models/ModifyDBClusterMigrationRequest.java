// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMigrationRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("SourceRDSDBInstanceId")
    @Validation(required = true)
    public String sourceRDSDBInstanceId;

    @NameInMap("NewMasterInstanceId")
    @Validation(required = true)
    public String newMasterInstanceId;

    @NameInMap("SwapConnectionString")
    public String swapConnectionString;

    public static ModifyDBClusterMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMigrationRequest self = new ModifyDBClusterMigrationRequest();
        return TeaModel.build(map, self);
    }

}
