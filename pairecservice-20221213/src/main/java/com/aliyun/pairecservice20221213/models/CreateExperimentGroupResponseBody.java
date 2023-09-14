// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateExperimentGroupResponseBody extends TeaModel {
    @NameInMap("ExperimentGroupId")
    public String experimentGroupId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateExperimentGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentGroupResponseBody self = new CreateExperimentGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExperimentGroupResponseBody setExperimentGroupId(String experimentGroupId) {
        this.experimentGroupId = experimentGroupId;
        return this;
    }
    public String getExperimentGroupId() {
        return this.experimentGroupId;
    }

    public CreateExperimentGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
