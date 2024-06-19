// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyGlobalSecurityIPGroupRelationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1E83311F-0EE4-4922-A3BF-730B312B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyGlobalSecurityIPGroupRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGlobalSecurityIPGroupRelationResponseBody self = new ModifyGlobalSecurityIPGroupRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGlobalSecurityIPGroupRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
