// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class DeleteFeatureEntityResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E23EFF09-58AA-5420-934F-8453AE01548D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFeatureEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFeatureEntityResponseBody self = new DeleteFeatureEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFeatureEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
