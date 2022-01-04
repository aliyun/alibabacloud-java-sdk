// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class CreateExperimentMigrateValidationRequest extends TeaModel {
    @NameInMap("SourceExpId")
    public Long sourceExpId;

    public static CreateExperimentMigrateValidationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentMigrateValidationRequest self = new CreateExperimentMigrateValidationRequest();
        return TeaModel.build(map, self);
    }

    public CreateExperimentMigrateValidationRequest setSourceExpId(Long sourceExpId) {
        this.sourceExpId = sourceExpId;
        return this;
    }
    public Long getSourceExpId() {
        return this.sourceExpId;
    }

}
