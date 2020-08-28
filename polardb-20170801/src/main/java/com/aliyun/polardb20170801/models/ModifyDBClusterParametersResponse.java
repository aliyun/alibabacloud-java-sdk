// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterParametersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBClusterParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterParametersResponse self = new ModifyDBClusterParametersResponse();
        return TeaModel.build(map, self);
    }

}
