// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class ModifySilenceTimeoutConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySilenceTimeoutConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySilenceTimeoutConfigResponseBody self = new ModifySilenceTimeoutConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySilenceTimeoutConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
