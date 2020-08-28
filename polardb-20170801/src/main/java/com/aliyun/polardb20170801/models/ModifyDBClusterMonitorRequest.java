// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMonitorRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("Period")
    @Validation(required = true)
    public String period;

    public static ModifyDBClusterMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMonitorRequest self = new ModifyDBClusterMonitorRequest();
        return TeaModel.build(map, self);
    }

}
