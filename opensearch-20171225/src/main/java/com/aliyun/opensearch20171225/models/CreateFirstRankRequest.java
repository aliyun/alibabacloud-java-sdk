// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateFirstRankRequest extends TeaModel {
    /**
     * <p>The request body that contains the parameters of the rough sort expression.</p>
     */
    @NameInMap("body")
    public FirstRank body;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static CreateFirstRankRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFirstRankRequest self = new CreateFirstRankRequest();
        return TeaModel.build(map, self);
    }

    public CreateFirstRankRequest setBody(FirstRank body) {
        this.body = body;
        return this;
    }
    public FirstRank getBody() {
        return this.body;
    }

    public CreateFirstRankRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
