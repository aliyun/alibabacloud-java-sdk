// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateUisNodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UisNodeId")
    public String uisNodeId;

    public static CreateUisNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUisNodeResponseBody self = new CreateUisNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUisNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUisNodeResponseBody setUisNodeId(String uisNodeId) {
        this.uisNodeId = uisNodeId;
        return this;
    }
    public String getUisNodeId() {
        return this.uisNodeId;
    }

}
