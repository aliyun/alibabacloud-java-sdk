// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyUnrecognizingConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyUnrecognizingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyUnrecognizingConfigResponseBody self = new ModifyUnrecognizingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyUnrecognizingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
