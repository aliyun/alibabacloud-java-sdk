// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DropDedicatedHostUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DropDedicatedHostUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DropDedicatedHostUserResponse self = new DropDedicatedHostUserResponse();
        return TeaModel.build(map, self);
    }

}
