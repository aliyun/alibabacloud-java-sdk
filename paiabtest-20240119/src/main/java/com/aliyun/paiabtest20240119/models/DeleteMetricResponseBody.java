// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class DeleteMetricResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricResponseBody self = new DeleteMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
