// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyAssetScopeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5EAB922E-F476-5DFA-9290-313C608E724B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetPolicyAssetScopeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyAssetScopeResponseBody self = new SetPolicyAssetScopeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetPolicyAssetScopeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
