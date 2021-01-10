// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryLinkeBahamutAntflowtaskRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("Stage")
    public String stage;

    public static BatchqueryLinkeBahamutAntflowtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryLinkeBahamutAntflowtaskRequest self = new BatchqueryLinkeBahamutAntflowtaskRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryLinkeBahamutAntflowtaskRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public BatchqueryLinkeBahamutAntflowtaskRequest setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

}
