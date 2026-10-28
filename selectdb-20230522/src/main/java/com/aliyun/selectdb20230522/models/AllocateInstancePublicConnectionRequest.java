// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class AllocateInstancePublicConnectionRequest extends TeaModel {
    /**
     * <p>The prefix of the target endpoint, which is the prefix of the <strong>ConnectionString</strong> parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-h033cn****-pub-i3</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The network type of the new endpoint. Set the value to Public.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AllocateInstancePublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateInstancePublicConnectionRequest self = new AllocateInstancePublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public AllocateInstancePublicConnectionRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public AllocateInstancePublicConnectionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public AllocateInstancePublicConnectionRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public AllocateInstancePublicConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateInstancePublicConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
