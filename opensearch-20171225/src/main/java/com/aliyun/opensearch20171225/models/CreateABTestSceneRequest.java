// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestSceneRequest extends TeaModel {
    @NameInMap("body")
    public ABTestScene body;

    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateABTestSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestSceneRequest self = new CreateABTestSceneRequest();
        return TeaModel.build(map, self);
    }

    public CreateABTestSceneRequest setBody(ABTestScene body) {
        this.body = body;
        return this;
    }
    public ABTestScene getBody() {
        return this.body;
    }

    public CreateABTestSceneRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
