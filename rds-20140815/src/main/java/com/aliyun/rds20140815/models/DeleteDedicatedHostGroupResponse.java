// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDedicatedHostGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDedicatedHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedHostGroupResponse self = new DeleteDedicatedHostGroupResponse();
        return TeaModel.build(map, self);
    }

}
