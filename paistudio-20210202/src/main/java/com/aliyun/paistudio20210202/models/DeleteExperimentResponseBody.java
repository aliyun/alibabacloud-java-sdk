// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class DeleteExperimentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2ABF5D32-C9EE-55AE-92EE-DB08E8988AD3</p>
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
