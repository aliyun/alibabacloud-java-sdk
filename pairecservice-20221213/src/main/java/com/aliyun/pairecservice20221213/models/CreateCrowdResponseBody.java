// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateCrowdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CrowdId")
    public String crowdId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>59CE7EC6-F268-5D71-9215-32922CC50D72</p>
     */
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
