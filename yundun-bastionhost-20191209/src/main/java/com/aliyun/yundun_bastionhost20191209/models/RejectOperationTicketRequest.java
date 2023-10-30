// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RejectOperationTicketRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OperationTicketId")
    public String operationTicketId;

    @NameInMap("RegionId")
    public String regionId;

    public static RejectOperationTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectOperationTicketRequest self = new RejectOperationTicketRequest();
        return TeaModel.build(map, self);
    }

    public RejectOperationTicketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RejectOperationTicketRequest setOperationTicketId(String operationTicketId) {
        this.operationTicketId = operationTicketId;
        return this;
    }
    public String getOperationTicketId() {
        return this.operationTicketId;
    }

    public RejectOperationTicketRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
