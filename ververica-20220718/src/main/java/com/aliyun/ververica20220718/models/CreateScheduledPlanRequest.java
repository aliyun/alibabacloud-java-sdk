// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateScheduledPlanRequest extends TeaModel {
    @NameInMap("body")
    public ScheduledPlan body;

    public static CreateScheduledPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledPlanRequest self = new CreateScheduledPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduledPlanRequest setBody(ScheduledPlan body) {
        this.body = body;
        return this;
    }
    public ScheduledPlan getBody() {
        return this.body;
    }

}
