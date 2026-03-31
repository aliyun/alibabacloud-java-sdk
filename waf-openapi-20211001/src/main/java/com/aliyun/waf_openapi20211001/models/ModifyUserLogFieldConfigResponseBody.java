// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyUserLogFieldConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E2D63742-9BAA-*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUserLogFieldConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserLogFieldConfigResponseBody self = new ModifyUserLogFieldConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUserLogFieldConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
