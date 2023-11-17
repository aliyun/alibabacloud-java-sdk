// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class VerifyPlaybookRequest extends TeaModel {
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    @NameInMap("TaskFlow")
    public String taskFlow;

    public static VerifyPlaybookRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyPlaybookRequest self = new VerifyPlaybookRequest();
        return TeaModel.build(map, self);
    }

    public VerifyPlaybookRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public VerifyPlaybookRequest setTaskFlow(String taskFlow) {
        this.taskFlow = taskFlow;
        return this;
    }
    public String getTaskFlow() {
        return this.taskFlow;
    }

}
