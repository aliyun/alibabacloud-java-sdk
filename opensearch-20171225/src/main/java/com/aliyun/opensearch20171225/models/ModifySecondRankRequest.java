// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifySecondRankRequest extends TeaModel {
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static ModifySecondRankRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecondRankRequest self = new ModifySecondRankRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecondRankRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
