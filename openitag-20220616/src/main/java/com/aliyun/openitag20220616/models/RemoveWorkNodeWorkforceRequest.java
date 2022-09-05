// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class RemoveWorkNodeWorkforceRequest extends TeaModel {
    @NameInMap("UserIds")
    public java.util.List<Long> userIds;

    public static RemoveWorkNodeWorkforceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveWorkNodeWorkforceRequest self = new RemoveWorkNodeWorkforceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveWorkNodeWorkforceRequest setUserIds(java.util.List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

}
