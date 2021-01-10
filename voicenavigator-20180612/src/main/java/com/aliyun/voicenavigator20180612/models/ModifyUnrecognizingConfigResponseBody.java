// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifyUnrecognizingConfigResponseBody extends TeaModel {
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
