// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class DeleteUisNodeIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUisNodeIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUisNodeIpResponseBody self = new DeleteUisNodeIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUisNodeIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
