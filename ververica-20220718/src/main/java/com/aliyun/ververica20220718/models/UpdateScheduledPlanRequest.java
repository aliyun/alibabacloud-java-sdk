// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateScheduledPlanRequest extends TeaModel {
    @NameInMap("body")
    public ScheduledPlan body;

    public static UpdateScheduledPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScheduledPlanRequest self = new UpdateScheduledPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScheduledPlanRequest setBody(ScheduledPlan body) {
        this.body = body;
        return this;
    }
    public ScheduledPlan getBody() {
        return this.body;
    }

}
