// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class RejectOperationTicketRequest extends TeaModel {
    /**
     * <p>The ID of the bastion host.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the O\&M application that you want to reject. You can call the ListOperationTickets operation to query the IDs of all O\&M applications that require review.</p>
     */
    @NameInMap("OperationTicketId")
    public String operationTicketId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
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
