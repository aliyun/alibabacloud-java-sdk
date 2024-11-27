// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyApprovalConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
     */
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
