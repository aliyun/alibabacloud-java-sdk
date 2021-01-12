// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDedicatedHostUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostUserResponseBody self = new CreateDedicatedHostUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
