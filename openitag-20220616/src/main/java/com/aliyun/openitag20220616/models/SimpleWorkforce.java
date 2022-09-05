// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class SimpleWorkforce extends TeaModel {
    @NameInMap("UserIds")
    public java.util.List<Long> userIds;

    @NameInMap("WorkNodeId")
    public Integer workNodeId;

    public static SimpleWorkforce build(java.util.Map<String, ?> map) throws Exception {
        SimpleWorkforce self = new SimpleWorkforce();
        return TeaModel.build(map, self);
    }

    public SimpleWorkforce setUserIds(java.util.List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

    public SimpleWorkforce setWorkNodeId(Integer workNodeId) {
        this.workNodeId = workNodeId;
        return this;
    }
    public Integer getWorkNodeId() {
        return this.workNodeId;
    }

}
