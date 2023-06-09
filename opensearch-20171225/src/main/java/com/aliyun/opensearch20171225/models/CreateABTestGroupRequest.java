// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateABTestGroupRequest extends TeaModel {
    @NameInMap("body")
    public ABTestGroup body;

    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateABTestGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateABTestGroupRequest self = new CreateABTestGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateABTestGroupRequest setBody(ABTestGroup body) {
        this.body = body;
        return this;
    }
    public ABTestGroup getBody() {
        return this.body;
    }

    public CreateABTestGroupRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
