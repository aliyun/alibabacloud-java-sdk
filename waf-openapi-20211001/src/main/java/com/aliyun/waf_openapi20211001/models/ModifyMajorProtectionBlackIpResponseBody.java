// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyMajorProtectionBlackIpResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMajorProtectionBlackIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMajorProtectionBlackIpResponseBody self = new ModifyMajorProtectionBlackIpResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMajorProtectionBlackIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
