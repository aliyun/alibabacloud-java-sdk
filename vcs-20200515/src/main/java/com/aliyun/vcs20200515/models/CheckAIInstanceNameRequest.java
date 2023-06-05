// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CheckAIInstanceNameRequest extends TeaModel {
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("ProjectId")
    public String projectId;

    public static CheckAIInstanceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAIInstanceNameRequest self = new CheckAIInstanceNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckAIInstanceNameRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CheckAIInstanceNameRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CheckAIInstanceNameRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
