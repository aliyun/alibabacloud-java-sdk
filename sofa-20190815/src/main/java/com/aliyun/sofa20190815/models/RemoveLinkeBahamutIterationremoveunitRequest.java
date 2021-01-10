// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeBahamutIterationremoveunitRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static RemoveLinkeBahamutIterationremoveunitRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeBahamutIterationremoveunitRequest self = new RemoveLinkeBahamutIterationremoveunitRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeBahamutIterationremoveunitRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public RemoveLinkeBahamutIterationremoveunitRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
