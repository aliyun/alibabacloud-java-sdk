// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyMPULayoutResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMPULayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMPULayoutResponseBody self = new ModifyMPULayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMPULayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
