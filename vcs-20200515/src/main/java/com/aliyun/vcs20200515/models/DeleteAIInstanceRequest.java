// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteAIInstanceRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    public static DeleteAIInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIInstanceRequest self = new DeleteAIInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAIInstanceRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
