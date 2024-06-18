// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>17F57FEE-EA4F-4337-8D2E-9C23CAA63D74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyAccountDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionResponseBody self = new ModifyAccountDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyAccountDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
