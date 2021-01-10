// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyTTSConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyTTSConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTTSConfigResponseBody self = new ModifyTTSConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTTSConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
