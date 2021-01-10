// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateUisConnectionResponseBody extends TeaModel {
    @NameInMap("UisConnectionId")
    public String uisConnectionId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateUisConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUisConnectionResponseBody self = new CreateUisConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUisConnectionResponseBody setUisConnectionId(String uisConnectionId) {
        this.uisConnectionId = uisConnectionId;
        return this;
    }
    public String getUisConnectionId() {
        return this.uisConnectionId;
    }

    public CreateUisConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
