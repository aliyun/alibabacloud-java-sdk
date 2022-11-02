// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ClearMajorProtectionBlackIpResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ClearMajorProtectionBlackIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearMajorProtectionBlackIpResponseBody self = new ClearMajorProtectionBlackIpResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearMajorProtectionBlackIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
