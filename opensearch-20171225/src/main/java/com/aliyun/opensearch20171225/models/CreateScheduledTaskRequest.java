// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateScheduledTaskRequest extends TeaModel {
    @NameInMap("body")
    public ScheduledTask body;

    public static CreateScheduledTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledTaskRequest self = new CreateScheduledTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduledTaskRequest setBody(ScheduledTask body) {
        this.body = body;
        return this;
    }
    public ScheduledTask getBody() {
        return this.body;
    }

}
