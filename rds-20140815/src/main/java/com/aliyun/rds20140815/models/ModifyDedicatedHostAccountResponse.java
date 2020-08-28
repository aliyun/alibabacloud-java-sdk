// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDedicatedHostAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostAccountResponse self = new ModifyDedicatedHostAccountResponse();
        return TeaModel.build(map, self);
    }

}
