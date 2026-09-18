// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class UpdateJobPlanResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82-9624-EC2B1779848E</p>
     */
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
