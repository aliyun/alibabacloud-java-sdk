// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateTSJobGroupRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    public static UpdateTSJobGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTSJobGroupRequest self = new UpdateTSJobGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTSJobGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTSJobGroupRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public UpdateTSJobGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTSJobGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
