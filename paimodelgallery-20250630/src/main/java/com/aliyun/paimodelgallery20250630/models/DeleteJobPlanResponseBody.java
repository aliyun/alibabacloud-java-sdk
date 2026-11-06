// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class DeleteJobPlanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteJobPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobPlanResponseBody self = new DeleteJobPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteJobPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
