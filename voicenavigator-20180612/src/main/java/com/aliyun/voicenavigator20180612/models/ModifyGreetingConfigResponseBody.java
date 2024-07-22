// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyGreetingConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyGreetingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyGreetingConfigResponseBody self = new ModifyGreetingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyGreetingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
