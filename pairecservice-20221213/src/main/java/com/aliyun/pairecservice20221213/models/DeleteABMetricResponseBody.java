// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteABMetricResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteABMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteABMetricResponseBody self = new DeleteABMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteABMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
