// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMqSofamqRouterRequest extends TeaModel {
    @NameInMap("CurrentStatus")
    public Long currentStatus;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RouterId")
    public Long routerId;

    @NameInMap("TargetStatus")
    public Long targetStatus;

    public static UpdateMqSofamqRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMqSofamqRouterRequest self = new UpdateMqSofamqRouterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMqSofamqRouterRequest setCurrentStatus(Long currentStatus) {
        this.currentStatus = currentStatus;
        return this;
    }
    public Long getCurrentStatus() {
        return this.currentStatus;
    }

    public UpdateMqSofamqRouterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMqSofamqRouterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMqSofamqRouterRequest setRouterId(Long routerId) {
        this.routerId = routerId;
        return this;
    }
    public Long getRouterId() {
        return this.routerId;
    }

    public UpdateMqSofamqRouterRequest setTargetStatus(Long targetStatus) {
        this.targetStatus = targetStatus;
        return this;
    }
    public Long getTargetStatus() {
        return this.targetStatus;
    }

}
