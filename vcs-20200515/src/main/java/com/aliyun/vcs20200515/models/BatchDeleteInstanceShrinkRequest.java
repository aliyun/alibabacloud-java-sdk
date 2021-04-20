// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class BatchDeleteInstanceShrinkRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    @NameInMap("ProjectId")
    public String projectId;

    public static BatchDeleteInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteInstanceShrinkRequest self = new BatchDeleteInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteInstanceShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public BatchDeleteInstanceShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
