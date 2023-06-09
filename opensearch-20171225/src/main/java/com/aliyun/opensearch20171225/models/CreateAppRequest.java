// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
    @NameInMap("body")
    public App body;

    /**
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRequest self = new CreateAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRequest setBody(App body) {
        this.body = body;
        return this;
    }
    public App getBody() {
        return this.body;
    }

    public CreateAppRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
