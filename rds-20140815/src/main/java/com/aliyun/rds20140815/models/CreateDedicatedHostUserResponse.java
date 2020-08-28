// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostUserResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateDedicatedHostUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostUserResponse self = new CreateDedicatedHostUserResponse();
        return TeaModel.build(map, self);
    }

}
