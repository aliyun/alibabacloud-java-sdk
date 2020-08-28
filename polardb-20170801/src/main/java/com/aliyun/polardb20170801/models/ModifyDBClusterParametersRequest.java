// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterParametersRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("Parameters")
    @Validation(required = true)
    public String parameters;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

    public static ModifyDBClusterParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterParametersRequest self = new ModifyDBClusterParametersRequest();
        return TeaModel.build(map, self);
    }

}
