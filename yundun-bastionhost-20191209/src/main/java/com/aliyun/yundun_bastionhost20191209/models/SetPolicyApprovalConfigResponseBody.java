// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyApprovalConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetPolicyApprovalConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyApprovalConfigResponseBody self = new SetPolicyApprovalConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPolicyApprovalConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
