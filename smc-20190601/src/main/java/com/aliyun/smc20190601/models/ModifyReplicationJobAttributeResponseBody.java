// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class ModifyReplicationJobAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1C488B66-B819-4D14-8711-C4EAAA13AC01</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyReplicationJobAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyReplicationJobAttributeResponseBody self = new ModifyReplicationJobAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyReplicationJobAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
