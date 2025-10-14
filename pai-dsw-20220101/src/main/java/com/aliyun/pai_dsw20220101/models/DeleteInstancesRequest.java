// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class DeleteInstancesRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static DeleteInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstancesRequest self = new DeleteInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstancesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
