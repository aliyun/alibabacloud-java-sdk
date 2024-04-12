// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyAssetScopeResponseBody extends TeaModel {
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
