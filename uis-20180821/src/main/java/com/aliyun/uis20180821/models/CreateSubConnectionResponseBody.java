// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateSubConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UisSubConnectionId")
    public String uisSubConnectionId;

    public static CreateSubConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubConnectionResponseBody self = new CreateSubConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSubConnectionResponseBody setUisSubConnectionId(String uisSubConnectionId) {
        this.uisSubConnectionId = uisSubConnectionId;
        return this;
    }
    public String getUisSubConnectionId() {
        return this.uisSubConnectionId;
    }

}
