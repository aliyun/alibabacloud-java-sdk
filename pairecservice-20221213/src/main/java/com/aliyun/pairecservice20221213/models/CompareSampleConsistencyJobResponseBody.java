// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CompareSampleConsistencyJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CompareSampleConsistencyJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompareSampleConsistencyJobResponseBody self = new CompareSampleConsistencyJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CompareSampleConsistencyJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
