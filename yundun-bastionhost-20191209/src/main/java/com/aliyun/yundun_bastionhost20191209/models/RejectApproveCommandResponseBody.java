// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RejectApproveCommandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RejectApproveCommandResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RejectApproveCommandResponseBody self = new RejectApproveCommandResponseBody();
        return TeaModel.build(map, self);
    }

    public RejectApproveCommandResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
