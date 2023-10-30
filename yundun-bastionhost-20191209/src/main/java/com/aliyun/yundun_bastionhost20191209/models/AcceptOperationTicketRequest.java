// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AcceptOperationTicketRequest extends TeaModel {
    /**
     * <p>The maximum number of logons allowed. Valid values:</p>
     * <br>
     * <p>*   0: The number of logons is unlimited. The O\&M engineer can log on to the specified asset for an unlimited number of times during the validity period.</p>
     * <p>*   1: The O\&M engineer can log on to the specified asset only once during the validity period.</p>
     * <br>
     * <p>>  You can set this parameter only to 0 if you review an O\&M application on a database.</p>
     */
    @NameInMap("EffectCount")
    public String effectCount;

    /**
     * <p>The end time of the validity period. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("EffectEndTime")
    public String effectEndTime;

    /**
     * <p>The start time of the validity period. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("EffectStartTime")
    public String effectStartTime;

    /**
     * <p>The ID of the bastion host.</p>
     * <br>
     * <p>> You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the O\&M application that you want to approve. You can call the ListOperationTickets operation to query the IDs of all O\&M applications that require review.</p>
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

    public static AcceptOperationTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptOperationTicketRequest self = new AcceptOperationTicketRequest();
        return TeaModel.build(map, self);
    }

    public AcceptOperationTicketRequest setEffectCount(String effectCount) {
        this.effectCount = effectCount;
        return this;
    }
    public String getEffectCount() {
        return this.effectCount;
    }

    public AcceptOperationTicketRequest setEffectEndTime(String effectEndTime) {
        this.effectEndTime = effectEndTime;
        return this;
    }
    public String getEffectEndTime() {
        return this.effectEndTime;
    }

    public AcceptOperationTicketRequest setEffectStartTime(String effectStartTime) {
        this.effectStartTime = effectStartTime;
        return this;
    }
    public String getEffectStartTime() {
        return this.effectStartTime;
    }

    public AcceptOperationTicketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AcceptOperationTicketRequest setOperationTicketId(String operationTicketId) {
        this.operationTicketId = operationTicketId;
        return this;
    }
    public String getOperationTicketId() {
        return this.operationTicketId;
    }

    public AcceptOperationTicketRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
