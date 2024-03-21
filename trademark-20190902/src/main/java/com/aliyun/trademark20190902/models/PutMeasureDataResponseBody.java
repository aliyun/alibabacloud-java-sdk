// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class PutMeasureDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static PutMeasureDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutMeasureDataResponseBody self = new PutMeasureDataResponseBody();
        return TeaModel.build(map, self);
    }

    public PutMeasureDataResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public PutMeasureDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
