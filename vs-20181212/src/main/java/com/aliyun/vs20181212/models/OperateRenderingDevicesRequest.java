// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class OperateRenderingDevicesRequest extends TeaModel {
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PodId")
    public String podId;

    public static OperateRenderingDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateRenderingDevicesRequest self = new OperateRenderingDevicesRequest();
        return TeaModel.build(map, self);
    }

    public OperateRenderingDevicesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public OperateRenderingDevicesRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public OperateRenderingDevicesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public OperateRenderingDevicesRequest setPodId(String podId) {
        this.podId = podId;
        return this;
    }
    public String getPodId() {
        return this.podId;
    }

}
