// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateSecondRankRequest extends TeaModel {
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateSecondRankRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecondRankRequest self = new CreateSecondRankRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecondRankRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
