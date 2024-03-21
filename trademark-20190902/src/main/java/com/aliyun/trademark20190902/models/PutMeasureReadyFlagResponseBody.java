// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class PutMeasureReadyFlagResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static PutMeasureReadyFlagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutMeasureReadyFlagResponseBody self = new PutMeasureReadyFlagResponseBody();
        return TeaModel.build(map, self);
    }

    public PutMeasureReadyFlagResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public PutMeasureReadyFlagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
