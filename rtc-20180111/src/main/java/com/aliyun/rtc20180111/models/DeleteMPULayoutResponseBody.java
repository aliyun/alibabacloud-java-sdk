// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteMPULayoutResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMPULayoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMPULayoutResponseBody self = new DeleteMPULayoutResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMPULayoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
