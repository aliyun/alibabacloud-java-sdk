// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyDatabaseInstanceParameterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDatabaseInstanceParameterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseInstanceParameterResponseBody self = new ModifyDatabaseInstanceParameterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseInstanceParameterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
