// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestSceneRequest extends TeaModel {
    @NameInMap("body")
    public ABTestScene body;

    @NameInMap("dryRun")
    public Boolean dryRun;

    public static UpdateABTestSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateABTestSceneRequest self = new UpdateABTestSceneRequest();
        return TeaModel.build(map, self);
    }

    public UpdateABTestSceneRequest setBody(ABTestScene body) {
        this.body = body;
        return this;
    }
    public ABTestScene getBody() {
        return this.body;
    }

    public UpdateABTestSceneRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
