// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CutOverReplicationJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CutOverReplicationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CutOverReplicationJobResponseBody self = new CutOverReplicationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CutOverReplicationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
