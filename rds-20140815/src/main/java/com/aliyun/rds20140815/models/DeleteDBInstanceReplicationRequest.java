// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceReplicationRequest extends TeaModel {
    /**
     * <p>The name of the replication channel, used to identify the replication link.</p>
     * 
     * <strong>example:</strong>
     * <p>replication-channel-001</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>Instance ID. You can invoke DescribeDBInstances to obtain it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1234567890abcdef</p>
     */
    @NameInMap("DbInstanceId")
    public String dbInstanceId;

    /**
     * <p>阿里云账号ID，用于指定资源的所有者</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Region ID. You can invoke DescribeRegions to obtain it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteDBInstanceReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceReplicationRequest self = new DeleteDBInstanceReplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceReplicationRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public DeleteDBInstanceReplicationRequest setDbInstanceId(String dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
        return this;
    }
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    public DeleteDBInstanceReplicationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteDBInstanceReplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
