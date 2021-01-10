// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationunitjarhistrorysummaryRequest extends TeaModel {
    @NameInMap("PublishJarEnv")
    public String publishJarEnv;

    @NameInMap("UnitStageId")
    public String unitStageId;

    public static GetLinkeBahamutIterationunitjarhistrorysummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationunitjarhistrorysummaryRequest self = new GetLinkeBahamutIterationunitjarhistrorysummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationunitjarhistrorysummaryRequest setPublishJarEnv(String publishJarEnv) {
        this.publishJarEnv = publishJarEnv;
        return this;
    }
    public String getPublishJarEnv() {
        return this.publishJarEnv;
    }

    public GetLinkeBahamutIterationunitjarhistrorysummaryRequest setUnitStageId(String unitStageId) {
        this.unitStageId = unitStageId;
        return this;
    }
    public String getUnitStageId() {
        return this.unitStageId;
    }

}
