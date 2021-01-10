// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyFirstRankRequest extends TeaModel {
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static ModifyFirstRankRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirstRankRequest self = new ModifyFirstRankRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFirstRankRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
