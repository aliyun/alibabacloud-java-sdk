// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoRenewAttributeResponse self = new ModifyAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

}
