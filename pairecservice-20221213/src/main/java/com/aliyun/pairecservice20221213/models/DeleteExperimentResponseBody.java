// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteExperimentResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2A734D87-2212-5C84-B63A-1AC87CA843D4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentResponseBody self = new DeleteExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
