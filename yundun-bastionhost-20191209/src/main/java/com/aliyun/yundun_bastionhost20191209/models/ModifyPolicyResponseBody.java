// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyPolicyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A34F9731-A4EA-5D1D-8445-BAEF782BFFE6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyResponseBody self = new ModifyPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
