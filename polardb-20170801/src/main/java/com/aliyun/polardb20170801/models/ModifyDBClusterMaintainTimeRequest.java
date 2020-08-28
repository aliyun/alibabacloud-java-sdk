// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMaintainTimeRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("MaintainTime")
    @Validation(required = true)
    public String maintainTime;

    public static ModifyDBClusterMaintainTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMaintainTimeRequest self = new ModifyDBClusterMaintainTimeRequest();
        return TeaModel.build(map, self);
    }

}
