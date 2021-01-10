// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryrollbackLinkeBahamutWebapirecoveryinitinstanceRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("StageId")
    public String stageId;

    @NameInMap("Trigger")
    public String trigger;

    public static RetryrollbackLinkeBahamutWebapirecoveryinitinstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryrollbackLinkeBahamutWebapirecoveryinitinstanceRequest self = new RetryrollbackLinkeBahamutWebapirecoveryinitinstanceRequest();
        return TeaModel.build(map, self);
    }

    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceRequest setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }
    public String getTrigger() {
        return this.trigger;
    }

}
