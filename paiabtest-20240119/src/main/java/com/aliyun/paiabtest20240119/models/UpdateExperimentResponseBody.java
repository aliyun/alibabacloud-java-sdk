// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateExperimentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentResponseBody self = new UpdateExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
