// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutStagetaskRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("TaskKey")
    public String taskKey;

    @NameInMap("UnitId")
    public String unitId;

    public static CreateLinkeBahamutStagetaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutStagetaskRequest self = new CreateLinkeBahamutStagetaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutStagetaskRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public CreateLinkeBahamutStagetaskRequest setTaskKey(String taskKey) {
        this.taskKey = taskKey;
        return this;
    }
    public String getTaskKey() {
        return this.taskKey;
    }

    public CreateLinkeBahamutStagetaskRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
