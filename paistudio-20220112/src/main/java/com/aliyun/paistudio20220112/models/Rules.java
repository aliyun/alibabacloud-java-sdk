// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class Rules extends TeaModel {
    @NameInMap("Scheduling")
    public SchedulingRule scheduling;

    public static Rules build(java.util.Map<String, ?> map) throws Exception {
        Rules self = new Rules();
        return TeaModel.build(map, self);
    }

    public Rules setScheduling(SchedulingRule scheduling) {
        this.scheduling = scheduling;
        return this;
    }
    public SchedulingRule getScheduling() {
        return this.scheduling;
    }

}
