// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ReplicationRules extends TeaModel {
    // the container of id
    @NameInMap("ID")
    public java.util.List<String> ids;

    public static ReplicationRules build(java.util.Map<String, ?> map) throws Exception {
        ReplicationRules self = new ReplicationRules();
        return TeaModel.build(map, self);
    }

    public ReplicationRules setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

}
