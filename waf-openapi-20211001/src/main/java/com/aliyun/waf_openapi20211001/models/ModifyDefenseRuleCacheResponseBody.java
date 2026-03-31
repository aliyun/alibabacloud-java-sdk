// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseRuleCacheResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A0F2B994-8645-5270-A05D-9DAD8C****B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDefenseRuleCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseRuleCacheResponseBody self = new ModifyDefenseRuleCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseRuleCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
