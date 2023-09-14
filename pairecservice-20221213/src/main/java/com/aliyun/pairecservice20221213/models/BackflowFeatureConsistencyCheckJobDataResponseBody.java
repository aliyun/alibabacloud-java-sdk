// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class BackflowFeatureConsistencyCheckJobDataResponseBody extends TeaModel {
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
