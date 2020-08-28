// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterDescriptionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBClusterDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterDescriptionResponse self = new ModifyDBClusterDescriptionResponse();
        return TeaModel.build(map, self);
    }

}
