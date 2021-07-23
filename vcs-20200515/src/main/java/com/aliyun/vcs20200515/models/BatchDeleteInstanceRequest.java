// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class BatchDeleteInstanceRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.Map<String, ?> instanceIds;

    @NameInMap("ProjectId")
    public String projectId;

    public static BatchDeleteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteInstanceRequest self = new BatchDeleteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteInstanceRequest setInstanceIds(java.util.Map<String, ?> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.Map<String, ?> getInstanceIds() {
        return this.instanceIds;
    }

    public BatchDeleteInstanceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
