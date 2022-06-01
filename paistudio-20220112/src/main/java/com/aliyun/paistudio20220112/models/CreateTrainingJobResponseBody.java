// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateTrainingJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrainingJobId")
    public String trainingJobId;

    public static CreateTrainingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainingJobResponseBody self = new CreateTrainingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTrainingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTrainingJobResponseBody setTrainingJobId(String trainingJobId) {
        this.trainingJobId = trainingJobId;
        return this;
    }
    public String getTrainingJobId() {
        return this.trainingJobId;
    }

}
