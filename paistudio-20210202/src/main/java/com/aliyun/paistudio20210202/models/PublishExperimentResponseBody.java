// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class PublishExperimentResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static PublishExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishExperimentResponseBody self = new PublishExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
