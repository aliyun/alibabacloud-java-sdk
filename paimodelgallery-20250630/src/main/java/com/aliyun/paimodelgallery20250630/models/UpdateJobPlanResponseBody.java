// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class UpdateJobPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateJobPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobPlanResponseBody self = new UpdateJobPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateJobPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
