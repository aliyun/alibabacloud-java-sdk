// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateABMetricResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6CF1E160-3F36-5E73-A170-C75504F05BBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateABMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateABMetricResponseBody self = new UpdateABMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateABMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
