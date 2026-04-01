// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyHASwitchConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6AE1448-D846-4831-B1C7-CFF3E99D5470</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHASwitchConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHASwitchConfigResponseBody self = new ModifyHASwitchConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHASwitchConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
