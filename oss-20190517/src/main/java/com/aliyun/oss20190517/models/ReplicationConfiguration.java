// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ReplicationConfiguration extends TeaModel {
    @NameInMap("Rule")
    public ReplicationRule rule;

    public static ReplicationConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ReplicationConfiguration self = new ReplicationConfiguration();
        return TeaModel.build(map, self);
    }

    public ReplicationConfiguration setRule(ReplicationRule rule) {
        this.rule = rule;
        return this;
    }
    public ReplicationRule getRule() {
        return this.rule;
    }

}
