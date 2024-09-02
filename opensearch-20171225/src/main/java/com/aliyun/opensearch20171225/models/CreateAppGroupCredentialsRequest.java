// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppGroupCredentialsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>api-token</p>
     */
    @NameInMap("type")
    public String type;

    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateAppGroupCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupCredentialsRequest self = new CreateAppGroupCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupCredentialsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateAppGroupCredentialsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
