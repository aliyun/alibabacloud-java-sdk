// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyAccountDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionResponse self = new ModifyAccountDescriptionResponse();
        return TeaModel.build(map, self);
    }

}
