// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationAgentRelationResponseBody extends TeaModel {
    /**
     * <p>The ID of the Squad application.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD3FA5F3-FAF3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateApplicationAgentRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationAgentRelationResponseBody self = new CreateApplicationAgentRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationAgentRelationResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateApplicationAgentRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
