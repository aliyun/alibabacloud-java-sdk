// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>776C5EC4-7714-5E40-AD5C-51F7C472A68E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRCInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceAttributeResponseBody self = new ModifyRCInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
