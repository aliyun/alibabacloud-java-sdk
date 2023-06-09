// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateSecondRankRequest extends TeaModel {
    @NameInMap("body")
    public SecondRank body;

    /**
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateSecondRankRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecondRankRequest self = new CreateSecondRankRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecondRankRequest setBody(SecondRank body) {
        this.body = body;
        return this;
    }
    public SecondRank getBody() {
        return this.body;
    }

    public CreateSecondRankRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
