// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateExperimentVersionResponseBody extends TeaModel {
    @NameInMap("ExperimentVersionId")
    public String experimentVersionId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateExperimentVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentVersionResponseBody self = new CreateExperimentVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExperimentVersionResponseBody setExperimentVersionId(String experimentVersionId) {
        this.experimentVersionId = experimentVersionId;
        return this;
    }
    public String getExperimentVersionId() {
        return this.experimentVersionId;
    }

    public CreateExperimentVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
