// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AcceptApproveCommandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AcceptApproveCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AcceptApproveCommandResponseBody self = new AcceptApproveCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public AcceptApproveCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
