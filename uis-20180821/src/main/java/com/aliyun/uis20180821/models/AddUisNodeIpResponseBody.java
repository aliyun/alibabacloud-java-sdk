// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class AddUisNodeIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddUisNodeIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddUisNodeIpResponseBody self = new AddUisNodeIpResponseBody();
        return TeaModel.build(map, self);
    }

    public AddUisNodeIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
