// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DedicatedHostGroupId")
    @Validation(required = true)
    public String dedicatedHostGroupId;

    public static CreateDedicatedHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostGroupResponse self = new CreateDedicatedHostGroupResponse();
        return TeaModel.build(map, self);
    }

}
