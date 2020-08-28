// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class RemoveUserFromGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RemoveUserFromGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromGroupResponse self = new RemoveUserFromGroupResponse();
        return TeaModel.build(map, self);
    }

}
