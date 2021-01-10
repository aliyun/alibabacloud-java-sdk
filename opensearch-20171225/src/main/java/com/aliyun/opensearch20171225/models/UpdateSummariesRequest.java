// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateSummariesRequest extends TeaModel {
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static UpdateSummariesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSummariesRequest self = new UpdateSummariesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSummariesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
