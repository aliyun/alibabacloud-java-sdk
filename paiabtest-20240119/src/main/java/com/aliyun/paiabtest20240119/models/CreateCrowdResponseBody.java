// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateCrowdResponseBody extends TeaModel {
    @NameInMap("CrowdId")
    public String crowdId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCrowdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCrowdResponseBody self = new CreateCrowdResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCrowdResponseBody setCrowdId(String crowdId) {
        this.crowdId = crowdId;
        return this;
    }
    public String getCrowdId() {
        return this.crowdId;
    }

    public CreateCrowdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
