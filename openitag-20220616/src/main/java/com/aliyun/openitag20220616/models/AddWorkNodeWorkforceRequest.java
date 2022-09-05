// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class AddWorkNodeWorkforceRequest extends TeaModel {
    @NameInMap("UserIds")
    public java.util.List<Long> userIds;

    public static AddWorkNodeWorkforceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWorkNodeWorkforceRequest self = new AddWorkNodeWorkforceRequest();
        return TeaModel.build(map, self);
    }

    public AddWorkNodeWorkforceRequest setUserIds(java.util.List<Long> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<Long> getUserIds() {
        return this.userIds;
    }

}
