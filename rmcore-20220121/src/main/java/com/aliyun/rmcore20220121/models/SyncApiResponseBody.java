// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class SyncApiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SyncApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncApiResponseBody self = new SyncApiResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
