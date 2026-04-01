// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyHADiagnoseConfigRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The availability check method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>SHORT</strong>: Alibaba Cloud uses short-lived connections to check the availability of the instance.</li>
     * <li><strong>LONG</strong>: Alibaba Cloud uses persistent connections to check the availability of the instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SHORT</p>
     */
    @NameInMap("TcpConnectionType")
    public String tcpConnectionType;

    public static ModifyHADiagnoseConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHADiagnoseConfigRequest self = new ModifyHADiagnoseConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHADiagnoseConfigRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyHADiagnoseConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyHADiagnoseConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyHADiagnoseConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyHADiagnoseConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyHADiagnoseConfigRequest setTcpConnectionType(String tcpConnectionType) {
        this.tcpConnectionType = tcpConnectionType;
        return this;
    }
    public String getTcpConnectionType() {
        return this.tcpConnectionType;
    }

}
