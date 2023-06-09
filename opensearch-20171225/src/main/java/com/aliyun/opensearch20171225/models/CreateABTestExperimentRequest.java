// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestExperimentRequest extends TeaModel {
    @NameInMap("body")
    public ABTestExperiment body;

    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateABTestExperimentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestExperimentRequest self = new CreateABTestExperimentRequest();
        return TeaModel.build(map, self);
    }

    public CreateABTestExperimentRequest setBody(ABTestExperiment body) {
        this.body = body;
        return this;
    }
    public ABTestExperiment getBody() {
        return this.body;
    }

    public CreateABTestExperimentRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
