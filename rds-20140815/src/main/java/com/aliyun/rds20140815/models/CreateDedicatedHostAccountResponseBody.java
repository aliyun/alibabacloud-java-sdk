// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDedicatedHostAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostAccountResponseBody self = new CreateDedicatedHostAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
