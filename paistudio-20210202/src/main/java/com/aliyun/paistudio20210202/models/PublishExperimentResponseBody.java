// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class PublishExperimentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A26A7FA-EEF0-5A6B-BA76-06067547C11F</p>
     */
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
