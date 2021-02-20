// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class UpdateMPULayoutResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMPULayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMPULayoutResponseBody self = new UpdateMPULayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMPULayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
