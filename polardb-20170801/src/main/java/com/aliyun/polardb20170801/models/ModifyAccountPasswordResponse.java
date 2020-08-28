// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAccountPasswordResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyAccountPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountPasswordResponse self = new ModifyAccountPasswordResponse();
        return TeaModel.build(map, self);
    }

}
