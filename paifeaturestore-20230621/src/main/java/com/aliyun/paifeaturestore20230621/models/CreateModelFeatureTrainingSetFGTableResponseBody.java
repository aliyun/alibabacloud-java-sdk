// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CreateModelFeatureTrainingSetFGTableResponseBody extends TeaModel {
    @NameInMap("TrainingSetFGTableName")
    public String trainingSetFGTableName;

    @NameInMap("requestId")
    public String requestId;

    public static CreateModelFeatureTrainingSetFGTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelFeatureTrainingSetFGTableResponseBody self = new CreateModelFeatureTrainingSetFGTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelFeatureTrainingSetFGTableResponseBody setTrainingSetFGTableName(String trainingSetFGTableName) {
        this.trainingSetFGTableName = trainingSetFGTableName;
        return this;
    }
    public String getTrainingSetFGTableName() {
        return this.trainingSetFGTableName;
    }

    public CreateModelFeatureTrainingSetFGTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
