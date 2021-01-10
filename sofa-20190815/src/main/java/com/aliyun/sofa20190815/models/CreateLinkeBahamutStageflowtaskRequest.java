// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutStageflowtaskRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("TaskKey")
    public String taskKey;

    @NameInMap("UnitId")
    public String unitId;

    public static CreateLinkeBahamutStageflowtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutStageflowtaskRequest self = new CreateLinkeBahamutStageflowtaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutStageflowtaskRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public CreateLinkeBahamutStageflowtaskRequest setTaskKey(String taskKey) {
        this.taskKey = taskKey;
        return this;
    }
    public String getTaskKey() {
        return this.taskKey;
    }

    public CreateLinkeBahamutStageflowtaskRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

}
