// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CreateExperimentMigrateValidationResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateExperimentMigrateValidationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentMigrateValidationResponseBody self = new CreateExperimentMigrateValidationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExperimentMigrateValidationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
