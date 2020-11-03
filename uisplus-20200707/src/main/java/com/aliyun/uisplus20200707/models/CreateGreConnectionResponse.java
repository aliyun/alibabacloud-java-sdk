// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class CreateGreConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("GreConnectionId")
    @Validation(required = true)
    public String greConnectionId;

    public static CreateGreConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGreConnectionResponse self = new CreateGreConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateGreConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGreConnectionResponse setGreConnectionId(String greConnectionId) {
        this.greConnectionId = greConnectionId;
        return this;
    }
    public String getGreConnectionId() {
        return this.greConnectionId;
    }

}
