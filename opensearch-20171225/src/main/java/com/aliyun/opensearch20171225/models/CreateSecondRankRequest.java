// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateSecondRankRequest extends TeaModel {
    /**
     * <p>The request body. For more information, see <a href="https://help.aliyun.com/document_detail/170008.html">SecondRank</a>.</p>
     */
    @NameInMap("body")
    public SecondRank body;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * 
     * <strong>example:</strong>
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
