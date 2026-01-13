// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCDiskAttributeResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1E43AAE0-BEE8-43DA-860D-EAF2AA0724DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyRCDiskAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCDiskAttributeResponseBody self = new ModifyRCDiskAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyRCDiskAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
