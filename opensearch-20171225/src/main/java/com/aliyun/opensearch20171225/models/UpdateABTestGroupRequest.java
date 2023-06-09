// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestGroupRequest extends TeaModel {
    @NameInMap("body")
    public ABTestGroup body;

    @NameInMap("dryRun")
    public Boolean dryRun;

    public static UpdateABTestGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateABTestGroupRequest self = new UpdateABTestGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateABTestGroupRequest setBody(ABTestGroup body) {
        this.body = body;
        return this;
    }
    public ABTestGroup getBody() {
        return this.body;
    }

    public UpdateABTestGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
