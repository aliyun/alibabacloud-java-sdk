// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class SyncApiRamMetaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SyncApiRamMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncApiRamMetaResponseBody self = new SyncApiRamMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncApiRamMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
