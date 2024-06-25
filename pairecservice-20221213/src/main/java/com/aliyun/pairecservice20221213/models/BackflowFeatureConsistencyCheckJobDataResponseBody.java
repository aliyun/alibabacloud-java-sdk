// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class BackflowFeatureConsistencyCheckJobDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BDB621CB-A81E-5D39-8793-39A365CBCC74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BackflowFeatureConsistencyCheckJobDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BackflowFeatureConsistencyCheckJobDataResponseBody self = new BackflowFeatureConsistencyCheckJobDataResponseBody();
        return TeaModel.build(map, self);
    }

    public BackflowFeatureConsistencyCheckJobDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
