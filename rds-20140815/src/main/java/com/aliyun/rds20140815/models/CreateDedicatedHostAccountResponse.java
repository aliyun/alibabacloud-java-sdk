// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateDedicatedHostAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostAccountResponse self = new CreateDedicatedHostAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
