// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyFirstRankRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public FirstRank body;

    /**
     * <p>Specifies whether the request is a dry run.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static ModifyFirstRankRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFirstRankRequest self = new ModifyFirstRankRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFirstRankRequest setBody(FirstRank body) {
        this.body = body;
        return this;
    }
    public FirstRank getBody() {
        return this.body;
    }

    public ModifyFirstRankRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
