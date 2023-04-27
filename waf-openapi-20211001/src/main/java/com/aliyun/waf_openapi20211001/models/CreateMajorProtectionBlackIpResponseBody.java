// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateMajorProtectionBlackIpResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMajorProtectionBlackIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMajorProtectionBlackIpResponseBody self = new CreateMajorProtectionBlackIpResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMajorProtectionBlackIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
