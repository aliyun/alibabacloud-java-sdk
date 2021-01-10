// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutCurrentcurrentpipelinesRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("StageId")
    public String stageId;

    public static QueryLinkeBahamutCurrentcurrentpipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutCurrentcurrentpipelinesRequest self = new QueryLinkeBahamutCurrentcurrentpipelinesRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutCurrentcurrentpipelinesRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public QueryLinkeBahamutCurrentcurrentpipelinesRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
