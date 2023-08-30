// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyDatabaseInstanceDescriptionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDatabaseInstanceDescriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseInstanceDescriptionResponseBody self = new ModifyDatabaseInstanceDescriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseInstanceDescriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
