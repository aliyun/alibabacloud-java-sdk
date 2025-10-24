// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateMajorProtectionBlackIpV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMajorProtectionBlackIpV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMajorProtectionBlackIpV2ResponseBody self = new CreateMajorProtectionBlackIpV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMajorProtectionBlackIpV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
