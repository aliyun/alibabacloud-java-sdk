// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDasInstanceConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDasInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDasInstanceConfigResponseBody self = new ModifyDasInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDasInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
