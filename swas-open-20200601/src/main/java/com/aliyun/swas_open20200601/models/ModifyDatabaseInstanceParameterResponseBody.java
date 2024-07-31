// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyDatabaseInstanceParameterResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
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
