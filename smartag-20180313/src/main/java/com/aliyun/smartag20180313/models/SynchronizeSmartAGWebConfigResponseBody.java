// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class SynchronizeSmartAGWebConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SynchronizeSmartAGWebConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SynchronizeSmartAGWebConfigResponseBody self = new SynchronizeSmartAGWebConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SynchronizeSmartAGWebConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
