// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateHostAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreateHostAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHostAccountResponse self = new CreateHostAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateHostAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
