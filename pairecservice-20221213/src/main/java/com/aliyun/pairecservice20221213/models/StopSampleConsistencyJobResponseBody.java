// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StopSampleConsistencyJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopSampleConsistencyJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopSampleConsistencyJobResponseBody self = new StopSampleConsistencyJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StopSampleConsistencyJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
