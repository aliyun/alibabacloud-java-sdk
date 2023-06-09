// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifySecondRankRequest extends TeaModel {
    @NameInMap("body")
    public SecondRank body;

    /**
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static ModifySecondRankRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecondRankRequest self = new ModifySecondRankRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecondRankRequest setBody(SecondRank body) {
        this.body = body;
        return this;
    }
    public SecondRank getBody() {
        return this.body;
    }

    public ModifySecondRankRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
